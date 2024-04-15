package bai1;

import java.util.Scanner;

public class TH_ptbacnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("a :");
        a =sc.nextDouble();
        System.out.print("b :");
        b = sc.nextDouble();
        System.out.print("c :");
        c = sc.nextDouble();
        if (a != 0){
            double answer = (c - b) / a;
            System.out.print("x = " + answer);
        } else if  ( b == c) {
            System.out.print("Vô số nghiệm");
        } else {
            System.out.print("Vô nghiệm");
        }
    }
}
