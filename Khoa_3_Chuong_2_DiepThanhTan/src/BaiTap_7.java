import java.util.Scanner;

public class BaiTap_7 {
    static final int MIN = -100;
    static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] arr = taoMang(nhapChieuDaiMang(scanner), scanner);
        int[] arr = taoMangNgauNhien(nhapChieuDaiMang(scanner));
        inMang(arr);
        System.out.println();

        int giaTriDuoi, giaTriTren;
        do {
            System.out.println("Hãy nhập giá trị dưới và trên (giá trị dưới x phải nhỏ hơn giá trị trên y)");
            giaTriDuoi = nhapGiaTriDuoi(scanner);
            giaTriTren = nhapGiaTriTren(scanner);
        } while(!(giaTriDuoi < giaTriTren));
        int x = search(arr, giaTriDuoi, giaTriTren);
        if (x == -1)
            System.out.println("Mảng không có phần tử nào nằm trong đoạn [" + giaTriDuoi + "," + giaTriTren + "]");
        else
            System.out.println("Giá trị đầu tiên trong mảng nằm trong khoảng [" + giaTriDuoi + "," + giaTriTren + "] là " + x);
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

    public static int nhapGiaTriDuoi(Scanner scanner) {
        System.out.print("Nhập giá trị dưới x: ");
        int x = Integer.parseInt(scanner.nextLine());
        return x;
    }

    public static int nhapGiaTriTren(Scanner scanner) {
        System.out.print("Nhập giá trị trên y: ");
        int y = Integer.parseInt(scanner.nextLine());
        return y;
    }

    public static int search(int[] arr, int giaTriDuoi, int giaTriTren) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= giaTriDuoi && arr[i] <= giaTriTren)
                return arr[i];
        }
        return -1;
    }
}
