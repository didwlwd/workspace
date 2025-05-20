package com.kh.jpa.repository;

import com.kh.jpa.dto.NoticeDto;
import com.kh.jpa.entity.Notice;

import java.util.List;
import java.util.Optional;

public interface NoticeRepository {
    void insert(Notice notice);
    Optional<Notice> selectOne(Long noticeNo);
    void delete(Notice notice);
    List<Notice> findByTitle(String title);
}
