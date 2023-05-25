package com.fast.cola;

import com.fast.cola.entity.User;
import com.fast.cola.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ColaApplicationTests {


    public final UserRepository userRepository;

    @Autowired
    public ColaApplicationTests(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    void contextLoads() {

    }

    @Test
    void insert() {
        User user = new User();
        user.setName("324234");
        userRepository.insert(user);
    }
}
