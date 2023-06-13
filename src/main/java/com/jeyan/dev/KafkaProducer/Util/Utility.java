package com.jeyan.dev.KafkaProducer.Util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utility {

    public static void consoleObject(Object obj){
        try{
            System.out.println( new ObjectMapper().writeValueAsString(obj));
        }catch (JsonProcessingException exp){
            exp.getCause();
        }
    }
}
