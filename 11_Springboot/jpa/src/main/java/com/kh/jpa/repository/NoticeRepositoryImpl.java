package com.kh.jpa.repository;

import com.kh.jpa.dto.NoticeDto;
import com.kh.jpa.entity.Notice;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NoticeRepositoryImpl implements NoticeRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(Notice notice) {
        em.persist(notice);
    }

    @Override
    public Optional<Notice> selectOne(Long noticeNo) {
        return Optional.ofNullable(em.find(Notice.class, noticeNo));
    }

    @Override
    public void delete(Notice notice) {
        em.remove(notice);
    }

    @Override
    public List<Notice> findByTitle(String title) {
        String query = "select n from Notice n where n.noticeTitle LIKE :title";
        return em.createQuery(query, Notice.class)
                .setParameter("title", "%" + title + "%")
                .getResultList();
    }
}
