package bai4;

public class UngDungTienTe {
    public static void main(String[] args) {
        double usd = 100;
        double tienVN = ungDungTienTe(usd);
        System.out.println(usd + "$" + " tiền usd tương đương " + tienVN + "VNĐ");
    }

    public static double ungDungTienTe(double usd) {
        double tyGia = 23000;
        double tienVN = usd * tyGia;
        return tienVN;
    }
}
