package com.kh.jpa.service;

import com.kh.jpa.dto.BoardDto;
import com.kh.jpa.entity.Board;
import com.kh.jpa.enums.CommonEnums;
import com.kh.jpa.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public Page<BoardDto.Response> findAllBoards(Pageable pageable) {
        /*
            getContent() 실제 데이터 리스트 반환
            getTotalPages() 전체 페이지 개수
            getTotalelements() 전체 데이터 수
            getSize() 페이지당 데이터 수
            ...
         */
        Page<Board> page =  boardRepository.findByStatus(CommonEnums.Status.Y, pageable);
        return page.map(BoardDto.Response::toSimpleDto);


    }

    @Override
    public BoardDto.Response findByIdBoard(Long id) {
        return boardRepository.findByIdBoard(id)
                .map(BoardDto.Response::toDto)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 게시판입니다."));
    }

    @Override
    public Void deleteByIdBoard(Long id) {
        Board board = boardRepository.findByIdBoard(id)
                .orElseThrow(() -> new IllegalArgumentException(("존재하지 않는 게시판입니다.")));

        boardRepository.deleteByIdBoard(board);
        return null;
    }
}
