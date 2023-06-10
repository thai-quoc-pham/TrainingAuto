package Demo;

import java.util.Scanner;

public class Ex {
    //Khai báo thư viện nhập ký tự từ bàn phím
    static Scanner scanner = new Scanner(System.in);
    static boolean checkClose = true;

    public static void main(String[] args) {
        //Khai báo biến
        byte exNumber;
        //Sử dụng do while để gọi ex nhiều lần không cần chạy lại
        do {
            //UI chọn ex
            System.out.println("_____________________________________________________________________");
            System.out.println("|   Nhập số thứ tự của Example để chọn Example đó á nha:            |");
            System.out.println("|   1. Example 1             8. Example 8          15. Example 15   |");
            System.out.println("|   2. Example 2             9. Example 9          16. Example 16   |");
            System.out.println("|   3. Example 3             10. Example 10        17. Example 17   |");
            System.out.println("|   4. Example 4             11. Example 11        18. Example 18   |");
            System.out.println("|   5. Example 5             12. Example 12        19. Example 19   |");
            System.out.println("|   6. Example 6             13. Example 13        20. Example 20   |");
            System.out.println("|   7. Example 7             14. Example 14        21. Example 21   |");
            System.out.println("|   0. Close Example                                                |");
            System.out.println("|___________________________________________________________________|");
            System.out.print(" Chọn option số: ");
            //Nhập giá trị nhập vào
            exNumber = scanner.nextByte();
            //Sử dụng switch case để chọn vào đúng ex cần xem
            switch (exNumber) {
                case 0:
                    System.out.println("Close.................................................................");
                    //Check điều kiện để gắn giá trị vào biến điều kiện do while
                    checkClose = (exNumber == 0) ? false : true;
                    break;
                case 1:
                    System.out.println("Example 1 loading.....................................................");
                    System.out.println("");
                    Ex1();
                    checkContinueEx();
                    break;
                case 2:
                    System.out.println("Example 2 loading.....................................................");
                    System.out.println("");
                    Ex2();
                    checkContinueEx();
                    break;
                case 3:
                    System.out.println("Example 3 loading.....................................................");
                    System.out.println("");
                    Ex3();
                    checkContinueEx();
                    break;
                case 4:
                    System.out.println("Example 4 loading.....................................................");
                    System.out.println("");
                    Ex4();
                    checkContinueEx();
                    break;
                case 5:
                    System.out.println("Example 5 loading.....................................................");
                    System.out.println("");
                    Ex5();
                    checkContinueEx();
                    break;
                case 6:
                    System.out.println("Example 6 loading.....................................................");
                    System.out.println("");
                    Ex6();
                    checkContinueEx();
                    break;
                case 7:
                    System.out.println("Example 7 loading.....................................................");
                    System.out.println("");
                    Ex7();
                    checkContinueEx();
                    break;
                case 8:
                    System.out.println("Example 8 loading.....................................................");
                    System.out.println("");
                    Ex8();
                    checkContinueEx();
                    break;
                case 9:
                    System.out.println("Example 9 loading.....................................................");
                    System.out.println("");
                    Ex9();
                    checkContinueEx();
                    break;
                case 10:
                    System.out.println("Example 10 loading....................................................");
                    System.out.println("");
                    Ex10();
                    checkContinueEx();
                    break;
                case 11:
                    System.out.println("Example 11 loading....................................................");
                    System.out.println("");
                    Ex11();
                    checkContinueEx();
                    break;
                case 12:
                    System.out.println("Example 12 loading....................................................");
                    System.out.println("");
                    Ex12();
                    checkContinueEx();
                    break;
                case 13:
                    System.out.println("Example 13 loading....................................................");
                    System.out.println("");
                    Ex13();
                    checkContinueEx();
                    break;
                case 14:
                    System.out.println("Example 14 loading....................................................");
                    System.out.println("");
                    Ex14();
                    checkContinueEx();
                    break;
                case 15:
                    System.out.println("Example 15 loading....................................................");
                    System.out.println("");
                    Ex15();
                    checkContinueEx();
                    break;
                case 16:
                    System.out.println("Example 16 loading....................................................");
                    System.out.println("");
                    Ex16();
                    checkContinueEx();
                    break;
                case 17:
                    System.out.println("Example 17 loading....................................................");
                    System.out.println("");
                    Ex17();
                    checkContinueEx();
                    break;
                case 18:
                    System.out.println("Example 18 loading....................................................");
                    System.out.println("");
                    Ex18();
                    checkContinueEx();
                    break;
                case 19:
                    System.out.println("Example 19 loading....................................................");
                    System.out.println("");
                    Ex19();
                    checkContinueEx();
                    break;
                case 20:
                    System.out.println("Example 20 loading....................................................");
                    System.out.println("");
                    Ex20();
                    checkContinueEx();
                    break;
                case 21:
                    System.out.println("Example 21 loading....................................................");
                    System.out.println("");
                    Ex21();
                    checkContinueEx();
                    break;
                default:
                    System.out.println("Làm gì có Example " + exNumber + " mà chọn.");
                    checkContinueEx();
                    break;
            }
        }
        while (checkClose);
    }

