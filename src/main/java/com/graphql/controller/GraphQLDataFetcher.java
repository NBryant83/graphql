package com.graphql.controller;


import com.graphql.pojo.Student;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Component
public class GraphQLDataFetchers {

    @Autowired
    Student student;

//    public DataFetcher getStudentCourseInfoDataFetcher() {
//        return
//    }

    public DataFetcher getStudentInfoDataFetcher() {
        return dataFetchingEnvironment.getArgument("id");
        return student
                .stream()
                .filter(student -> student.get("id").equals(id))
                .findFirst()
                .orElse(null);
    }
}
