import java.util.Scanner;

public class RegistrarAbastecimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorGasolina = 0, contadorAlcool = 0, contadorDiesel = 0;
        int tipo;

        while (true) {
            tipo = sc.nextInt();

            if (tipo == 1) {
                contadorAlcool++;
            } else if (tipo == 2) {
                contadorGasolina++;
            } else if (tipo == 3) {
                contadorDiesel++;
            } else if (tipo == 4) {
                break;
            } else {
                System.out.println("Entrada inválida! Por favor, insira um número entre 1 e 4.");
            }
        }

        System.out.println("Muito Obrigado");
        System.out.println("Alcool: "+contadorAlcool);
        System.out.println("Gasolina: "+contadorGasolina);
        System.out.println("Diesel: "+contadorDiesel);

        sc.close();
    }
}

