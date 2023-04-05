package com.example.authservice_.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User> userByEmail = userRepository.findByEmail(user.getEmail());
        if(userByEmail.isPresent()){
            throw new IllegalStateException("User with the given email already exists");
        }
        userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        Optional<User> userById = userRepository.findById(userId);
        if(userById.isPresent()) userRepository.deleteById(userId);
        else {
            throw new IllegalStateException("User with the given Id " + userId + " was not found");
        }
    }

    public void updateUser(Long userId, User user){
        Optional<User> userById = userRepository.findById(userId);
    }
}