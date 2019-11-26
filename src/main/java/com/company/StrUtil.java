package com.company;

public class StrUtil {
    static String capitalizeFirst(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    static String capitalizeEachFirst(String input) {
        if (input == null) {
            return null;
        }
        String[] parts = input.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(capitalizeFirst(parts[0]));
        for (int i = 1; i < parts.length; i++) {
            sb.append(" ").append(capitalizeFirst(parts[i]));
        }
        return sb.toString();
    }
}
