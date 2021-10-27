package com.tandiep;

import java.util.Scanner;

public class BaiTap6 {
    static final float LAI_SUAT = 0.06f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte soNam;
        float tienGui, tienKyVong;
        float laiSuatIn = LAI_SUAT * 100;
        System.out.print("Nhập số tiền bạn muốn gửi (VND): ");
        tienGui = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập số tiền bạn muốn có trong tương lai (VND): ");
        tienKyVong = Float.parseFloat(scanner.nextLine());

        soNam = tinhSoNam(tienGui, tienKyVong);
        System.out.println("Với lãi suất " + laiSuatIn + "% bạn cần " + soNam + " năm để đạt được số tiền trên");

    }

    public static byte tinhSoNam(float tienGui, float tienKyVong) {
        float tienSauMoiNam = tienGui;
        float tienLai;
        byte soNam = 0;

        while (tienSauMoiNam < tienKyVong) {
            tienLai = tienSauMoiNam * LAI_SUAT;
            tienSauMoiNam += tienLai;
            soNam += 1;
        }

        return soNam;
    }
}
