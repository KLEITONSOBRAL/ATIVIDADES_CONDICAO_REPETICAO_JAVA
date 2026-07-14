/*
Crie um programa em Java que solicite ao usuário um número inteiro
e verifique se ele é um número primo.
O programa deverá informar se o número digitado é primo ou não.
Considere que números menores ou iguais a 1 não são primos.
*/

package com.mycompany.lista_exercicios_q9;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo:");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
