import java.util.Scanner;

public class BaiTap_6 {
    //Đề bài: Tìm giá trị x sao cho đoạn [-x; x] chứa tất cả giá trị trong mảng
    //Vậy có 3 bước chính
    //  1. Tìm số lớn nhất trong mảng
    //  2. Tìm số nhỏ nhất trong mảng
    //  3. So sánh giá trị tuyệt đối của 2 số này, giá trị lớn hơn chính là x
    static final int MIN = -100;
    static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] arr = taoMang(nhapChieuDaiMang(scanner), scanner);
        int[] arr = taoMangNgauNhien(nhapChieuDaiMang(scanner));
        inMang(arr);
        System.out.println();
        int x = timX(arr);
        System.out.println("Với x = " + x + " ta có đoạn [-" + x + "," + x + "] chứa tất cả phần tử trong mảng");
    }

    public static int nhapChieuDaiMang(Scanner scanner) {
        System.out.print("Nhập chiều dài mảng: ");
        int arrayLength = Integer.parseInt(scanner.nextLine());
        return arrayLength;
    }

/*    public static int[] taoMang(int arrayLength, Scanner scanner) {
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }*/

    public static int[] taoMangNgauNhien(int arrayLength) {
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        }
        return arr;
    }

    public static void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int timSoLonNhat(int[] arr) {
        int soLonNhat = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > soLonNhat)
                soLonNhat = arr[i];
        }

        return soLonNhat;
    }

    public static int timSoNhoNhat(int[] arr) {
        int soNhoNhat = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < soNhoNhat)
                soNhoNhat = arr[i];
        }

        return soNhoNhat;
    }

    public static int timX(int[] arr) {
        int soLonNhat = timSoLonNhat(arr);
        int soNhoNhat = timSoNhoNhat(arr);
        int maxTuyetDoi = Math.abs(soLonNhat);
        int minTuyetDoi = Math.abs(soNhoNhat);
        int x;

        if (minTuyetDoi > maxTuyetDoi)
            x = minTuyetDoi;
        else
            x = maxTuyetDoi;

        return x;
    }
}
