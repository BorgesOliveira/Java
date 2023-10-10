package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02 {
    
    public static void main (String []args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double radius, area;

        System.out.println("Enter the radius of the circle:  ");
        
        radius = sc.nextDouble();

        area = (3.14159 * (radius*radius));
        
        System.out.printf("Area = %.4f",area);
        
        sc.close();
    }


}
