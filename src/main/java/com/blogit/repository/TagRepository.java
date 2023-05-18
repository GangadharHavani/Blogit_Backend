package com.blogit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogit.entity.Tag;

import java.util.Optional;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Optional<Tag> findTagByName(String name);
}
