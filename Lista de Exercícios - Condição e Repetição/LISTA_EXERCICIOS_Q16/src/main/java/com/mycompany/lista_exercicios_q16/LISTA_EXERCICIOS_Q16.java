/*
Crie um programa em Java que solicite ao usuário uma palavra e verifique se ela é um palíndromo.
Uma palavra é considerada palíndromo quando pode ser lida da mesma forma da esquerda para a
direita e da direita para a esquerda.
Ao final, o programa deverá informar se a palavra digitada é ou não um palíndromo.
*/

package com.mycompany.lista_exercicios_q16;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q16 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra para verificar se é um palindromo:");
        String palavra = scanner.nextLine();

        boolean Palindromo = true;
        
        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                Palindromo = false;
                break;
            }
        }
        
        if (Palindromo) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palindromo.");
        }

        scanner.close();
    }
}
