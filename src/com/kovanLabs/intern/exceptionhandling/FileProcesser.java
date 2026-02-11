package com.kovanLabs.intern.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;


public class FileProcesser {
    public void processFile(String filename){
        try{
            FileReader file=new FileReader(filename);
            BufferedReader br=new BufferedReader(file);
            System.out.println(br.readLine());
            br.close();

        }catch (IOException e){
            throw new DataProcessingException("\n Error while processing a file");
        }
    }
}
