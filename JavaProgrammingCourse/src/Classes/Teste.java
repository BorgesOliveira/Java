package Classes;
import java.util.Locale;

public class Teste {
    public static void main(String[] args){
        
        double A = 2549885.398784525;
        double B = 35154.2141;
        System.out.println("Hello World!");
        System.out.println("Bom dia.");
        System.out.println(A);
        System.out.printf("%.2f\n",A);
        System.out.printf("%.4f\n", A);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f\n",A);
        System.out.printf("%.4f\n", A);
        System.out.println("Resultado de " + A + " + " + B + " = " + (A+B));
        System.out.printf("Resultado = %.2f metros \n", (A+B));

        String nome = "Eduardo";
        int idade = 29;
        double renda = 1600;

        System.out.printf("%s tem %d anos e ganha %.2f euros \n", nome, idade, renda);


    }
}
