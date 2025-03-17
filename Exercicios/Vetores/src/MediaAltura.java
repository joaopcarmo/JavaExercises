import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double [] vect = new double [n];
        double sum = 0;

        for(int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double avg = sum/n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
        }
    }