package com.jeyan.dev.KafkaProducer.controller;

import com.jeyan.dev.KafkaProducer.Model.StudentDetails;
import com.jeyan.dev.KafkaProducer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/pushStudents")
    public void pushStudents(@RequestBody StudentDetails studentDetails){
        studentService.pushMessageToKafka(studentDetails);
    }
}
