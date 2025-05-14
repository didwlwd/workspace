package com.kh.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MEMBER")
@Entity
public class Member {
    @Id
    @Column(name = "user_id", unique = true, nullable = false, length = 30)
    private String userId;

    @Column(name = "user_pwd", nullable = false, length = 100)
    private String userPwd;

    @Column(name = "user_name", nullable = false, length = 100)
    private String userName;

    @Column(length = 254)
    private String email;

    @Column(length = 1)
    private String gender;

    private int age;

    @Column(length = 13)
    private String phone;

    @Column(length = 100)
    private String address;

    @CreationTimestamp
    @Column(name = "enroll_date", updatable = false)
    private LocalDateTime enrollDate;

    @UpdateTimestamp
    @Column(name = "modify_date")
    private LocalDateTime modifyDate;

    @ColumnDefault("'Y'")
    @Column(length = 1, nullable = false)
    private String status;

    //한 사람은 하나의 프로필을 가질 수 있다.
    @OneToOne(mappedBy = "profileMember", cascade = CascadeType.ALL)
    private Profile profiles = new Profile();

    //한 사람은 여러 공지를 작성할 수 있다.
    @OneToMany(mappedBy = "noticeMember")
    private List<Notice> notices = new ArrayList<>();

    //한 사람은 여러 게시판을 작성할 수 있다.
    @OneToMany(mappedBy = "boardMember")
    private List<Board> boards = new ArrayList<>();

    //한 사람은 여러 댓글을 작성할 수 있다.
    @OneToMany(mappedBy = "replyMember")
    private List<Reply> replies = new ArrayList<>();
}
