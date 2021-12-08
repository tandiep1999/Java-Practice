import java.util.Scanner;

public class BaiTap_1 {

    static final int MIN = -100;
    static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = taoMangHaiChieuNgauNhien(scanner);
        inMang(arr);
        int soChanDauTien = timSoChanDauTien(arr);

        System.out.println();

        if (soChanDauTien == 0)
            System.out.println("Mảng không có bất kỳ số chẵn nào");
        else
            System.out.println(soChanDauTien);
    }

    public static int nhapSoDong(Scanner scanner) {
        System.out.print("Nhập số dòng cho mảng 2 chiều: ");
        int row = Integer.parseInt(scanner.nextLine());
        return row;
    }

    public static int nhapSoCot(Scanner scanner) {
        System.out.print("Nhập số cột cho mảng 2 chiều: ");
        int col = Integer.parseInt(scanner.nextLine());
        return col;
    }

    public static int[][] taoMangHaiChieuNgauNhien(Scanner scanner) {
        int row = nhapSoDong(scanner);
        int col = nhapSoCot(scanner);
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
            }
        }
        return arr;
    }

    public static void inMang(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int timSoChanDauTien(int[][] arr) {
        int soChanDauTien;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    return soChanDauTien = arr[i][j];
                }
            }
        }
        return soChanDauTien = 0;
    }
}
