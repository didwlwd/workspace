package com.kh.jpa.dto;

import com.kh.jpa.entity.Board;
import com.kh.jpa.entity.BoardTag;
import com.kh.jpa.entity.Member;
import com.kh.jpa.entity.Reply;
import com.kh.jpa.enums.CommonEnums;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

public class BoardDto {

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response{
        private Long board_no;
        private String board_title;
        private String board_content;
        private String origin_name;
        private String change_name;
        private LocalDateTime create_date;

        private Integer count;
        private String user_id;
        private String user_name;
        private List<String> tags;

        public static Response toSimpleDto(Board board) {
            return Response.builder()
                    .board_no(board.getBoardNo())
                    .board_title(board.getBoardTitle())
                    .origin_name(board.getOriginName())
                    .create_date(board.getCreateDate())
                    .count(board.getCount())
                    .user_id(board.getMember().getUserId())
                    .build();
        }

        public static Response toDto(Board board) {
            return Response.builder()
                    .board_no(board.getBoardNo())
                    .board_title(board.getBoardTitle())
                    .board_content(board.getBoardContent())
                    .origin_name(board.getOriginName())
                    .change_name(board.getChangeName())
                    .create_date(board.getCreateDate())
                    .count(board.getCount())
                    .user_id(board.getMember().getUserId())
                    .user_name(board.getMember().getUserName())
                    .tags(board.getBoardTags().stream()
                            .map(boardTag -> boardTag.getTag().getTagName()).toList())
                    .build();
            
            //boardTag X boardTag가 여러개이기 때문에 하나마다 전부 -> tag추출
        }
    }


    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Insert{
        private Long board_no;
        private String board_title;
        private String board_content;
        private String origin_name;
        private String change_name;
        private int count;
        //Integer? int? 상관없나?
        private Member board_writer;

        public Board toEntity() {
            return Board.builder()
                    .boardNo(board_no)
                    .boardTitle(board_title)
                    .boardContent(board_content)
                    .originName(origin_name)
                    .changeName(change_name)
                    .count(count)
                    .member(board_writer)
                    .build();
        }
    }
}
