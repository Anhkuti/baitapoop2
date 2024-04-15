package bai2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TH_tienLai {
    public static void main(String[] args) {
        double tien = 1.0;
        double thang = 1;
        double laisuat = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        tien = input.nextInt();
        System.out.println("Nhập số tháng: ");
        thang = input.nextInt();
        System.out.println("NHập lãi suất hàng tháng theo %: ");
        laisuat = input.nextDouble();
        double tongtienlai = 0;
        for (int i =0; i < thang; i++) {
            tongtienlai += tien * (laisuat / 100) / 12 * thang;
        }
        System.out.println("Tổng tiền lãi: " + tongtienlai);
    }
}
