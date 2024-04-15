package bai2;

import java.util.Scanner;

public class TH_Geometry {
    public static void main(String[] args) {
        //Khai báo biến choice lưu giá trị chọn lựa
        int luachon = -1;
        //Tạo đối tượng input thuộc lớp Scanner để nhập liệu
        Scanner input = new Scanner(System.in);
        /*
        Chúng ta sẽ cần hiển thị thông tin menu như minh hoạ sau:
        Explain
        Menu
        1. vẽ hình tam giác
        2. vẽ hình vuông
        3. vẽ hình chữ nhật
        0. thoát
        Nhập lựa chọn của bạn:
         */
        while (luachon != 0) {
            System.out.println("Menu");
            System.out.println("1. Vẽ Hình Tam Giác");
            System.out.println("2. Vẽ Hình Vuông");
            System.out.println("3. Vẽ Hình Chữ Nhật");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            luachon = input.nextInt();


            switch (luachon) {
                case 1:
                    System.out.println("Vẽ Hình Tam Giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Vẽ Hình Vuông");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Vẽ Hình Chữ Nhật");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Kh Có Lựa Chọn này");
            }
        }




    }
}
