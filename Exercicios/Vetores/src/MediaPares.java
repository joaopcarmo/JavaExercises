import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, somaPares = 0, contadorPares = 0;
        double media;

        System.out.print("Quantos elementos vai ter o vetor: ");
        n = sc.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                somaPares += vect[i];
                contadorPares++;
            }
        }
            if (contadorPares == 0) {
                System.out.println("NENHUM NÚMERO PAR");
            } else {
                media = (double)somaPares / contadorPares;
                System.out.printf("MEDIA DOS PARES = %.1f\n", media);
            }
            sc.close();
        }
    }

