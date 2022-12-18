package com.jvision.admin.web.dto;

import com.jvision.admin.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String time;
    private String title;
    private String content;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.time = entity.getTime();
        this.title = entity.getTitle();
        this.content = entity.getContent();
    }
}
