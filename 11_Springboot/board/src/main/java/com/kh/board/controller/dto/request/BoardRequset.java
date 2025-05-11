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
        private String contents;
        private String user_id;
        private String file_name;

        public static CreateDTO insert(Board board, Long board_id, String file) {
            return CreateDTO.builder()
                    .board_id(board_id)
                    .title(board.getTitle())
                    .contents(board.getContents())
                    .user_id(board.getMemberEmail())
                    .file_name(file)
                    .build();
        }
    }
}
