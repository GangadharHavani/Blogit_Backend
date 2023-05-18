package com.blogit.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.blogit.entity.Comment;
import com.blogit.entity.Post;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post, Pageable pageable);
}
