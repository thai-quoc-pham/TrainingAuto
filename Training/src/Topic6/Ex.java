package Topic6;

import java.util.Scanner;

public class Ex {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Ex1();
        Ex2();
    }

    public static void Ex1() {
        int count = 0;
        System.out.print("Nhập chuỗi kí tự: ");
        String chuoi = scanner.nextLine();
        char sub[] = chuoi.toCharArray();
        for(int i = 0; i < sub.length; i++) {
            if (Character.isUpperCase(sub[i])){
                count++;
            }
        }
        System.out.println("Số ký tự viết hoa trong chuỗi: " + count);
    }

    public static void Ex2() {
        int countA = 0;
        String chuoi = "Automation Testing 345 Tutorials Online 789";
        //Câu a
        String subA[] = chuoi.split("");
        for (int i = 0; i < subA.length; i++) {
            if(subA[i].equalsIgnoreCase("a")) {
                countA++;
            }
        }
        System.out.println("Số lượng kí tự a là: " + countA);
        //Câu b
        boolean containsTesting = chuoi.contains("Testing");
        if (containsTesting) {
            System.out.println("Chuỗi trên có chứa chữ Testing.");
        }
        else {
            System.out.println("Chuỗi trên không chứa chữ Testing.");
        }
        //Câu c
        boolean checkStart = chuoi.startsWith("Automation");
        if (checkStart) {
            System.out.println("Chuỗi trên bắt đầu bằng chữ Automation.");
        }
        else {
            System.out.println("Chuỗi trên không bắt đầu bằng chữ Automation.");
        }
        //Câu d
        boolean checkEnd = chuoi.endsWith("Online");
        if (checkEnd) {
            System.out.println("Chuỗi trên kết thúc bằng chữ Online.");
        }
        else {
            System.out.println("Chuỗi trên không kết thúc bằng chữ Online.");
        }
        //Câu e
        System.out.println("Vị trí của từ Tutorials là: " + chuoi.indexOf("Tutorials"));
        //Câu f
        String cloneChuoi = chuoi;
        cloneChuoi.replace("Online","Offline");
        System.out.println(cloneChuoi);
        //Câu g
        int count = 0;
        String[] subChuoi = chuoi.split("");
        for (int i = 0; i < subChuoi.length; i++) {
            if (subChuoi[i].matches("[0-9]+")) {
                count++;
            }
        }
        System.out.println("Số ký tự số trong chuỗi: " + count);
    }
}
