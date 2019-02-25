package SS2TH2;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String arrStudent[] = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scn = new Scanner(System.in);
        System.out.print("Mời nhập vào tên học sinh muốn tìm kiếm : ");
        String name = scn.nextLine();
        if (isExit(arrStudent , name)) {
            System.out.println("Học sinh: " + name + " được tìm thấy!");
        }else {
            System.out.println("Học sinh: " + name + " không được tìm thấy!");
        }
    }
    private static boolean isExit(String arr[], String data) {
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i].equals(data)) {
                return true;
            }else {
                return  false;
            }
        }
        return false;
    }
}
