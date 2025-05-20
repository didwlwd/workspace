package com.kh.jpa.controller;


import com.kh.jpa.dto.NoticeDto;
import com.kh.jpa.entity.Member;
import com.kh.jpa.entity.Notice;
import com.kh.jpa.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notices")
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeService noticeService;


    //공지사항 추가
    @PostMapping("/{userId}")
    public ResponseEntity<Long> addNotice(@PathVariable String userId, @RequestBody NoticeDto.Create noticeDto) {
        Long noticeNo = noticeService.insert(noticeDto, userId);

        return ResponseEntity.ok(noticeNo);
    }

    //공지사항 조회
    @GetMapping("/{noticeNo}")
    public ResponseEntity<NoticeDto.Response> findNotices(@PathVariable Long noticeNo) {
        return ResponseEntity.ok(noticeService.selectAll(noticeNo));

    }

    //공지사항 수정
    @PutMapping("/{noticeNo}")
    public ResponseEntity<NoticeDto.Response> updateNotice(@PathVariable Long noticeNo, @RequestBody NoticeDto.Update noticeDto) {
        return ResponseEntity.ok(noticeService.update(noticeNo, noticeDto));
    }

    //공지사항 삭제
    @DeleteMapping("/{noticeNo}")
    public ResponseEntity<Void> deleteNotice(@PathVariable Long noticeNo) {
        noticeService.delete(noticeNo);
        return ResponseEntity.ok().build();
    }

    //공지사항 타이틀로 찾기
    @GetMapping("/search/title")
    public ResponseEntity<List<NoticeDto.Response>> findNoticeByTitle(@RequestParam String title) {
        return ResponseEntity.ok(noticeService.findByTitle(title));
    }
}
