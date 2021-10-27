package com.tandiep;

import java.util.Scanner;

public class QuanLyTuyenSinh {
    public static final String KHU_VUC_A = "A";
    public static final String KHU_VUC_B = "B";
    public static final String KHU_VUC_C = "C";
    public static final byte DOI_TUONG_MOT = 1;
    public static final byte DOI_TUONG_HAI = 2;
    public static final byte DOI_TUONG_BA = 3;

    public static void main(String[] args) {
        float monThuNhat, monThuHai, monThuBa;
        short doiTuong;
        String khuVuc;
        float diemUuTien;
        float diemTong;
        float diemChuan;
        boolean coDauKhong;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        //Nhập điểm thi
        System.out.print("Nhập điểm môn thứ nhất: ");
        monThuNhat = Float.parseFloat(scanner.nextLine());
        if (monThuNhat == 0)
            flag = false;

        System.out.print("Nhập điểm môn thứ hai: ");
        monThuHai = Float.parseFloat(scanner.nextLine());
        if (monThuHai == 0)
            flag = false;

        System.out.print("Nhập điểm môn thứ ba: ");
        monThuBa = Float.parseFloat(scanner.nextLine());
        if (monThuBa == 0)
            flag = false;

        //Điểm tổng trước khi cộng điểm ưu tiên
        diemTong = tinhTongDiem(monThuNhat, monThuHai, monThuBa);

        // Tính điểm ưu tiên
        System.out.print("Nhập khu vực ưu tiên (nhập X nếu không thuộc khu vực nào): ");
        khuVuc = scanner.nextLine();
        System.out.print("Nhập đối tượng ưu tiên (nhập 0 nếu không thuộc đối tượng nào): ");
        doiTuong = Short.parseShort(scanner.nextLine());
        diemUuTien = tinhDiemUuTien(khuVuc, doiTuong);

        diemTong += diemUuTien;
        System.out.print("Nhập điểm chuẩn của năm nay: ");
        diemChuan = Float.parseFloat(scanner.nextLine());

        coDauKhong = coDauKhong(diemTong, diemChuan);
        if (coDauKhong && flag)
            System.out.println("Đậu");
        else
            System.out.println("Rớt");
    }

    public static float tinhTongDiem(float monThuNhat, float monThuHai, float monThuBa) {

        float tongDiem = monThuNhat + monThuHai + monThuBa;
        return tongDiem;

    }

    public static float tinhDiemUuTien(String khuVuc, short doiTuong) {
        float diemUuTien = 0;

        //Khu vực ưu tiên
        if (khuVuc.equalsIgnoreCase(KHU_VUC_A)) {
            diemUuTien += 2;
        } else if (khuVuc.equalsIgnoreCase(KHU_VUC_B)) {
            diemUuTien += 1;
        } else if (khuVuc.equalsIgnoreCase(KHU_VUC_C)) {
            diemUuTien += 0.5;
        }

        //Đối tượng ưu tiên
        if (doiTuong == DOI_TUONG_MOT) {
            diemUuTien += 2.5;
        } else if (doiTuong == DOI_TUONG_HAI) {
            diemUuTien += 1.5;
        } else if (doiTuong == DOI_TUONG_BA) {
            diemUuTien += 1;
        }

        return diemUuTien;
    }

    public static boolean coDauKhong(float diemTong, float diemChuan) {
        return diemTong >= diemChuan;
    }
}
