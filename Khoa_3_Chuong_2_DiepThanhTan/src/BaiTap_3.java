import java.util.Scanner;

public class BaiTap_3 {
    //Đề bài: Tìm vị trí của giá trị dương nhỏ nhất (có thể có nhiều giá trị này). Nếu không có giá trị dương nào thì trả về -1
    static final int MIN = -100;
    static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = taoMang(nhapChieuDaiMang(scanner), scanner);
        //int[] arr = taoMangNgauNhien(nhapChieuDaiMang(scanner));
        inMang(arr);
        System.out.println();

        if (timViTriDuongDauTien(arr) == -1) {
            System.out.println("Mảng không có số dương nào");
        }
        else {
            System.out.print("Vị trí có số dương nhỏ nhất là ");
            timGiaTriDuongNhoNhat(arr);
        }
    }

    public static int nhapChieuDaiMang(Scanner scanner) {
        System.out.print("Nhập chiều dài mảng: ");
        int arrayLength = Integer.parseInt(scanner.nextLine());
        return arrayLength;
    }

    public static int[] taoMang(int arrayLength, Scanner scanner) {
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }

/*    public static int[] taoMangNgauNhien(int arrayLength) {
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        }
        return arr;
    }*/

    public static void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int timViTriDuongDauTien(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                return i;
        }
        return -1;
    }

    public static void timGiaTriDuongNhoNhat(int[] arr) {
        int giaTriDuongNhoNhat = arr[timViTriDuongDauTien(arr)];
        int[] temp = new int[arr.length];

        // Tìm giá trị dương nào là nhỏ nhất
        for (int i = timViTriDuongDauTien(arr); i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < giaTriDuongNhoNhat)
                giaTriDuongNhoNhat = arr[i];
        }

        //Tìm các vị trí mà tại đó giá trị = với giá trị dương nhỏ nhất
        for (int i = timViTriDuongDauTien(arr); i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] <= giaTriDuongNhoNhat)
                temp[i]++;
        }

        //In các giá trị dương nhỏ nhất
        for (int i = timViTriDuongDauTien(arr); i < arr.length; i++) {
            if (temp[i] > 0)
                System.out.print(i + " ");
        }
    }
}