    //Hàm kiểm tra thực hiện tiếp ex
    public static void checkContinueEx() {
        System.out.println("");
        System.out.println("_____________________________________________________________________");
        System.out.print("Tiếp tục xem example khác y/n? ");
        scanner.nextLine();
        String checkContinue = scanner.nextLine();
        if (checkContinue.equalsIgnoreCase("n")) {
            checkClose = false;
        }
    }

    public static void Ex1() {
        System.out.print("Nhập số nguyên muốn kiểm tra chẳn lẻ: ");
        //Gắn giá trị nhập vào biến
        int soNguyen = scanner.nextInt();
        //Thực thi kiểm tra chẳn/lẻ
        if (soNguyen % 2 == 0) {
            System.out.println("Số bạn vừa nhập là số chẳn");
        } else {
            System.out.println("Số bạn vừa nhập là số lẻ");
        }
    }

    public static void Ex2() {
        System.out.print("Nhập số nguyên a: ");
        //Gắn giá trị nhập vào biến
        int soNguyenA = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        //Gắn giá trị nhập vào biến
        int soNguyenB = scanner.nextInt();
        //Thực thi so sánh a và b
        if (soNguyenA < soNguyenB) {
            System.out.println("Số nguyên A nhỏ hơn số nguyên B");
        } else {
            System.out.println("Số nguyên A lớn hơn hoặc bằng số nguyên B");
        }
    }

