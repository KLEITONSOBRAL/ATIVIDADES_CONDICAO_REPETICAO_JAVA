/*
Crie um programa em Java que solicite ao usuário a criação de uma senha.
A senha deverá possuir, no mínimo, 8 caracteres. 
Caso a senha informada não atenda a esse requisito, 
o programa deverá exibir uma mensagem de erro e solicitar uma nova senha.
O processo deverá se repetir até que o usuário digite uma senha válida.
*/

package com.mycompany.lista_exercicios_q8;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String senha;

        while (true) {

            System.out.println("Digite uma senha (minimo 8 caracteres):");
            senha = scanner.nextLine();

            if (senha.length() >= 8) {
                System.out.println("Senha valida!");
                break;
            } else {
                System.out.println("Senha invalida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
