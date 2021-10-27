package com.tandiep;

import java.util.Scanner;

public class BaiTap4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào x: ");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int total = tinhTong(x, n);
        System.out.println("Tổng cần tìm là: " + total);
    }

    public static int tinhTong(int x, int n) {
        int temp = x;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += temp;
            System.out.println("Total = " + total);
            System.out.println("X = " + x);
            temp *= x;
        }
        return total;
    }
}
