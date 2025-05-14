package com.kh.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "NOTICE")
@Entity
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_no", nullable = false)
    private Long noticeNo;

    @Column(name = "notice_title", length = 30, nullable = false)
    private String noticeTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notice_writer", nullable = false)
    private Member noticeMember;

    @Column(name = "notice_content", length = 200, nullable = false)
    private String noticeContent;

    @CreationTimestamp
    @Column(name = "create_date", updatable = false)
    private LocalDateTime createDate;

}
