import java.util.Scanner;

public class BaiTap_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = taoMangHaiChieu(scanner);
        inMang(arr);

        System.out.println();
        int colChoice;
        do {
            System.out.print("Nhập vị trí cột kiểm tra giảm dần ");
            colChoice = Integer.parseInt(scanner.nextLine());
        } while (colChoice >= arr[0].length || colChoice < 0);

        if (giamDan(arr, colChoice))
            System.out.println("Cột " + colChoice + " giảm dần");
        else
            System.out.println("Cột " + colChoice + " không giảm dần");

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

    public static int[][] taoMangHaiChieu(Scanner scanner) {
        int row, col;

        do {
            row = nhapSoDong(scanner);
            col = nhapSoCot(scanner);
        } while (!kiemTraSoDongCot(row, col));

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(scanner.nextLine());
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

    public static boolean giamDan(int[][] arr, int colChoice) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i][colChoice] < arr[i + 1][colChoice])
                return false;
        }
        return true;
    }
}
