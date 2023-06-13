package com.jeyan.dev.KafkaProducer.service;

import com.jeyan.dev.KafkaProducer.Model.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    KafkaTemplate<String,Object> kafkaTemplate;
    public void pushMessageToKafka(StudentDetails studentDetails){
        try{
            for(int i=1;i<5;i++){
                kafkaTemplate.send("June","Hi All !");
            }
        }catch(Exception e){
            System.out.println("--------------- Error ---------------");
            System.out.println(e.getCause());
        }
    }
}
