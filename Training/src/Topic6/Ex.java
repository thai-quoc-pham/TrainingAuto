package Topic6;

public class Ex {

    public static void main(String[] args) {
        System.out.println("Example 1.......................................");
        Ex1();
        System.out.println("");
        System.out.println("Example 2.......................................");
        Ex2();
        System.out.println("");
        System.out.println("Example 3.......................................");
        Ex3();
        System.out.println("");
        System.out.println("Example 4.......................................");
        Ex4();
        System.out.println("");
        System.out.println("Example 5.......................................");
        Ex5();
        System.out.println("");
        System.out.println("Example 6.......................................");
        Ex6();
    }

    public static void Ex1() {
        int arr[] = {2, 7, 6, 8, 9};
        int temp = 0;
        for (int i : arr) {
            if (i > temp) {
                temp = i;
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + temp);
    }

    public static void Ex2() {
        int arr[] = {2, 7, 6, 8, 9};
        System.out.println("Tổng của phần tử đầu tiền và cuối cùng trong mảng là: " + (arr[0] + arr[(arr.length - 1)]));
    }

    public static void Ex3() {
        int arr[] = {2, 7, 6, 8, 9, 16, 17, 20};
        System.out.print("Các số chẳn trong mảng là: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Ex4() {
        float arr[] = {3, -7, 2, 5, 9, -6, 10, 12};
        float tong = 0;
        for (float i : arr) {
            if (i > 0 && i % 2 != 0) {
                tong += i;
            }
        }
        System.out.println("Tổng các số lẻ lớn hơn 0 là: " + (int) tong);
    }

    public static void Ex5() {
        float arr[] = {3, -7, 2, 5, 9, -6, 10, 12};
        System.out.print("Các số từ 0 đến 10 trong mảng là: ");
        for (float i : arr) {
            if (0 <= i && i <= 10) {
                System.out.print((int) i + " ");
            }
        }
    }

    public static void Ex6() {
        float arr[] = {3, 5, 7, 30, 10, 5, 8, 23, 0, -5};
        float tong = 0;
        for (float i : arr) {
            tong += i;
        }
        System.out.println("Tổng các phần tử trong mảng là: " + (int) tong);
        System.out.println("Trung bình cộng các giá trị trong mảng là: " + (tong / (arr.length)));
    }
}
