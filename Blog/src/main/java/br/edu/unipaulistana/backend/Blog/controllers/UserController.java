package br.edu.unipaulistana.backend.Blog.controllers;

import br.edu.unipaulistana.backend.Blog.domainmodel.User;
import br.edu.unipaulistana.backend.Blog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//http://localhost:8080/users
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor

public class UserController {
    
private final UserService userService;
@GetMapping
    public List<User> findAll(){
    this.userService.findAll();


}

}
