package com.kh.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PROFILE")
@Entity
public class Profile {
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Member profileMember;

    @Column(name = "profile_image", length = 100)
    private String profileImage;

    @Column(length = 300)
    private String intro;
}
