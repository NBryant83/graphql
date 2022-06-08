package com.graphql.resolver;

import com.graphql.pojo.Student;
import com.graphql.service.StudentService;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class StudentQueryResolver implements GraphQLQueryResolver {


    @Autowired
    private final StudentService studentService;

    List<Student> students(){
        return studentService.findAll();
    }
    Optional<Student> findStudent(long id){
        return studentService.findOne();
    }



}