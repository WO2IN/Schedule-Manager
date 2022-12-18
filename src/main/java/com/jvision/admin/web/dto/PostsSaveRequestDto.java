package com.jvision.admin.web.dto;


import com.jvision.admin.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String time;
    private String title;
    private String content;

    @Builder
    public PostsSaveRequestDto(String time, String title, String content){
        this.time = time;
        this.title = title;
        this.content = content;
    }

    public Posts toEntity(){
        return Posts.builder()
                .time(time)
                .title(title)
                .content(content)
                .build();
    }
}
