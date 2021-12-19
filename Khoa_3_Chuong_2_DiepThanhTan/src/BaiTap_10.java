import java.util.Scanner;

public class BaiTap_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] arr = taoMang(nhapChieuDaiMang(scanner), scanner);
        inMang(arr);
        System.out.println();
        int search = search(arr);
        if (search == - 1)
            System.out.println("Mảng không có giá trị nào lớn hơn 2020");
        else
            System.out.println("Giá trị đầu tiên lớn hơn 2020 là " + arr[search] + " tại vị trí " + search);
    }

    public static int nhapChieuDaiMang(Scanner scanner) {
        System.out.print("Nhập chiều dài mảng: ");
        int arrayLength = Integer.parseInt(scanner.nextLine());
        return arrayLength;
    }

    public static float[] taoMang(int arrayLength, Scanner scanner) {
        float[] arr = new float[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = Float.parseFloat(scanner.nextLine());
        }
        return arr;
    }

    public static void inMang(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int search(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 2020)
                return i;
        }
        return -1;
    }
}
