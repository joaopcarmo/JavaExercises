import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        do {
            System.out.print("Quantos elementos vai ter o vetor? (máximo 10) ");
            n = sc.nextInt();
            if (n > 10) {
                System.out.println("Número deve ser menor ou igual a 10. Tente novamente.");
            }
        } while (n > 10);

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("MÉDIA DO VETOR = %.2f%n", avg);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] < avg) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}