package com.kh.board.controller.dto.response;

import com.kh.board.entity.Board;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class BoardResponse {

    @Getter
    @Setter
    @Builder
    public static class SimpleDTO {

        private Long board_id;
        private String title;
        private String member_email;
        private LocalDateTime created_at;


        public static SimpleDTO formEntity(Board board) {
            return SimpleDTO.builder()
                    .board_id(board.getBoardId())
                    .member_email(board.getMember().getEmail())
                    .title(board.getTitle())
                    .created_at(board.getCreatedAt())
                    .build();
        }

    }

    @Getter
    @Setter
    @Builder
    public static class DetailDTO {

        private String title;
        private String member_email;
        private String contents;
        private String file_name;
        private String originFile;


        public static DetailDTO formEntity(Board board) {
            return DetailDTO.builder()
                    .title(board.getTitle())
                    .member_email(board.getMember().getEmail())
                    .contents(board.getContents())
                    .file_name(board.getFileName())
                    .originFile(board.getFileName())
                    .build();
        }
    }
}
