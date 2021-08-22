package com.microservice.rabbitmq.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String telephone;
    @NotBlank
    private String codeUser;


}
