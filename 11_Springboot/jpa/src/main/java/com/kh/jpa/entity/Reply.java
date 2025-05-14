package com.kh.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "REPLY")
@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reply_no")
    private int replyNo;

    @Column(name = "reply_content", length = 400, nullable = false)
    private String replyContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ref_bno", nullable = false)
    private Board replyBoard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reply_writer", nullable = false)
    private Member replyMember;

    @CreationTimestamp
    @Column(name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @ColumnDefault("'Y'")
    @Column(length = 1, nullable = false)
    private String status;
}
