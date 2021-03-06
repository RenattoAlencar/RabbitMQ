package com.microservice.rabbitmq.repository;

import com.microservice.rabbitmq.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {


}
