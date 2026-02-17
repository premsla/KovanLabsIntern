package com.kovanLabs.intern.stream;

import java.util.*;

public class Stream {
    public static IntSummaryStatistics calculate(List<Integer> number) {
        return number.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
    }
}
