package com.tandiep;

import java.util.Scanner;

public class ThueTNCN {
    public static final float THUE_BAC_1 = 0.05f;
    public static final float THUE_BAC_2 = 0.1f;
    public static final float THUE_BAC_3 = 0.15f;
    public static final float THUE_BAC_4 = 0.2f;
    public static final float THUE_BAC_5 = 0.25f;
    public static final float THUE_BAC_6 = 0.3f;
    public static final float THUE_BAC_7 = 0.35f;

    public static final short MUC_CHIU_THUE_1 = 60;
    public static final short MUC_CHIU_THUE_2 = 120;
    public static final short MUC_CHIU_THUE_3 = 216;
    public static final short MUC_CHIU_THUE_4 = 384;
    public static final short MUC_CHIU_THUE_5 = 624;
    public static final short MUC_CHIU_THUE_6 = 960;

    public static final short GIAM_TRU_GIA_CANH = 4;
    public static final float GIAM_TRU_PHU_THUOC = 1.6f;

    public static void main(String[] args) {
        String hoTen;
        float thuNhapNam;
        short soNguoiPhuThuoc;
        float thuNhapChiuThue;
        float thuePhaiTra;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập tổng thu nhập năm (VND): ");
        thuNhapNam = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập số người phụ thuộc: ");
        soNguoiPhuThuoc = Short.parseShort(scanner.nextLine());

        thuNhapChiuThue = tinhThuNhapChiuThue(thuNhapNam, soNguoiPhuThuoc);
        thuePhaiTra = tinhThuePhaiTra(thuNhapChiuThue);
        System.out.println(hoTen + "\t Thuế bạn phải trả: " + thuePhaiTra + " VND");

    }

    public static float tinhThuNhapChiuThue (float thuNhapNam, short soNguoiPhuThuoc) {
        float thuNhapChiuThue = thuNhapNam - GIAM_TRU_GIA_CANH - (GIAM_TRU_PHU_THUOC * soNguoiPhuThuoc);
        return thuNhapChiuThue;
    }

    public static float tinhThuePhaiTra (float thuNhapChiuThue) {
        float thuePhaiTra;

        if (thuNhapChiuThue <= MUC_CHIU_THUE_1) {
            thuePhaiTra = tinhThueBacMot(thuNhapChiuThue);
        } else if (thuNhapChiuThue <= MUC_CHIU_THUE_2) {
            thuePhaiTra = tinhThueBacHai(thuNhapChiuThue);
        } else if (thuNhapChiuThue <= MUC_CHIU_THUE_3) {
            thuePhaiTra = tinhThueBacBa(thuNhapChiuThue);
        } else if (thuNhapChiuThue <= MUC_CHIU_THUE_4) {
            thuePhaiTra = tinhThueBacBon(thuNhapChiuThue);
        } else if (thuNhapChiuThue <= MUC_CHIU_THUE_5) {
            thuePhaiTra = tinhThueBacNam(thuNhapChiuThue);
        } else if (thuNhapChiuThue <= MUC_CHIU_THUE_6) {
            thuePhaiTra = tinhThueBacSau(thuNhapChiuThue);
        } else {
            thuePhaiTra = tinhThueBacBay(thuNhapChiuThue);
        }

        return thuePhaiTra;
    }

    public static float tinhThueBacMot (float thuNhapChiuThue) {
        float thue = thuNhapChiuThue * THUE_BAC_1;
        return thue;
    }

    public static float tinhThueBacHai (float thuNhapChiuThue) {
        float thue = (thuNhapChiuThue - MUC_CHIU_THUE_1) * THUE_BAC_2 + tinhThueBacMot(MUC_CHIU_THUE_1);
        return thue;
    }

    public static float tinhThueBacBa (float thuNhapChiuThue) {
        float thue = (thuNhapChiuThue - MUC_CHIU_THUE_2) * THUE_BAC_3 + tinhThueBacHai(MUC_CHIU_THUE_2);
        return thue;
    }

    public static float tinhThueBacBon (float thuNhapChiuThue) {
        float thue = (thuNhapChiuThue - MUC_CHIU_THUE_3) * THUE_BAC_4 + tinhThueBacBa(MUC_CHIU_THUE_3);
        return thue;
    }

    public static float tinhThueBacNam (float thuNhapChiuThue) {
        float thue = (thuNhapChiuThue - MUC_CHIU_THUE_4) * THUE_BAC_5 + tinhThueBacBon(MUC_CHIU_THUE_4);
        return thue;
    }

    public static float tinhThueBacSau (float thuNhapChiuThue) {
        float thue = (thuNhapChiuThue - MUC_CHIU_THUE_5) * THUE_BAC_6 + tinhThueBacNam(MUC_CHIU_THUE_5);
        return thue;
    }

    public static float tinhThueBacBay (float thuNhapChiuThue) {
        float thue = (thuNhapChiuThue - MUC_CHIU_THUE_6) * THUE_BAC_7 + tinhThueBacSau(MUC_CHIU_THUE_6);
        return thue;
    }
}
