package bai4;

import java.util.Scanner;

public class DayAndMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bạn hãy nhập tháng: ");
        int number = sc.nextInt();
        tinhNgayTrongThang(number);

    }

    public static void tinhNgayTrongThang(int number) {
        switch (number) {
            case 2:
                System.out.println("Tháng " + number + " có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + number + " có 31 ngày");
                break;

            default:
                System.out.println("Tháng " + number + " có 30 ngày");

        }
    }
}
