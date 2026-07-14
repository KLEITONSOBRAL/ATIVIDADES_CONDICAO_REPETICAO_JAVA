/*
Crie um programa em Java que simule a cobrança de pedágio de acordo com o tipo de veículo.
O programa deverá apresentar as seguintes opções:
1. Carro — R$ 5,00;
2. Moto — R$ 2,50;
3. Caminhão — R$ 7,00.
Após o usuário escolher uma opção, o programa deverá informar o tipo de veículo
selecionado e o valor do pedágio correspondente. Caso seja digitada uma opção diferente 
de 1, 2 ou 3, deverá exibir uma mensagem informando que o tipo de veículo é inválido.
*/

package com.mycompany.lista_exercicios_q18;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de veiculo:");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Caminhao");

        int tipoVeiculo = scanner.nextInt();

        double valorPedagio = 0;

        if (tipoVeiculo == 1) {
            valorPedagio = 5.00;
            System.out.println("Você escolheu Carro. O valor do pedagio é R$ " + valorPedagio);
        } else if (tipoVeiculo == 2) {
            valorPedagio = 2.50;
            System.out.println("Você escolheu Moto. O valor do pedagio é R$ " + valorPedagio);
        } else if (tipoVeiculo == 3) {
            valorPedagio = 7.00;
            System.out.println("Você escolheu Caminhão. O valor do pedagio é R$ " + valorPedagio);
        } else {
            System.out.println("Tipo de veiculo invalido.");
        }

        scanner.close();
    }
}
