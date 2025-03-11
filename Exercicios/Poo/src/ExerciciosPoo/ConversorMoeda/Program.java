package ExerciciosPoo.ConversorMoeda;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollar will be bought? ");
        double amount = sc.nextDouble();

        double convertedAmount = CurrencyConverter.dollarToReal(dollarPrice, amount);
        System.out.printf("Amount to be paid in reais = %.2f%n", convertedAmount);

        sc.close();
    }
}