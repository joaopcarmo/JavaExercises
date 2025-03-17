import java.util.Scanner;

public class ValoresNoIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de X");
        int in = 0, out = 0, x;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            x = sc.nextInt();
            if (x <= 20 && x >= 10) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}