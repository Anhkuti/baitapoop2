package bai1;

import java.util.Scanner;

public class TH_dayandmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập tháng : ");
        int number = sc.nextInt();

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


