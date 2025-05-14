package com.kh.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOARD")
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_no")
    private int boardNo;

    @Column(name = "board_title", length = 100, nullable = false)
    private String boardTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_writer", nullable = false)
    private Member boardMember;

    @Column(name = "board_content",nullable = false)
    private String boardContent;

    @Column(name = "origin_name", length = 100)
    private String originName;

    @Column(name = "change_name", length = 100)
    private String changeName;

    @ColumnDefault("'0'")
    private int count;

    @CreationTimestamp
    @Column(name = "create_date")
    private LocalDateTime createDate;

    @ColumnDefault("'Y'")
    @Column(length = 1,nullable = false)
    private String status;

    //한 게시판은 여러 댓글을 가질 수 있다.
    @OneToMany(mappedBy = "replyBoard")
    private List<Reply> replies = new ArrayList<>();

    //한 게시판은 여러 태그를 가질 수 있다.
    @OneToMany(mappedBy = "boardTagBoard")
    private List<Board_tag> tags = new ArrayList<>();
}
