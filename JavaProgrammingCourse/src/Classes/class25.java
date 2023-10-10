package Classes;
import java.util.Locale;
import java.util.Scanner;

public class class25 {
     public static void main(String []args){
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          Locale.setDefault(Locale.US);

          String x;
          x = sc.next();
          System.out.println("Você digitou " + x);

          int number1;
          number1 = sc.nextInt();
          System.out.println("Você digitou: "+ number1);

          double number2;
          number2 = sc.nextDouble();
          System.out.printf("Você digitou: %.2f." ,number2);
          
          char b;
          b =  sc.next().charAt(0);
          System.out.println("Você Digitou"+ b); 
          sc.close();
     }
}
