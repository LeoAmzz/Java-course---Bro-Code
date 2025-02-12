Explicação sobre if statements em Java
Em Java, uma instrução if é usada para tomar decisões com base em uma condição. Ou seja, ela permite que o programa execute um bloco de código se a condição especificada for verdadeira. Caso contrário, pode-se usar um bloco de código alternativo, com a instrução else.
A estrutura básica de um if é:
if (condicao) {
    /
/ Bloco de código executado se a condição for verdadeira

}
 
Caso você queira adicionar um caminho alternativo, usa-se o else:
if (condicao) {

    // Bloco de código executado se a condição for verdadeira

} else {
    
// Bloco de código executado se a condição for falsa

}
 
É possível também usar else if para verificar múltiplas condições:
if (condicao1) 
{

    // Bloco de código executado se a condição1 for verdadeira

} else if (condicao2) {
    
// Bloco de código executado se a condição2 for verdadeira

} else {

    // Bloco de código executado se nenhuma das condições for verdadeira
}
 
Operadores de comparação que podem ser usados nas condições:
	• == (igualdade)
	• != (diferente)
	• > (maior que)
	• < (menor que)
	• >= (maior ou igual)
	• <= (menor ou igual)
Exemplos de uso de if statements em Java
	1. Exemplo simples de if:
int idade = 20;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
	1. Exemplo com if e else:
int idade = 16;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
 
	1. Exemplo com if, else if e else:
int idade = 70;
if (idade < 18) {
    System.out.println("Você é menor de idade.");
} else if (idade >= 18 && idade <= 60) {
    System.out.println("Você é adulto.");
} else {
    System.out.println("Você é idoso.");
}
Exercícios sobre if statements em Java
1. Exercício 1:
	• Crie um programa que leia um número inteiro e informe se o número é positivo, negativo ou zero.
	• import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Número positivo");
        } else if (num < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("O número é zero");
        }

        scanner.close();
    }
}
	• 
Exercício 2:
Escreva um programa que leia a idade de uma pessoa e determine se ela pode votar (maior de 16 anos).
import java.util.Scanner;
//Escreva um programa que leia a idade de uma pessoa e
// determine se ela pode votar (maior de 16 anos).
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade > 16) {
            System.out.println("você pode votar");
        }else{
            System.out.println("você não pode votar");
        }
        scanner.close();
    }
}
Exercício 3:
Crie um programa que leia dois números e diga qual é o maior deles.
import java.util.Scanner;
//Crie um programa que leia dois números e diga qual é o maior deles.
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu numero 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite seu numero 2: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("o Numero " + num1 + " é maior que o " + num2);
        }else if (num1 < num2){
            System.out.println("o Numero " + num2 + " é maior que o " + num1);
        }else{
            System.out.println("Os numeros são iguais");
        }
        scanner.close();
    }
}

Exercício 4:
Crie um programa que leia a hora do dia (em formato 24 horas) e diga se é manhã (das 6h às 12h), tarde (das 12h às 18h) ou noite (das 18h às 6h).
Exercício 5:
Escreva um programa que leia três números e informe qual é o maior número.
Exercício 6:
Crie um programa que verifique se um número é par ou ímpar.
Exercício 7:
Escreva um programa que calcule o IMC (Índice de Massa Corporal) de uma pessoa e imprima a categoria:
Abaixo de 18.5: Abaixo do peso
Entre 18.5 e 24.9: Peso normal
Entre 25 e 29.9: Sobrepeso
Acima de 30: Obesidade
