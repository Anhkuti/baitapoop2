package bai3;

public class TH3_GTLN {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int max = array[0];
        for(int i : array){
           if(i > max){
               max = i;
           }

        }
        System.out.println(max);
    }
}
