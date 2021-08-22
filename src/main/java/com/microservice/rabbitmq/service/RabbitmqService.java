package com.microservice.rabbitmq.service;

import com.microservice.rabbitmq.domain.Project;
import com.microservice.rabbitmq.domain.User;
import com.microservice.rabbitmq.repository.ProjectRepository;
import com.microservice.rabbitmq.repository.UserRepository;
import com.microservice.rabbitmq.request.ProjectRequest;
import com.microservice.rabbitmq.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class RabbitmqService {

    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;


    public Page<User> listAllUsers(Pageable pageable){
       return userRepository.findAll(pageable);
    }

    @Transactional
    public User saveUser(UserRequest userRequest){
        return userRepository.save(User.builder()
                        .codeUser(userRequest.getCodeUser())
                        .name(userRequest.getName())
                        .email(userRequest.getEmail())
                        .telephone(userRequest.getTelephone())
                .build());
    }

    public Page<Project> listAllProject(Pageable pageable){
        return projectRepository.findAll(pageable);
    }

    @Transactional
    public Project saveProject(ProjectRequest projectRequest){
        return projectRepository.save(Project.builder()
                        .nameProject(projectRequest.getNameProject())
                        .codeProject(projectRequest.getCodeProject())
                        .valueProject(projectRequest.getValueProject())
                .build());
    }


}
