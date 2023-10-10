package Exercises;

import java.util.Scanner;

public class Exercise_03 {
    
    public static void main (String []args){
        
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;
        
        System.out.println("Enter with four numbers: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.println("Difference: " + ((A*B)-(C*D)));

        sc.close();
    }


}
