
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE EXERCÍCIOS ===");
            System.out.println("1 - Exibir números ímpares de 1 até X");
            System.out.println("2 - Contar valores dentro e fora do intervalo [10,20]");
            System.out.println("3 - Calcular média ponderada de três números");
            System.out.println("4 - Divisão entre pares de números, tratando divisão por zero");
            System.out.println("5 - Exibir números de 1 a N com seus quadrados e cubos");
            System.out.println("6 - Validar senha até ser correta (senha: 2002)");
            System.out.println("7 - Registrar abastecimentos e contar preferências de combustível");
            System.out.println("8 - Calcular nota final de um aluno e verificar aprovação");
            System.out.println("9 - Gerenciar dados e aumento salarial de um funcionário");
            System.out.println("10 - Calcular área, perímetro e diagonal de um retângulo");
            System.out.println("11 - Converter valores em dólares para reais com IOF");
            System.out.println("12 - Criar um sistema simples de cadastro de usuários");
            System.out.println("13 - Implementar encapsulamento em uma classe ContaBancaria");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: ExibirImparesAteX.main(new String[]{}); break;
                case 2: ValoresNoIntervalo.main(new String[]{}); break;
                case 3: MediaPonderada.main(new String[]{}); break;
                case 4: DivisaoEntrePares.main(new String[]{}); break;
                case 5: LinhasQuadradoCubo.main(new String[]{}); break;
                case 6: ValidarSenha.main(new String[]{}); break;
                case 7: RegistrarAbastecimento.main(new String[]{}); break;
//                case 8: CalculoNotaAluno.main(new String[]{}); break;
//                case 9: GerenciarFuncionario.main(new String[]{}); break;
//                case 10: CalculoRetangulo.main(new String[]{}); break;
//                case 11: ConversorMoeda.main(new String[]{}); break;
//                case 12: CadastroUsuarios.main(new String[]{}); break;
//                case 13: ContaBancaria.main(new String[]{}); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
