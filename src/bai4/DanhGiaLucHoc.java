package bai4;

import java.util.Scanner;

public class DanhGiaLucHoc {
    public static void main(String[] args) {
        double diemChuyenCan = 10;
        double diemGiuaKy = 9;
        double diemCuoiKy = 10;
        double diemTrungBinh = tinhDTB(diemChuyenCan, diemGiuaKy, diemCuoiKy);
        System.out.println("diem : " + diemTrungBinh);

        if (diemTrungBinh > 10) {
            System.out.println("lỗi");
        } else if (diemTrungBinh >= 8.5) {
            System.out.println("Xếp loại A");
        } else if (diemTrungBinh >= 7) {
            System.out.println("Xếp loại B");
        } else if (diemTrungBinh >= 5.5) {
            System.out.println("Xếp loại C");
        } else if (diemTrungBinh >= 4) {
            System.out.println("Xếp loại D");
        } else if (diemTrungBinh < 4) {
            System.out.println("Xếp loại F");
        } else {
            System.out.println("Lỗi");
        }
    }

    public static double tinhDTB(double diemChuyenCan, double diemGiuaKy, double diemCuoiKy) {
        //tính diẻm dtb
        return (diemChuyenCan + diemGiuaKy + diemCuoiKy) / 3;
    }
}
