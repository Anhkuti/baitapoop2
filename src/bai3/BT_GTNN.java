package bai3;

public class BT_GTNN {
    public static void main(String[] args) {
        int[] daySo = {2, 4, 6, 3, 7, 8, 1};
        int min = daySo[2];
        for (int i : daySo) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}

