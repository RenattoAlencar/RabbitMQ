package com.microservice.rabbitmq.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Builder
@Data
@Entity
@Table(name = "TB_PROJECTS")
public class Project {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String nameProject;
    private String codeProject;
    private double valueProject;

}
