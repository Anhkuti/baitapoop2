package bai3;

import java.time.LocalTime;
import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.now();
        while (true){
            System.out.println("Mời bạn nhập dữ liệu.");
            String a = sc.nextLine();
            int gio = time.getHour();
            int phut = time.getMinute();
            switch (a) {
                case "time" :
                    System.out.println("Bây giờ là: " + gio + ":" + phut);
                    break;
                case "exit":
//                    System.exit(0);
                    return;
//                    break;
                default:
                    System.out.println("tớ hông hịu");
            }

        }




    }
}
