package com.microservice.rabbitmq.controller;


import com.microservice.rabbitmq.domain.Project;
import com.microservice.rabbitmq.domain.User;
import com.microservice.rabbitmq.request.ProjectRequest;
import com.microservice.rabbitmq.request.UserRequest;
import com.microservice.rabbitmq.service.RabbitmqService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RequiredArgsConstructor
@RestController
@RequestMapping("api")
public class UserController {

    private final RabbitmqService service;

    @GetMapping("/all-users")
    public ResponseEntity<Page<User>> listAllUsers(Pageable pageable){
        return ResponseEntity.ok(service.listAllUsers(pageable));
    }

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest) {
        return new ResponseEntity<>(service.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("all-projects")
    public ResponseEntity<Page<Project>> listAllProject(Pageable pageable){
        return ResponseEntity.ok(service.listAllProject(pageable));
    }

    @PostMapping("/project")
    public  ResponseEntity<Project> saveProject(@RequestBody @Valid ProjectRequest projectRequest){
        return new ResponseEntity<>(service.saveProject(projectRequest),HttpStatus.CREATED);
    }

}
