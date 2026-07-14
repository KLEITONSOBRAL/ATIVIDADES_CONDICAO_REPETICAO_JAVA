/*
Crie um programa em Java que solicite ao usuário um número inteiro positivo. 
Em seguida, percorra todos os números de 1 até o valor informado, conte quantos são pares e quantos são ímpares e exiba os resultados na tela.
*/

package com.mycompany.lista_exercicios_q7;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int contagemPares = 0;
        int contagemImpares = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                contagemPares++;
            } else {
                contagemImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contagemPares);
        System.out.println("Quantidade de números impares: " + contagemImpares);

        scanner.close();
    }
}
