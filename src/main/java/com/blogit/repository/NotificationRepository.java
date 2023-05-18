package com.blogit.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.blogit.entity.Comment;
import com.blogit.entity.Notification;
import com.blogit.entity.Post;
import com.blogit.entity.User;

import java.util.List;
import java.util.Optional;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Optional<Notification> findByReceiverAndOwningPostAndType(User receiver, Post owningPost, String type);
    List<Notification> findNotificationsByReceiver(User receiver, Pageable pageable);
    List<Notification> findNotificationsByReceiverAndIsSeenIsFalse(User receiver);
    List<Notification> findNotificationsByReceiverAndIsReadIsFalse(User receiver);
    void deleteNotificationByOwningPost(Post owningPost);
    void deleteNotificationByOwningComment(Comment owningComment);
}
