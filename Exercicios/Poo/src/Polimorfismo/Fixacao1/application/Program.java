package Polimorfismo.Fixacao1.application;

import Polimorfismo.Fixacao1.entitites.ImportedProduct;
import Polimorfismo.Fixacao1.entitites.Product;
import Polimorfismo.Fixacao1.entitites.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(ch == 'c'){
                products.add(new Product(name, price));
            } else if(ch == 'i'){
                System.out.print("Custom fee: ");
                double fee = sc.nextDouble();
                products.add(new ImportedProduct(name, price,fee));
            } else if(ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, date));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product p : products){
            System.out.println(p.priceTag());

        }
    }
}
