package bai1;

import java.util.Scanner;

public class BT_danhgialuchoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diemChuyenCan, diemKiemTra, diemCuoiKy, diemTrungBinh;

        System.out.println("Hãy nhập điểm chuyên cần: ");
        diemChuyenCan = sc.nextDouble();

        System.out.println("Hãy nhập điểm kiểm tra: ");
        diemKiemTra = sc.nextDouble();

        System.out.println("Hãy nhập điểm cuối kỳ: ");
        diemCuoiKy = sc.nextDouble();

        double DTB = (diemChuyenCan + diemKiemTra + diemCuoiKy) / 3 ;

        if (DTB > 10){
            System.out.println("lỗi");
        }
            else if (DTB >= 8.5) {
            System.out.println("Xếp loại A");
        }
            else if (DTB >=7) {
            System.out.println("Xếp loại B");
        }
            else if (DTB >= 5.5) {
            System.out.println("Xếp loại C");
        }
            else if (DTB >= 4) {
            System.out.println("Xếp loại D");
        }
            else if (DTB < 4){
            System.out.println("Xếp loại F");
        }
            else {
            System.out.println("Lỗi");
        }

    }
}
