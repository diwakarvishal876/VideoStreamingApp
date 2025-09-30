package com.video.streaming.service;

import com.video.streaming.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public List<User> getAllUsers();

    public Optional<User> getUserById(int id);

    public User createUser(User user);

    public void deleteUser(int id);

}
