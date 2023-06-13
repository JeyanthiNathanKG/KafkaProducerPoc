package com.jeyan.dev.KafkaProducer.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class StudentDetails {
    @JsonProperty("Student")
    List<Student> student;
}
