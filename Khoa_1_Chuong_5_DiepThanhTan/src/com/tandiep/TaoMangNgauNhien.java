package com.tandiep;

public class TaoMangNgauNhien {
    static final int MIN = -100;
    static final int MAX = 100;

    public static int[] taoMangNgauNhien(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        }
        return arr;
    }
}
