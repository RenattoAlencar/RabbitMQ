package com.microservice.rabbitmq.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_PROJECTS")
public class Project implements Serializable {

    private static final long serialVersionUID = -5551915359853430424L;

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String nameProject;
    private String codeProject;
    private double valueProject;

}
