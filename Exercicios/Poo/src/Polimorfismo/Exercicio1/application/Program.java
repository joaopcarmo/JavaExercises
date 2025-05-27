package Polimorfismo.Exercicio1.application;

import Polimorfismo.Exercicio1.entitites.Employee;
import Polimorfismo.Exercicio1.entitites.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int employeeNumber = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= employeeNumber; i++){
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsorced (y/n)? ");
            char answer = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if(answer == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else if(answer == 'n'){
            employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee employee : employees){
            System.out.println(employee.toString());
        }
        sc.close();
    }
}
