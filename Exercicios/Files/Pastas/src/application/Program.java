package application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);  //cria um vetor de files contendo o caminho de cada pasta
        System.out.println("Folders found: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        System.out.println();
        File[] files = path.listFiles(File::isFile);  //cria um vetor de files contendo os arquivos
        System.out.println("Files found: ");
        for (File file : files) {
            System.out.println(file);
        }
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created: " + success);

        sc.close();
    }
}