    public static void Ex3() {
        scanner.nextLine();
        System.out.print("Nhập tên thứ 1: ");
        //Gắn giá trị nhập vào biến
        String name1 = scanner.nextLine();
        System.out.print("Nhập tên thứ 2: ");
        //Gắn giá trị nhập vào biến
        String name2 = scanner.nextLine();
        //Thực thi so sánh tên
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("2 người này cùng tên");
        } else {
            System.out.println("2 người này khác tên");
        }
    }

    public static void Ex4() {
        System.out.print("Nhập số nguyên a: ");
        //Gắn giá trị nhập vào biến
        int soNguyenA = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        //Gắn giá trị nhập vào biến
        int soNguyenB = scanner.nextInt();
        System.out.print("Nhập số nguyên c: ");
        //Gắn giá trị nhập vào biến
        int soNguyenC = scanner.nextInt();
        //Xử lý kiểm tra số lớn nhất
        int temp;
        //So sánh A và B
        if (soNguyenA > soNguyenB) {
            temp = soNguyenA;
        } else if (soNguyenA < soNguyenB) {
            temp = soNguyenB;
        } else {
            temp = soNguyenA;
        }
        //So sánh số lớn hơn với B
        int temp2 = (temp < soNguyenC) ? (soNguyenC) : (temp);
        //Xuất kết qủa
        System.out.println("Số lớn nhất trong 3 số là: " + temp2);
    }

    public static void Ex5() {
        System.out.print("Nhập số nguyên a: ");
        //Gắn giá trị nhập vào biến
        int soNguyenA = scanner.nextInt();
        //Kiển tra số nguyên a
        if (10 <= soNguyenA && soNguyenA <= 100) {
            System.out.println("Số " + soNguyenA + " nằm trong [10,100]");
        } else {
            System.out.println("Số " + soNguyenA + " không nằm trong [10,100]");
        }
    }

    public static void Ex6() {
        System.out.print("Nhập tháng muốn kiểm tra số ngày: ");
        //Gắn giá trị nhập vào biến
        int thang = scanner.nextInt();
        //Xử lý kiểm tra số ngày trong tháng
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            System.out.println("Tháng " + thang + " có 31 ngày.");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Tháng " + thang + " có 30 ngày.");
        } else if (thang == 2) {
            System.out.println("Tháng 2 có 28 hoặc 29 ngày.");
        } else {
            System.out.println("Làm gì có tháng " + thang + " trong năm");
        }
    }

    public static void Ex7() {
        System.out.print("Nhập số muốn có dịch sang tiếng Anh (1-10): ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Night");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Off of Scope");
                break;
        }
    }

    public static void Ex8() {
        System.out.print("Nhập tháng muốn kiểm tra số ngày: ");
        //Gắn giá trị nhập vào biến
        int thang = scanner.nextInt();
        //Xử lý kiểm tra số ngày trong tháng
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày.");
                break;
            case 2:
                System.out.println("Tháng có 28 or 29 ngày.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày.");
                break;
            default:
                System.out.println("Làm gì có tháng " + thang + " trong năm");
                break;
        }
    }

    public static void Ex9() {
        System.out.print("Nhập số muốn viết ra: ");
        int munber = scanner.nextInt();
        for (int i = 1; i <= munber; i++) {
            System.out.print(i + " ");
        }
    }

    public static void Ex10() {
        System.out.print("Nhập số bắt đầu: ");
        int soBatDau = scanner.nextInt();
        System.out.print("Nhập số kết thúc: ");
        int soKetThuc = scanner.nextInt();
        for (; soBatDau <= soKetThuc; soBatDau++) {
            System.out.print(soBatDau + " ");
        }
    }

    public static void Ex11() {
        int tongChan = 0;
        int tongLe = 0;
        for (byte i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                tongChan += i;
            } else {
                tongLe += i;
            }
        }
        System.out.println("Tổng các số chẳn từ 1-10: " + tongChan);
        System.out.println("Tổng các số lẻ từ 1-10: " + tongLe);
    }

    public static void Ex12() {
        int tong = 0;
        System.out.print("Nhập số nguyên a: ");
        int soA = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int soB = scanner.nextInt();
        if (soA < soB) {
            for (int i = soA; i <= soB; i++) {
                tong += i;
            }
            System.out.println("Tổng các số của đoạn " + soA + " và " + soB + " là: " + tong);
        } else if (soA > soB) {
            for (int i = soB; i <= soA; i++) {
                tong += i;
            }
            System.out.println("Tổng các số của đoạn " + soB + " và " + soA + " là: " + tong);
        } else {
            System.out.println("Số A và số B là giống nhau. Tổng của đoạn là: " + soA);
        }
    }

    public static void Ex13() {
        int tongChan = 0;
        int tongLe = 0;
        System.out.print("Nhập số nguyên a: ");
        int soNguen = scanner.nextInt();
        for (int i = 1; i <= soNguen; i++) {
            if (i % 2 == 0) {
                tongChan += i;
            } else {
                tongLe += i;
            }
        }
        System.out.println("Tổng các số chẳn từ 0-" + soNguen + ": " + tongChan);
        System.out.println("Tổng các số lẻ từ 0-" + soNguen + ": " + tongLe);
    }

    public static void Ex14() {
        int tong = 0;
        System.out.print("Nhập số nguyên a: ");
        int soA = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int soB = scanner.nextInt();
        if (soA < soB) {
            for (int i = soA; i <= soB; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (soA > soB) {
            for (int i = soB; i <= soA; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        else {
            System.out.println("Số A và số B là: " + soA);
        }
    }

    public static void Ex15() {
        int tich = 1;
        System.out.print("Nhập số nguyên a: ");
        int soA = scanner.nextInt();
        for (int i = 1; i <= soA; i++) {
            tich *= i;
        }
        System.out.println(soA + "! là " + tich);
    }

    public static void Ex16() {
        System.out.println("Example này chưa học tới");
    }

    public static void Ex17() {
        System.out.println("Example này chưa học tới");
    }

    public static void Ex18() {
        System.out.println("Example này chưa học tới");
    }

    public static void Ex19() {
        System.out.println("Example này chưa học tới");
    }

    public static void Ex20() {
        System.out.println("Example này chưa học tới");
    }

    public static void Ex21() {
        System.out.println("Example này chưa học tới");
    }

}
