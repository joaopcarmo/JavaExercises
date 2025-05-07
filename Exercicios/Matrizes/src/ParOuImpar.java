import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        // leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // imprimindo a matriz
        System.out.println("\nMatriz informada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // imprimindo os elementos nas posições onde o índice da linha é par e o índice da coluna é ímpar
        System.out.println("\nElementos nas posições (linha par e coluna ímpar):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0 && j % 2 != 0) {  // indice da linha par e índice da coluna ímpar
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        sc.close();
    }
}
