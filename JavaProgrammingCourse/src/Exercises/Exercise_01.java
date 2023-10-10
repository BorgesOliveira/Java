package Exercises;

import java.util.Scanner;


public class Exercise_01{

    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.println("Type two integer numbers: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        
        System.out.printf("The sum of (%d) + (%d) é %d", number1, number2, (number1 + number2));
        
        sc.close();
    }

}