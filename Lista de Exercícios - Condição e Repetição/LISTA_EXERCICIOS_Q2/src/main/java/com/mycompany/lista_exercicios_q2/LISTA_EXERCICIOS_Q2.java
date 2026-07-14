/*
Desenvolva um programa em Java que simule um jogo de adivinhação.
O programa deverá gerar aleatoriamente um número inteiro entre **0 e 99**. 
Em seguida, o usuário deverá tentar descobrir o número sorteado.
A cada tentativa, o programa deverá informar:
* **“Você acertou!”**, caso o número digitado seja igual ao número sorteado;
* Que o número sorteado é maior, caso o valor digitado seja menor;
* Que o número sorteado é menor, caso o valor digitado seja maior.
O jogo deverá continuar até que o usuário acerte o número ou até que o limite de tentativas seja atingido.
*/

package com.mycompany.lista_exercicios_q2;

import java.util.Random;
import java.util.Scanner;

public class LISTA_EXERCICIOS_Q2 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numero = random.nextInt(100);
        int tentativas = 100;
        int numeroAdiv = new Random().nextInt(100);

        while(tentativas != 0){

            System.out.println("**BEM VINDO AO JOGO DE ADIVINHAÇÃO**");
            System.out.println("**DIGITE UM NÚMERO ENTRE 0 E 100**");
            numero = scanner.nextInt();

            if (numero == numeroAdiv){
                System.out.println("VOCÊ ACERTOU!");
            }
            else if (numero < numeroAdiv){
                System.out.println("O NÚMERO É MAIOR DO QUE " + numero);
            }
            else {
                System.out.println("O NÚMERO É MENOR DO QUE " + numero);
            }
        }
    }
}
