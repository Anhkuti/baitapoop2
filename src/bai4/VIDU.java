package bai4;

public class VIDU {
    public static void main(String[] args) {
        System.out.println(giaiThua(3));
    }

    public static int giaiThua(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * giaiThua(n - 1);
        }
    }
}
