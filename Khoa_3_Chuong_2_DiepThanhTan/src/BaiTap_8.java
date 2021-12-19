import java.util.Scanner;

public class BaiTap_8 {

//    static final int MIN = -100;
//    static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = taoMang(nhapChieuDaiMang(scanner), scanner);
//        int[] arr = taoMangNgauNhien(nhapChieuDaiMang(scanner));
        inMang(arr);
        System.out.println();

        int soCanTim = search(arr);
        if (soCanTim == 0)
            System.out.println("Mảng không có số nào có dạng 2^k");
        else
            System.out.println("Giá trị đầu tiên trong mảng có dạng 2^k là " + soCanTim);
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

    public static boolean coDang2K(int n) {
        // Ý tưởng là: Một số có dạng 2^k khi chia hết cho 2 liên tục, kết quả cuối cùng ta có sẽ là 1
        // Như vậy nếu chia một số cho 2 liên tục, nếu kq cuối cùng là 1 thì số đó có dạng 2^k
        // Ngoại lệ: Ví dụ n = 10
        // -> 10 / 2 = 5
        // -> 5 / 2 = 2 (Do phép chia nguyên) -> 2 / 2 = 1 (Kết quả vẫn là 1 dù số 10 không phải dạng 2^k)
        // Để kiểm tra lại, ta đếm số lần chia cho 2, tức là tìm k
        // Sau đó so sánh 2^k với n ban đầu, nếu 2^k = n thì kết quả đúng, còn nếu 2^k != n thì kết quả sai
        // Ví dụ n = 10 ta sẽ có k = 3; sau đó tính 2^k = 2^3 = 8
        // 8 != 10 ==> n cần tìm ko có dạng 2^k

        int temp1 = n;
        int count = 0;

        do {
            temp1 /= 2;
            count++;
        } while (temp1 > 1);

        int temp2 = temp1;

        // Kiểm tra lại
        while (count > 0) {
            temp2 *= 2;
            count--;
        }

        if (temp1 == 1 && temp2 == n)
            return true;
        else
            return false;
    }

    public static int search(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(coDang2K(arr[i]))
                return arr[i];
        }
        return 0;
    }
}
