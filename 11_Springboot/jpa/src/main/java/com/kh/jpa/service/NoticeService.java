package com.kh.jpa.service;

import com.kh.jpa.dto.NoticeDto;

public interface NoticeService {
    Long insert(NoticeDto.Create noticeDto);
    NoticeDto.Response selectAll(Long noticeNo);
    NoticeDto.Response update(Long noticeNo, NoticeDto.Update noticeDto);
    void delete(Long noticeNo);
}
