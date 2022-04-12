package mypac;

import java.util.Scanner;

public class SchoolScoreSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = scan.nextInt();

        if(score < 25)
            System.out.println("Grade: F");
        else if(score >= 25 && score < 45)
            System.out.println("Grade: E");
        else if(score >= 45 && score < 50)
            System.out.println("Grade: D");
        else if(score >= 50 && score < 60)
            System.out.println("Grade: C");
        else if(score >= 60 && score < 80)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: A");
    }
}
