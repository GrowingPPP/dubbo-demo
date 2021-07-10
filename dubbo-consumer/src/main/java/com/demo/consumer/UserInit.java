package com.demo.consumer;

import com.demo.api.User;
import com.demo.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInit implements CommandLineRunner {

    @Reference
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        User user = userService.selectUserById(20);
        System.out.println(user.toString());
    }
}
