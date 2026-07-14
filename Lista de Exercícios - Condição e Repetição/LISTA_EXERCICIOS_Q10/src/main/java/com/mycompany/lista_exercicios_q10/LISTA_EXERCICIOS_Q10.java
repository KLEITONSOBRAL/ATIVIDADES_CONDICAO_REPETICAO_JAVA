/*
Crie um programa em Java que realize uma contagem regressiva de 10 até 0 
utilizando a estrutura de repetição `while`.
Ao final da contagem, o programa deverá exibir a mensagem “Contagem regressiva concluída!”.
*/

package com.mycompany.lista_exercicios_q10;

public class LISTA_EXERCICIOS_Q10 {

    public static void main(String[] args) {
        int numero = 10;
        
        while (numero >= 0) { 
            System.out.println(numero);
            numero--;
        }

        System.out.println("Contagem regressiva concluida!");
    }
}
