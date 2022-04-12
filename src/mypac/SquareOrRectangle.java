package mypac;

import java.util.Scanner;

public class SquareOrRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Width = ");
        double a = scan.nextInt();
        System.out.print("Height = ");
        double b = scan.nextInt();

        if(a == b)
            System.out.println("The figure is square!");
        else
            System.out.println("The figure is rectangle!");
    }
}
