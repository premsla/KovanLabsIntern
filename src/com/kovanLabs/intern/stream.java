package com.kovanLabs.intern;

import java.util.*;
import java.util.stream.Collectors;

public class stream {
    public static IntSummaryStatistics calculate(List<Integer> number) {
        return number.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
    }
}

