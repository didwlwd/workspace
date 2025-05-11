package com.kh.board.controller;

import com.kh.board.controller.dto.request.BoardRequset;
import com.kh.board.controller.dto.response.BoardResponse;
import com.kh.board.entity.Board;
import com.kh.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    //게시글목록을 가져오는 api
    @GetMapping
    public ResponseEntity<List<BoardResponse.SimpleDTO>> getBoardList() {
        List<Board> boardList = boardService.findAll();

        List<BoardResponse.SimpleDTO> result = new ArrayList<>();
        for(Board board : boardList){

            result.add(BoardResponse.SimpleDTO.formEntity(board));
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    //게시글을 등록하는 api
    @PostMapping
    public ResponseEntity<?> insertBoard(Board board, String userId ,MultipartFile upfile) {
        int boardCount = boardService.boardCount();
        int count = boardCount + 1;
        Long boardId = Long.valueOf(count);

        board.changeFileName(upfile.getOriginalFilename());
        board.changeMemberEmail(userId);

        String file = upfile.getOriginalFilename();
        BoardRequset.CreateDTO dto = BoardRequset.CreateDTO.insert(board, boardId,file);

        int result = boardService.insertBoard(dto);

        if (result > 0) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //게시글 상세보기 페이지
    @GetMapping("/detail/{boardId}")
    public ResponseEntity<BoardResponse.SimpleDTO> getBoard(@PathVariable int boardId) {
        Board board = boardService.loadBoard(boardId);

        BoardResponse.SimpleDTO dto = BoardResponse.SimpleDTO.form(board);

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
