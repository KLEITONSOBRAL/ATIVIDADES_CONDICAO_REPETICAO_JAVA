/*
Crie um programa em Java que solicite ao usuário o valor de uma compra e o percentual de desconto.
O programa deverá verificar se o percentual informado está entre 0% e 100%. Caso seja válido,
deverá calcular o valor do desconto e o valor final da compra.
Ao final, exiba o valor da compra após a aplicação do desconto. Caso o percentual seja inválido,
apresente uma mensagem de erro.
*/

package com.mycompany.lista_exercicios_q20;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        System.out.println("Digite o percentual de desconto:");
        double percentualDesconto = scanner.nextDouble();

        if (percentualDesconto >= 0 && percentualDesconto <= 100) {

            double valorDesconto = (valorCompra * percentualDesconto) / 100;
            double valorFinal = valorCompra - valorDesconto;

            System.out.println("O valor final da compra com " + percentualDesconto + "% de desconto e: R$ " + valorFinal);
        } else {

            System.out.println("Percentual de desconto invalido. Deve estar entre 0 e 100.");
        }
        
        scanner.close();
    }
}
