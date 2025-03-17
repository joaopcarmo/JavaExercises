import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class Aprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        out.println("Quantos alunos serão digitados?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
            sc.nextLine();
        }

        out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {
            double media = (nota1[i] + nota2[i]) / 2;
            if (media >= 6.0) {
                out.println(nomes[i]);
            }
        }
        sc.close();
    }
}