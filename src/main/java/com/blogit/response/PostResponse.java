package com.blogit.response;

import com.blogit.entity.Post;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
    private Post post;
    private Boolean likedByAuthUser;
}
