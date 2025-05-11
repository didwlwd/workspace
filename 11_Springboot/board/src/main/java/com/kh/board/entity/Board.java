package com.kh.board.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Board {

    private Long boardId;
    private String title;
    private String contents;
    private String fileName;
    private String memberEmail;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    //변경이 필요한 부분만 setter를 작성해준다.
    public void changeFileName(String fileName) { this.fileName = fileName; }

    //유저아이디를 받아서 멤버이메일에 저장
    public void changeMemberEmail(String userId) { this.memberEmail = userId; }
}
