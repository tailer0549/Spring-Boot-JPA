package com.curso.udemy.Resources;

import com.curso.udemy.Entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity findAll() {
        User u = new User(2L, "Maria", "MariaDB@gmail.com", "999999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
