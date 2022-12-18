package com.jvision.admin.web.dto;

import com.jvision.admin.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsResponseDto {
    private Long id;
    private String time;
    private String title;
    private String content;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.time = entity.getTime();
        this.title = entity.getTitle();
        this.content = entity.getContent();
    }
}
