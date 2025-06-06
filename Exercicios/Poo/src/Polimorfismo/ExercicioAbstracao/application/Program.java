package Polimorfismo.ExercicioAbstracao.application;

import Polimorfismo.ExercicioAbstracao.entities.Circle;
import Polimorfismo.ExercicioAbstracao.entities.Rectangle;
import Polimorfismo.ExercicioAbstracao.entities.Shape;
import Polimorfismo.ExercicioAbstracao.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        List<Shape> shapes = new ArrayList<Shape>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)? ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(color, width, height));
            } else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }


        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for(Shape s : shapes){
            System.out.println(String.format("%.2f", s.area()));
        }
    }
}
