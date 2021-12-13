import java.util.Scanner;

public class BaiTap_2 {

    static final int MIN = -50;
    static final int MAX = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = taoMangHaiChieuNgauNhien(scanner);
        inMang(arr);
        int tongSoChan = tinhTongSoChan(arr);
        System.out.println("Tổng số chẵn " + tongSoChan);
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

    public static boolean kiemTraSoDongCot(int soDong, int soCot) {
        return soDong >= 1 && soCot >= 1;
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

    public static int tinhTongSoChan(int[][] arr) {
        int tongSoChan = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0)
                    tongSoChan += arr[i][j];
            }
        }
        return tongSoChan;
    }
}
