package com.jvision.admin.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 생성자 메소드
@Entity // 테이블 클래스
public class Posts {
    // 테이블의 각 필드 정의 (Long id, String title, String content, String author)

    // 기본 키 정의(auto_increment 속성 부여 - 자동 증가)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(length = 500, nullable = false)
    private String time;
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Builder
    public Posts (String time, String title, String content){
        this.time = time;
        this.title = title;
        this.content = content;
    }

    public void update(String time, String title, String content){
        this.time = time;
        this.title = title;
        this.content = content;
    }
}
