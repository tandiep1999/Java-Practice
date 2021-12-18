import java.util.Scanner;

public class BaiTap_1 {
    //Đề bài: Tìm vị trí mà giá trị tại vị trí là giá trị nhỏ nhất trong mảng
    // ==> Vị trí đầu tiên
    static final int MIN = -100;
    static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = taoMangNgauNhien(nhapChieuDaiMang(scanner));
        inMang(arr);
        System.out.println();
        timGiaTriNhoNhat(arr);
    }

    public static int nhapChieuDaiMang(Scanner scanner) {
        System.out.print("Nhập chiều dài mảng: ");
        int arrayLength = Integer.parseInt(scanner.nextLine());
        return arrayLength;
    }

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

    public static void timGiaTriNhoNhat(int[] arr) {
        int giaTriNhoNhat = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < giaTriNhoNhat) {
                giaTriNhoNhat = arr[i];
                index = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất là " + giaTriNhoNhat + " tại vị trí " + index);
    }
}
