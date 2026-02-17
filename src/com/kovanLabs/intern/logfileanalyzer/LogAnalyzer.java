package com.kovanLabs.intern.logfileanalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LogAnalyzer {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Asus\\IdeaProjects\\Recurtion\\src\\com\\kovanLabs\\intern\\logfileanalyzer\\server.log"))) {
            List<String> logList = lines.collect(Collectors.toList());
            long totalRequests = logList.size();
            Map<String, Long> requestsPerIP =
                    logList.stream()
                            .map(line -> line.split(" "))
                            .collect(Collectors.groupingBy(
                                    parts -> parts[0],
                                    Collectors.counting()
                            ));
            System.out.println("Requests per IP:");
            requestsPerIP.forEach((ip, count) ->
                    System.out.println(ip + " -> " + count));
            Map<String, Long> urlCount =
                    logList.stream()
                            .map(line -> line.split(" "))
                            .collect(Collectors.groupingBy(
                                    parts -> parts[3],
                                    Collectors.counting()
                            ));
            System.out.println("\nTop 3 URLs:");
            urlCount.entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .limit(3)
                    .forEach(e ->
                            System.out.println(e.getKey() + " -> " + e.getValue()));
            long error404Count =
                    logList.stream()
                            .map(line -> line.split(" "))
                            .filter(parts -> parts[2].equals("404"))
                            .count();
            double percentage404 = (error404Count * 100.0) / totalRequests;
            System.out.println("\n404 Error Percentage: " + percentage404 + "%");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
