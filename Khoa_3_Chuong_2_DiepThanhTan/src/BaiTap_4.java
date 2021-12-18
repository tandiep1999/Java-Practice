import java.util.Scanner;

public class BaiTap_4 {
    //Đề bài: Tìm số nguyên tố cuối cùng trong mảng. Nếu ko có số nguyên tố thì trả về -1
    // ==> Duyệt từ cuối mảng
    static final int MIN = -100;
    static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] arr = taoMang(nhapChieuDaiMang(scanner), scanner);
        int[] arr = taoMangNgauNhien(nhapChieuDaiMang(scanner));
        inMang(arr);
        System.out.println();
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

    public static boolean kiemTraSoNguyenTo(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int timViTriSoNguyenToCuoiCung(int[] arr) {
        for (int i = 0; i <)

        return -1;
    }
}
