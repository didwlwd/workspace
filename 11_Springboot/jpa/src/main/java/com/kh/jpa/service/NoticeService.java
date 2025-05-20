package com.kh.jpa.service;

import com.kh.jpa.dto.NoticeDto;

import java.util.List;

public interface NoticeService {
    Long insert(NoticeDto.Create noticeDto, String userId);
    NoticeDto.Response selectAll(Long noticeNo);
    NoticeDto.Response update(Long noticeNo, NoticeDto.Update noticeDto);
    void delete(Long noticeNo);
    List<NoticeDto.Response> findByTitle(String title);
}
