import java.util.Scanner;

public class BaiTap_5 {
    static final int MIN = -100;
    static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] arr = taoMang(nhapChieuDaiMang(scanner), scanner);
        int[] arr = taoMangNgauNhien(nhapChieuDaiMang(scanner));
        inMang(arr);
        System.out.println();
        System.out.print("Nhập x: ");
        int x = Integer.parseInt(scanner.nextLine());
        timGiaTriGanNhat(tinhKhoangCach(arr, x), arr);
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

    public static int[] tinhKhoangCach(int[] arr, int x) {
        int[] khoangCach = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            khoangCach[i] = Math.abs(arr[i] - x);
        }
        return khoangCach;
    }

    public static void timGiaTriGanNhat(int[] khoangCach, int[] arr) {
        int khoangCachNhoNhat = khoangCach[0];
        int viTriGanNhat = 0;
        int[] temp = new int[khoangCach.length];

        for (int i = 1; i < khoangCach.length; i++) {
            if (khoangCach[i] < khoangCachNhoNhat) {
                khoangCachNhoNhat = khoangCach[i];
                viTriGanNhat = i;
            }
        }

        for (int i = viTriGanNhat; i < khoangCach.length; i++) {
            if (khoangCach[i] == khoangCachNhoNhat) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
