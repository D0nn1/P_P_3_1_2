package com.romantynchirov.p_p_3_1_2.service;

import com.romantynchirov.p_p_3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    void updateUser(User user);
}
