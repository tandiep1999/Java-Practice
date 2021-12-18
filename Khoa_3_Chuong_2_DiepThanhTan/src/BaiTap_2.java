import java.util.Scanner;

public class BaiTap_2 {
    //Đề bài: Tìm vị trí của giá trị chẵn đầu tiên. Nếu không có thì trả về -1
    static final int MIN = -100;
    static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = taoMangNgauNhien(nhapChieuDaiMang(scanner));
        inMang(arr);
        System.out.println();
        System.out.println("Vị trí của giá trị chẵn đầu tiên là " + timGiaTriChanDauTien(arr));
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

    public static int timGiaTriChanDauTien(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                return i;
        }
        return -1;
    }
}
