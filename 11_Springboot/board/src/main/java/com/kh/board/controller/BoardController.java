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

import java.io.File;
import java.io.IOException;
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
    public ResponseEntity<String> insertBoard(BoardRequset.CreateDTO request, MultipartFile upfile) throws IOException {


        if(request == null || request.getUser_id() == null){
            throw new RuntimeException("check value");
        }

        if(!upfile.isEmpty()){
            File file = new File("C:\\Users\\user1\\Desktop\\workspace\\11_Springboot\\board\\src\\main\\resources\\upload", upfile.getOriginalFilename());
            upfile.transferTo(file);

            request.setFile_name("/upload/" + upfile.getOriginalFilename());
        }

        Board board = request.toEntity();

//        board.changeFileName(upfile.getOriginalFilename());
//        board.changeMemberEmail(userId);

//        String file = upfile.getOriginalFilename();
//        BoardRequset.CreateDTO dto = BoardRequset.CreateDTO.insert(board, boardId,file);

        int result = boardService.insertBoard(board);

        if (result > 0) {
            return new ResponseEntity<>("게시글 등록 성공", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("게시글 등록 성공", HttpStatus.BAD_REQUEST);
        }
    }

    //게시글 상세보기 페이지
    @GetMapping("/{boardId}")
    public ResponseEntity<BoardResponse.DetailDTO> getBoard(@PathVariable Long boardId) {
        Board board = boardService.loadBoard(boardId);

        BoardResponse.DetailDTO dto = BoardResponse.DetailDTO.formEntity(board);

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    //게시글 삭제
    @DeleteMapping("/{boardId}")
    public ResponseEntity<String> deleteBoard(@PathVariable Long boardId) {
        int result = boardService.delete(boardId);

        return new ResponseEntity<>(result + "개 게시글 삭제완료", HttpStatus.OK);
    }

    //게시글 전체 수정
    @PutMapping
    public ResponseEntity<String> updateBoard(BoardRequset.UpdateDTO request, MultipartFile upfile) throws IOException {

        if(upfile != null && !upfile.isEmpty()){
            File file = new File("C:\\Users\\user1\\Desktop\\workspace\\11_Springboot\\board\\src\\main\\resources\\upload", upfile.getOriginalFilename());
            upfile.transferTo(file);

            request.setOrigin_file("/upload/" + upfile.getOriginalFilename());
        }

        Board board = request.toEntity();

        int result = boardService.update(board);

        if(result > 0){
            return new ResponseEntity<>("게시글 수정 완료", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("게시글 수정 실패", HttpStatus.BAD_REQUEST);
        }
    }
}
