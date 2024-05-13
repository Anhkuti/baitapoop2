package bai4;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;
        giaiPhuongTrinh(a, b, c);
    }

    public static void giaiPhuongTrinh(double a, double b, double c) {
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.print("x = " + answer);
        } else if (b == c) {
            System.out.print("Vô số nghiệm");
        } else {
            System.out.print("Vô nghiệm");
        }
    }
}
