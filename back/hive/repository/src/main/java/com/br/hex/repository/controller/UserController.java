package com.br.hex.repository.controller;

import com.br.hex.repository.dao.UserRepository;
import com.br.hex.repository.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    @GetMapping("/credentials/{user}")
    public User isValid(@PathVariable final String user){
        User credentials = UserRepository.getInstancia().selectUser(user);

        credentials.setPassword(encoder.encode(credentials.getPassword()));

        return credentials;
    }

}
