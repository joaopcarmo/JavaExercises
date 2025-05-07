import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, qtdHomens = 0, qtdMulheres = 0;
        double menorAltura, maiorAltura, somaAltura = 0, mediaAltura;
        System.out.println("Quantas pessoas serão digitadas? ");
         n = sc.nextInt();
        double[] altura = new double[n];
        char[] sexo = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.print("Sexo da " + (i + 1) + "a pessoa: ");
            sexo[i] = sc.next().charAt(0);
            if (sexo[i] == 'm') {
                qtdHomens++;
            }
        }

        menorAltura = altura[0];
        maiorAltura = altura[0];

        for (int i = 0; i < n; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (sexo[i] == 'f') {
                somaAltura += altura[i];
                qtdMulheres++;
            }
        }
         mediaAltura = somaAltura / qtdMulheres;

            System.out.println("Menor altura = " + menorAltura);
            System.out.println("Maior altura = " + maiorAltura);
            System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAltura);
            System.out.println("Número de homens: " + qtdHomens);

            sc.close();
    }
}


