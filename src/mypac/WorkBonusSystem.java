package mypac;

import java.util.Scanner;

public class WorkBonusSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary = scan.nextInt();
        System.out.print("Enter years in company: ");
        int year = scan.nextInt();

        if(year > 5 && year <= 10)
            System.out.println("Salary Bonus: " + (salary + salary*0.05));
        else if(year > 10 && year <= 15)
            System.out.println("Salary Bonus: " + (salary + salary*0.07));
        else if(year > 15)
            System.out.println("Salary Bonus: " + (salary + salary*0.1));
        else
            System.out.println("No salary bonus!");
    }
}
