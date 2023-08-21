package com.romantynchirov.p_p_3_1_2.service;

import com.romantynchirov.p_p_3_1_2.dao.UserRepository;
import com.romantynchirov.p_p_3_1_2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(int id) {
        Optional<User> optionalUser = userRepository.findById(id);
        User user = optionalUser.orElse(null);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);

    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }
}
