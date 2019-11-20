package com.company;

import java.util.function.Function;

import static com.company.TemperatureScale.*;

public class Start {

    public static void main(String[] args) {

        Temperature t1 = new Temperature();
        t1.setCelsius(30);
        System.out.println(t1.getKelvin());

        Temperature t3 = new Temperature();
        t3.setKelvin(30);
        System.out.println(t3.getCelsius());

        Temperature t2 = new Temperature();
        t2.set(KELVIN, 30);
        System.out.println(t2.getCelsius());

        System.out.println(t1.greater(t2));
    }


    public static void testStrings() {
        String[][] testCases = {
                {"", ""},
                {"a", "A"},
                {"ab", "Ab"}
        };

        int testFailuresNr = test(StrUtil::capitalizeFirst, testCases);

        String[][] testCases2 = {
                {"", ""},
                {"a", "A"},
                {"ab", "Ab"},
                {"a b", "A B"},
                {"ab cd", "Ab Cd"}
        };

        testFailuresNr += test(StrUtil::capitalizeEachFirst, testCases2);
        if (testFailuresNr != 0) {
            System.out.println("Error, " + Integer.toString(testFailuresNr) + " tests failed");
        } else {
            System.out.println("All tests passed");
        }
    }

    static int test(Function<String, String> function, String[][]testCases) {
        int testFailuresNr = 0;
        for (String[] testCase : testCases) {
            String result = function.apply(testCase[0]);
            if (!result.equals(testCase[1])) {
                testFailuresNr++;
                System.out.println("Failed test for \"" + testCase[0] + "\", got \"" + result + "\", expected \""
                        + testCase[1] + "\"");
            }
        }
        return testFailuresNr;
    }

    public static void testFibonacci() {
        /*if (Fibonacci.get(-1) != -1) {
            System.out.println("Wrong value for -1");
        }
        if (Fibonacci.get(0) != 0) {
            System.out.println("Wrong value for 0");
        }
        if (Fibonacci.get(1) != 1) {
            System.out.println("Wrong value for 1");
        }*/
        System.out.println(Fibonacci.get(11));
        if (Fibonacci.get(10) != 55) {
            System.out.println("Wrong value for 10");
        }
        for (int i = 0; i < 20; i++) {
            long start = System.currentTimeMillis();
            Fibonacci.get(25 + i);
            long end = System.currentTimeMillis();
            System.out.println("Was calculating " + Long.toString(end - start) + "ms for " + Integer.toString(25 + i));
        }
    }

    public static void testEuklides() {
        if (Euklides.gcd(7, 5 ) != 1) {
            System.out.println("Invalid result for 7 and 5");
        }
        if (Euklides.gcd(4, 16 ) != 4) {
            System.out.println("Invalid result for 4 and 16");
        }
    }
}
