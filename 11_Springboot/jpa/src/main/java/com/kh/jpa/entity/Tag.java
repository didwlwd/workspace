package com.kh.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TAG")
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private int tagId;

    @Column(name = "tag_name", length = 30, nullable = false,unique = true)
    private String tagName;

    @OneToMany(mappedBy = "boardTagTag")
    private List<Board_tag> boardTags = new ArrayList<>();
}
