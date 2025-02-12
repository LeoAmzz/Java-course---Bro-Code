import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        // Aritmética em Java
        // Java possui operadores aritméticos padrão, como adição, subtração, multiplicação, divisão e módulo.
        
        // Operadores Aritméticos em Java:
        // 1. Adição (+): Soma dois valores.
        int soma = 10 + 5; // soma = 15
        
        // 2. Subtração (-): Subtrai um valor de outro.
        int subtracao = 10 - 5; // subtracao = 5
        
        // 3. Multiplicação (*): Multiplica dois valores.
        int multiplicacao = 10 * 5; // multiplicacao = 50
        
        // 4. Divisão (/): Divide um valor por outro.
        int divisao = 10 / 5; // divisao = 2
        
        // 5. Módulo (%): Retorna o restante da divisão de dois números.
        int modulo = 10 % 3; // modulo = 1
        
        // Precedência dos Operadores
        // Multiplicação, divisão e módulo têm maior precedência que adição e subtração.
        // Operações entre parênteses são realizadas primeiro.
        int resultado = 10 + 5 * 2; // resultado = 20
        int resultadoComParenteses = (10 + 5) * 2; // resultadoComParenteses = 30
        
        // Operações com Diferentes Tipos de Dados:
        int x = 10;
        double y = 3.5;
        double resultadoDouble = x + y; // resultado = 13.5
        
        // Incremento e Decremento:
        x++; // x = 11
        x--; // x = 10
        
        // Exercícios de Aritmética em Java
        
        // Soma de dois números
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero A: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o numero B: ");
        int num2 = scanner.nextInt();
        
        int total = num1 + num2;
        System.out.println("A soma dos numeros são: " + total);
        
        // Calculadora simples
        int totalAdition = num1 + num2;
        int totalSubtration = num1 - num2;
        int totalDivi = num1 / num2;
        int totalMulti = num1 * num2;
        
        System.out.println("A soma dos numeros é: " + totalAdition);
        System.out.println("A subtração dos numeros é: " + totalSubtration);
        System.out.println("A divisão dos numeros é: " + totalDivi);
        System.out.println("A multiplicação dos numeros é: " + totalMulti);
        
        // Módulo de uma divisão
        int resto = num1 % num2;
        System.out.println("O resto é: " + resto);
        
        scanner.close();
    }
}
