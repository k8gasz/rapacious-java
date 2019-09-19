package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;
    private String content;
}
