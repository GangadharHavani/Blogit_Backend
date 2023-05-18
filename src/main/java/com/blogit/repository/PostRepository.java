package com.blogit.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.blogit.entity.Post;
import com.blogit.entity.Tag;
import com.blogit.entity.User;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findPostsByAuthor(User author, Pageable pageable);
    List<Post> findPostsByAuthorIdIn(List<Long> followingUserIds, Pageable pageable);
    List<Post> findPostsBySharedPost(Post post, Pageable pageable);
    List<Post> findPostsByPostTags(Tag tag, Pageable pageable);
}
