 import java.util.Scanner;


public class Main {

    //Aula 3 Input  - Exercise  Area of rectangle triangle

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What are the width?");
        double width = scanner.nextDouble();

        System.out.println("What are the height?");
        double height = scanner.nextDouble();

        double area = (width * height) / 2;

        System.out.println("Thee area is: " + area);

        scanner.close();                      // Precisamos sempre fechar o scanner

    }
}
