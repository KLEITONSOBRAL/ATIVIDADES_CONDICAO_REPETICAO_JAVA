/*
Crie um programa em Java que simule o jogo “Par ou Ímpar” entre o usuário e o computador.
O programa deverá:
* Solicitar que o usuário escolha entre par ou ímpar;
* Solicitar um número ao usuário;
* Sortear aleatoriamente um número para o computador entre 0 e 9;
* Somar os dois números;
* Verificar se o resultado da soma é par ou ímpar;
* Informar os números escolhidos, o resultado da soma e se o usuário venceu ou perdeu.
*/

package com.mycompany.lista_exercicios_q14;

import java.util.Random;
import java.util.Scanner;

public class LISTA_EXERCICIOS_Q14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Escolha: Par ou Impar? (Digite 'P' para Par e 'I' para Impar):");
        char escolhaUsuario = scanner.next().toUpperCase().charAt(0);

        System.out.println("Escolha um número:");
        int numeroUsuario = scanner.nextInt();

        int numeroComputador = random.nextInt(10);

        System.out.println("Você escolheu o número " + numeroUsuario);
        System.out.println("O computador sorteou o número " + numeroComputador);
        
        int soma = numeroUsuario + numeroComputador;
        System.out.println("A soma dos números é: " + soma);
        
        boolean somaEhPar = soma % 2 == 0;
        
        if (somaEhPar && escolhaUsuario == 'P') {
            System.out.println("A soma é Par. Você venceu!");
        } else if (!somaEhPar && escolhaUsuario == 'I') {
            System.out.println("A soma é Impar. Você venceu!");
        } else {
            System.out.println("Você perdeu. Tente novamente!");
        }

        scanner.close();
    }
}
