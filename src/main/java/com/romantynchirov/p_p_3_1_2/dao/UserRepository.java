package com.romantynchirov.p_p_3_1_2.dao;

import com.romantynchirov.p_p_3_1_2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    void updateById(int id);
}
