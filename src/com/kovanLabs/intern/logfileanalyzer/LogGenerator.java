package com.kovanLabs.intern.logfileanalyzer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

public class LogGenerator {

    static String[] urls = {"/home", "/login", "/products", "/cart", "/checkout", "/profile", "/search"};

    static int[] statusCodes = {200, 200, 200, 200, 404, 500};

    public static void main(String[] args) {
        Random random = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Asus\\IdeaProjects\\Recurtion\\src\\com\\kovanLabs\\intern\\logfileanalyzer\\server.log"))) {

            for (int i = 0; i < 10000; i++) {

                String ip = "192.168.1." + random.nextInt(50);
                String time = LocalDateTime.now().minusSeconds(random.nextInt(100000)).toString();
                int status = statusCodes[random.nextInt(statusCodes.length)];
                String url = urls[random.nextInt(urls.length)];

                writer.write(ip + " " + time + " " + status + " " + url);
                writer.newLine();
            }

            System.out.println("Log file generated: server.log");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
