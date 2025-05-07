package ExerciciosPoo.SalarioFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        // PART 1 - READING DATA:
        System.out.println("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + (i + 1) + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while(idSearch(list, id)) {
                System.out.print("Id já existe, tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
        System.out.println();
        System.out.println("Digite o ID do funcionário que terá o aumento salarial: ");
        int idSalary = sc.nextInt();
        Employee emp = list.stream().filter(e -> e.getId() == idSalary).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("ID não encontrado");
        } else {
            System.out.println("Digite a porcentagem do aumento: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // PART 3 - LISTING EMPLOYEES:
        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static boolean idSearch(List<Employee> list, int id) {
        Employee emp = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}