package com.company;

import java.util.function.Function;

public class Start {
    public static void main(String[] args) {

        ArrayCollection c1 = new ArrayCollection();
        ArrayCollection c2 = new ArrayCollection();

        c1.add("S1");
        c1.add("S2");
        c2.add("C1");
        /*c1.getData()[0] = "S1";
        c1.getData()[1] = "S2";
        c1.setSize(2);

        c2.getData()[0] = "C1";
        c2.setSize(1);*/

        Mergable c3 = c1.merge(c2);

        Mergable c4 = c3.merge(c1);

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
            System.out.println("Error, " + testFailuresNr + " tests failed");
        } else {
            System.out.println("All tests passed");
        }
    }

    static int test(Function<String, String> function, String[][] testCases) {
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
            System.out.println("Was calculating " + (end - start) + "ms for " + (25 + i));
        }
    }

    public static void testEuklides() {
        if (Euklides.gcd(7, 5) != 1) {
            System.out.println("Invalid result for 7 and 5");
        }
        if (Euklides.gcd(4, 16) != 4) {
            System.out.println("Invalid result for 4 and 16");
        }
    }
}
