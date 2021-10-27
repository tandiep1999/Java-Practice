package com.tandiep;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = nhapSoN(scanner);
        tinhTongSoLe(n);
    }

    public static int nhapSoN(Scanner scanner) {
        int n;
        do {
            System.out.print("Hãy nhập một số nguyên dương: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0)
                System.out.println("Vui lòng không nhập số âm\n");
        } while (n < 0);
        return n;
    }

    public static void tinhTongSoLe(int n) {
        int total = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                total += i;
            }
        }
        System.out.println("Tổng các số lẻ nhỏ hơn " + n + " là: " + total);
    }
}
