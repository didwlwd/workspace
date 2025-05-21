package com.kh.jpa.controller;

import com.kh.jpa.dto.BoardDto;
import com.kh.jpa.dto.PageResponse;
import com.kh.jpa.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/boards")
public class BoardController {
    private final BoardService boardService;

    /*
    page 보고자하는 페이지 번호
    size 몇개씩 가지고 올것인지
    sort 정렬 기준 : 속성, 방향(boardTitle, desc)
     */
    @GetMapping
    public ResponseEntity<PageResponse<BoardDto.Response>> getAllBoards(
            @PageableDefault(size = 5, sort = "createDate", direction = Sort.Direction.DESC)
            Pageable pageable) {

        return ResponseEntity.ok(new PageResponse<>(boardService.findAllBoards(pageable))) ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoardDto.Response> getByIdBoard(@PathVariable Long id) {
        return ResponseEntity.ok(boardService.findByIdBoard(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteByIdBoard(@PathVariable Long id) {
        boardService.deleteByIdBoard(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Long> createBoard(@ModelAttribute BoardDto.Create boardCreate) throws Exception {
        return ResponseEntity.ok(boardService.createBoard(boardCreate));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<BoardDto.Response> updateBoard(
            @PathVariable("id") Long boardNo,
            @ModelAttribute BoardDto.Update updateBoard
    ) throws IOException {
        return ResponseEntity.ok(boardService.updateBoard(boardNo, updateBoard));
    }

}
