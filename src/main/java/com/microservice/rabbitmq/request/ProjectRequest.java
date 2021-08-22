package com.microservice.rabbitmq.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ProjectRequest {

    @NotBlank
    private String nameProject;
    @NotBlank
    private String codeProject;
    @NotBlank
    private double valueProject;
}
