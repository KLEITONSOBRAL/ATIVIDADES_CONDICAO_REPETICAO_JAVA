/*
Desenvolva um programa em Java que funcione como uma calculadora simples.
O programa deverá solicitar ao usuário:
* Uma operação matemática: adição (`+`), subtração (`-`), multiplicação (`*`) ou divisão (`/`);
* O primeiro número;
* O segundo número.
Em seguida, deverá realizar a operação escolhida e exibir o resultado.
Caso o usuário escolha uma operação inválida, o programa deverá informar o erro. 
Na operação de divisão, o programa também deverá impedir a divisão por zero e exibir uma mensagem adequada.
*/

package com.mycompany.lista_exercicios_q3;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação: +, -, *, /");
        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        if (operacao == '+') {
            resultado = num1 + num2;
        } else if (operacao == '-') {
            resultado = num1 - num2;
        } else if (operacao == '*') {
            resultado = num1 * num2;
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Operação invalida.");
            scanner.close();
            return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
