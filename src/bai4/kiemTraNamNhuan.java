package bai4;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        System.out.println("các năm nhuận từ năm 2000 --> 3000 là : ");
        for (int year = 2000; year <= 3000; year++){
            if (kiemTraNamNhuan(year)) {
                System.out.println(year);
            }
        }
    }
    public static boolean kiemTraNamNhuan(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
