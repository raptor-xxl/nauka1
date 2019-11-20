package com.company;

public class Euklides {

    static int gcd(int a, int b) {
        return gcd5b(a, b);
    }

    static int gcd1(int a, int b) {
        if (a == b) {
            return a;
        }
        while (true) {
            if (a > b) {
                int c = a;
                a = b;
                b = c;
            }
            b = b - a;

            if (a == b) {
                return a;
            }
        }
    }

    static int gcd2(int a, int b) {
        while (a != b) {
            if (a > b) {
                int c = a;
                a = b;
                b = c;
            }
            b -= a;
        }
        return a;
    }

    static int gcd3(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd3(a - b, b);
        } else {
            return gcd3(a, b - a);
        }
    }

    static int gcd4(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        return gcd4(a, b - a);
    }

    static int gcd5(int a, int b) {
        int dz = b / a;
        int mod = b % a;
        if (a == b) {
        }
        while (mod == 0) {
            if (dz == b) {
                return 0;
            }
            if (a > b) {
                int t = a;
                a = b;
                b = t;
                return 0;
            }
        }
        return 0;
    }

    static int gcd5b(int a, int b) {
        do {
            if (b < a) {
                int c = a;
                a = b;
                b = c;
            }
            if (a == 0) {
                return b;
            }
            b %= a;
        } while (true);
    }

    static int gcd6(int a, int b) {
        if (b < a) {
            int c = a;
            a = b;
            b = c;
        }
        if (a == 0) {
            return b;
        }
        return gcd6(a, b % a);
    }
}

// https://pl.wikipedia.org/wiki/Algorytm_Euklidesa