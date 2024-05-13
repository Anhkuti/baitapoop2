package bai4;

public class GTNN_GTLN {
    public static void main(String[] args) {
        int[] mangSo = {2, 3, 6, 9, 7, 8, 1};
        int soNhoNhat = timSoNhoNhat(mangSo);
        int soLonNhat = timSoLonNhat(mangSo);
        System.out.println("So nho nhat là : " + soNhoNhat);
        System.out.println("So lon nhat là : " + soLonNhat);
    }

    public static int timSoNhoNhat(int[] mangSo) {
        int min = mangSo[0];
        for (int i = 0; i <= mangSo.length - 1; i++) {
            if (mangSo[i] < min) {
                min = mangSo[i];
            }
        }
        return min;
    }


    public static int timSoLonNhat(int[] mangSo) {
        int max = mangSo[0];
        for (int j = 0; j <= mangSo.length - 1; j++) {
            if (mangSo[j] > max) {
                max = mangSo[j];
            }
        }
        return max;
    }


}
