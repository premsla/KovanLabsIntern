package com.kovanLabs.intern.exceptionhandling;

public class DataProcessingException extends RuntimeException{
    public DataProcessingException(String msg){
        super(msg);
    }
}
