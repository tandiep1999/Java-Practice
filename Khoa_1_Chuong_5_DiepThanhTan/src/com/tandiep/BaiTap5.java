package com.tandiep;

import java.util.Scanner;

public class BaiTap5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int giaiThua = tinhGiaiThua(n);
        System.out.println(n + "! = " + giaiThua);
    }

    public static int tinhGiaiThua(int n) {
        int ketQua = 1;

        if (n == 0 || n == 1)
            return ketQua;

        for (int i = 1; i <= n; i++) {
            ketQua *= i;
        }
        return ketQua;
    }
}
