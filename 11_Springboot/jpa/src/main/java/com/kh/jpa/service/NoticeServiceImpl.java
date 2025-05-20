package com.kh.jpa.service;

import com.kh.jpa.dto.MemberDto;
import com.kh.jpa.dto.NoticeDto;
import com.kh.jpa.entity.Member;
import com.kh.jpa.entity.Notice;
import com.kh.jpa.repository.MemberRepository;
import com.kh.jpa.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class NoticeServiceImpl implements NoticeService {
    private final NoticeRepository noticeRepository;
    private final MemberRepository memberRepository;

    @Override
    public Long insert(NoticeDto.Create noticeDto, String userId) {
        Member member = memberRepository.findOne(userId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않은 회원입니다."));

        Notice notice = noticeDto.toEntity(member);
        noticeRepository.insert(notice);
        return notice.getNoticeNo();
    }

    @Transactional(readOnly = true)
    @Override
    public NoticeDto.Response selectAll(Long noticeNo) {
        return noticeRepository.selectOne(noticeNo)
                .map(NoticeDto.Response::toDto)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않은 공지사항입니다."));
    }

    @Override
    public NoticeDto.Response update(Long noticeNo, NoticeDto.Update noticeDto) {
        Notice notice = noticeRepository.selectOne(noticeNo)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않은 공지사항입니다."));

        notice.updateNotice(
                noticeDto.getNotice_title(),
                noticeDto.getNotice_content()
        );

        return NoticeDto.Response.toDto(notice);
    }

    @Override
    public void delete(Long noticeNo) {
        Notice notice = noticeRepository.selectOne(noticeNo)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않은 공지사항입니다."));

        noticeRepository.delete(notice);
    }

    @Override
    public List<NoticeDto.Response> findByTitle(String title) {
        return noticeRepository.findByTitle(title).stream()
                .map(NoticeDto.Response::toDto)
                .collect(Collectors.toList());
    }
}
