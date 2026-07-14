/*
Crie um programa em Java que solicite ao usuário um ano e verifique se ele é bissexto.
Considere que um ano é bissexto quando:
* É divisível por 4;
* Não é divisível por 100, exceto quando também for divisível por 400.
Ao final, o programa deverá informar se o ano digitado é ou não bissexto.
*/

package com.mycompany.lista_exercicios_q13;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano para verificar se é bissexto:");
        int ano = scanner.nextInt();

        boolean Bissexto;

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    Bissexto = true;
                } else {
                    Bissexto = false;
                }
            } else {
                Bissexto = true;
            }
        } else {
            Bissexto = false;
        }

        if (Bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
    }
}
