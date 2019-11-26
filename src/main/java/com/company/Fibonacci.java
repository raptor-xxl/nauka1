package com.company;

public class Fibonacci {

    static long get(int n) {
        return get3(n);
    }

    static long get1(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }

        return get1(n - 1) + get1(n - 2);
    }

    static long get2(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        long[] f = new long[n + 1];

        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    static long get3(int n) {
        if (n < 0) {
            return -1;
        }

        {
            int t = 5;
        }
        if (n <= 1) {
            return n;
        }
        long a, b;
        a = 0;
        b = 1;

        for (int i = 2; i <= n; i++) {
            long c = b + a;
            a = b;
            b = c;
        }
        return b;
    }
}
