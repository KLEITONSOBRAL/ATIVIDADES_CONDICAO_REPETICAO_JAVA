/*
Crie um programa em Java que solicite ao usuário um número inteiro
e exiba sua tabuada de multiplicação, de 1 até 10.
*/

package com.mycompany.lista_exercicios_q5;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada:");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
