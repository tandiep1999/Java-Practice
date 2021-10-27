package com.tandiep;

public class BaiTap2 {

    public static void main(String[] args) {
        short n = 1;
        short total = 0;
        while(total < 10000) {
            total += n;
            n++;
        }
        System.out.println("Số cần tìm là " + n);
    }

}
