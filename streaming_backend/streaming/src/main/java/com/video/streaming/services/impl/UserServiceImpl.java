package com.video.streaming.services.impl;

import com.video.streaming.Repository.UserRepository;
import com.video.streaming.entity.User;
import com.video.streaming.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User addNewUser(User user){
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int userId) {

    }

    @Override
    public User UpdateUser(User user) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }
}
