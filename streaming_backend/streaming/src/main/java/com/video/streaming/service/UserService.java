package com.video.streaming.services;

import com.video.streaming.Repository.UserRepository;
import com.video.streaming.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    public List<User> getAllUsers();

    public Optional<User> getUserById(int id);

    public User createUser(User user);

    public void deleteUser(int id);

}
