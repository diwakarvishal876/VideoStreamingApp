package com.video.streaming.services;

import com.video.streaming.Repository.UserRepository;
import com.video.streaming.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


public interface UserService {

    User addNewUser(User user);
    void deleteUser(int userId);
    User UpdateUser(User user);
    User findByEmail(String email);


}
