package com.graphql.controller;

import com.graphql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphQLController {

    @Autowired
    private StudentService studentService;


}
