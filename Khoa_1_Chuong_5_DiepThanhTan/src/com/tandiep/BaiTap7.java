package org.example;
//package com.tandiep;

import java.util.Scanner;

public class BaiTap7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chieuCao;
        System.out.print("Nhập chiều cao tam giác: ");
        chieuCao = Integer.parseInt(scanner.nextLine());
        inTamGiacCanDac(chieuCao);
        inTamGiacCanRong(chieuCao);
    }

    public static void inTamGiacCanDac(int chieuCao) {
        for (int i = 1; i <= chieuCao; i++) {
            for (int j = 1; j <= chieuCao - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inTamGiacCanRong(int chieuCao) {
        for (int i = chieuCao; i > 0; i--) {
            for (int j = 1; j < i; j++)
                System.out.print(" ");

            for (int k = 1; k <= (2 * (chieuCao - i) + 1); k++)
                if ((k == 1) || (k == (2 * (chieuCao - i) + 1)) || (i == 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}