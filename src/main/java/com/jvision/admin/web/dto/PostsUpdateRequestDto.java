package com.jvision.admin.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String time;
    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String time, String title, String content){
        this.time = time;
        this.title = title;
        this.content = content;
    }
}
