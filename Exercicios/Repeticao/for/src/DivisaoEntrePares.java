import java.util.Scanner;

public class DivisaoEntrePares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de operações: ");
        int n = sc.nextInt();
        double divisao;

        for (int i = 0; i < n; i++) {

            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();


            if (num2 == 0) {
                System.out.println("Divisão impossivel");
            } else {
                divisao = (double) num1 / num2;
                System.out.printf("Resultado: %.1f%n", divisao);
            }
        }
        sc.close();
    }
}
