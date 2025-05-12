package com.kh.board.controller.dto.request;


import com.kh.board.entity.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class BoardRequset {

    @Getter
    @Setter
    public static class CreateDTO{

        private String title;
        private String contents;
        private String user_id;
        private String file_name;

        public Board toEntity(){
            return Board.builder()
                    .memberEmail(user_id)
                    .title(title)
                    .contents(contents)
                    .fileName(file_name)
                    .build();
        }

    }

    @Getter
    @Setter
    public static class UpdateDTO{

        private String title;
        private String contents;
        private String origin_file;
        private Long board_id;

        public Board toEntity(){
            return Board.builder()
                    .title(title)
                    .contents(contents)
                    .fileName(origin_file)
                    .boardId(board_id)
                    .build();
        }

    }
}
