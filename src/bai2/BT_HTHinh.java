package bai2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BT_HTHinh {
    public static void main(String[] args) {
        int luachon = -1;
        Scanner input = new Scanner(System.in);
        while (luachon != 0) {
            System.out.println("Menu");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. tam giác (Góc vuông)");
            System.out.println("3.Hình tam giác vuông cân ");
            System.out.println("0. thoát");
            System.out.println("Nhập lựa chọn: ");
            luachon = input.nextInt();

            switch (luachon) {
                case 1:
                    System.out.println("HCN");
                    for (int i = 0; i < 3; i++){
                        for (int j = 0; j < 6; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;

                case 2:
                    System.out.println("hình tam giác dưới cùng bên phải");
                    for(int i=5; i>=1; i--){
                        for(int j=1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Tam giác vuông cân");
                    for (int i = 7; i >= 1; i--) {
                        for (int j = i; j < 7; j++) {
                            System.out.print(" ");
                        }

                        for (int k = 0; k < (2 * i - 1) ; k++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }





            }

        }
    }
}
