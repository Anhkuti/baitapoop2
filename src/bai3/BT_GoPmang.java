package bai3;

public class BT_GoPmang {
    public static void main(String[] args) {
        int[] daySo1 = {2, 3, 4};
        int[] daySo2 = {5, 6, 7};
        int[] daySo3 = new int[daySo1.length + daySo2.length];
        int index3 = 0;
        for (int i = 0; i < daySo1.length; i++) {
            daySo3[index3] = daySo1[i];
            index3++;
        }

        for (int j = 0; j < daySo2.length; j++) {
            daySo3[index3] = daySo2[j];
            index3++;
        }

            for (int i : daySo3) {
                System.out.println(i);
            }

        }
    }
