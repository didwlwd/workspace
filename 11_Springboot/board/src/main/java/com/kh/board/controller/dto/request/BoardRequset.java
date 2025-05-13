package com.kh.board.controller.dto.request;


import com.kh.board.entity.Board;
import com.kh.board.entity.Member;
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

        public Board toEntity(Member member){
            return Board.builder()
                    .member(member)
                    .title(title)
                    .contents(contents)
                    .fileName(file_name)
                    .build();
        }

    }

    @Getter
    @Setter
    public static class UpdateDTO{

        private String user_id;
        private String title;
        private String contents;
        private String origin_file;
        private Long board_id;

        public Board toEntity(Member member){
            return Board.builder()
                    .title(title)
                    .member(member)
                    .contents(contents)
                    .fileName(origin_file)
                    .boardId(board_id)
                    .build();
        }

    }
}
