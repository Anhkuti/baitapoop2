package bai3;

public class BT_Xoa {
    public static void main(String[] args) {
        int[] daySo = {3, 5, 7, 2, 8};
        int[] newArray = new int[daySo.length - 1];
        for (int i = 0; i < daySo.length - 1; i++) {
            newArray[i] = daySo[i + 1];
        }

        for (int i : newArray) {
            System.out.print(i + "  ");
        }
    }
}
