package com.kh.board.controller.dto.request;


import com.kh.board.entity.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class BoardRequset {

    @Getter
    @Setter
    @Builder
    public static class CreateDTO{
        private Long board_id;
        private String title;
        private String content;
        private String user_id;
        private String fileName;

        public static CreateDTO insert(Board board, Long board_id) {
            return CreateDTO.builder()
                    .board_id(board_id)
                    .title(board.getTitle())
                    .content(board.getContents())
                    .user_id(board.getMemberEmail())
                    .fileName(board.getFileName())
                    .build();
        }
    }
}
