package mypac;

import java.util.Scanner;

public class SportsShopDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter wanted product: ");
        String product = scan.nextLine();
        System.out.print("Enter product price ");
        int price = scan.nextInt();

        if(product.matches("clothes"))
            System.out.println("Discount on " + product + " is " + (price - price*0.2));
        else if(product.matches("shoes"))
            System.out.println("Discount on " + product + " is " + (price - price*0.1));
        else
            System.out.println("Discount on " + product + " is " + (price - price*0.05));
    }
}
