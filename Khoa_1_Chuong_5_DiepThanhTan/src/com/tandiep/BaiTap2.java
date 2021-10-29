package com.tandiep;

public class BaiTap2 {

    public static void main(String[] args) {
        short n = 0;
        short total = 0;
        while(total < 10000) {
            n++;
            total += n;
        }
        System.out.println("Số cần tìm là " + n);
    }

}
