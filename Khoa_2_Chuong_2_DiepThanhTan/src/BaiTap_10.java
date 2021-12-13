import java.util.Scanner;

public class BaiTap_10 {
    static final int MIN = -50;
    static final int MAX = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = taoMangHaiChieuNgauNhien(scanner);
        inMang(arr);
        lietKeCacDongCoSoAm(arr);
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

    public static boolean kiemTraSoDongCot(int row, int col) {
        return row >= 1 && col >= 1;
    }

    public static int[][] taoMangHaiChieuNgauNhien(Scanner scanner) {
        int row, col;

        do {
            row = nhapSoDong(scanner);
            col = nhapSoCot(scanner);
        } while (!kiemTraSoDongCot(row, col));

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

    public static void lietKeCacDongCoSoAm(int[][] arr) {
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < 0) {
                    temp[i]++;
                    continue;
                }
            }
        }

        System.out.print("\nCác dòng có chứa giá trị âm là ");
        for (int i = 0; i < arr.length; i++) {
            if (temp[i] > 0)
                System.out.print(i + " ");
        }
    }
}
