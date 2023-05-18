package com.blogit.service;

import com.blogit.dto.*;
import com.blogit.entity.Comment;
import com.blogit.entity.Post;
import com.blogit.entity.User;
import com.blogit.response.UserResponse;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {
    User getUserById(Long userId);
    User getUserByEmail(String email);
    List<UserResponse> getFollowerUsersPaginate(Long userId, Integer page, Integer size);
    List<UserResponse> getFollowingUsersPaginate(Long userId, Integer page, Integer size);
    User createNewUser(SignupDto signupDto);
    User updateUserInfo(UpdateUserInfoDto updateUserInfoDto);
    User updateEmail(UpdateEmailDto updateEmailDto);
    User updatePassword(UpdatePasswordDto updatePasswordDto);
    User updateProfilePhoto(MultipartFile photo);
    User updateCoverPhoto(MultipartFile photo);
    User verifyEmail(String token);
    void forgotPassword(String email);
    User resetPassword(String token, ResetPasswordDto resetPasswordDto);
    void deleteUserAccount();
    void followUser(Long userId);
    void unfollowUser(Long userId);
    User getAuthenticatedUser();
    List<UserResponse> getUserSearchResult(String key, Integer page, Integer size);
    List<User> getLikesByPostPaginate(Post post, Integer page, Integer size);
    List<User> getLikesByCommentPaginate(Comment comment, Integer page, Integer size);
}
