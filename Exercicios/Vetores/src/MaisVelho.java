import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posicaoMaiorIdade, maiorIdade;

        System.out.println("Quantas pessoas você vai digitar?");
         n = sc.nextInt();

        String[] nomes = new String[n];
        int [] idades = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        maiorIdade = idades[0];
        posicaoMaiorIdade = 0;

        for (int i = 0; i < n; i++) {
            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
                posicaoMaiorIdade = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nomes[posicaoMaiorIdade]);
    }
}
