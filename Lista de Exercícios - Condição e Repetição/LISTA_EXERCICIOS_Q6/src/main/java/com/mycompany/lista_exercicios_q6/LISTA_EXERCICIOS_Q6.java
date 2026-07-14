/*
Crie um programa em Java que solicite o peso, em quilogramas, e a altura, em metros, de uma pessoa.
Em seguida, calcule o Índice de Massa Corporal (IMC) utilizando a fórmula:
IMC = peso ÷ altura²
Após o cálculo, informe a classificação correspondente:
* Abaixo do peso;
* Peso normal;
* Excesso de peso;
* Obesidade.
*/

package com.mycompany.lista_exercicios_q6;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double peso = 0, imc = 0, altura = 0;

        System.out.println("Digite o seu peso em KG:");
        peso = scanner.nextDouble();

        System.out.println("Digite a sua altuta em METROS:");
        altura = scanner.nextDouble();

        imc = peso / (altura*altura);

        if( imc < 18.8 ){
            System.out.println("ABAIXO DO PESO");
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.print("PESO NORMAL");
        }
        else if ( imc >= 25 && imc <= 29.9){
            System.out.println("EXCESSO DE PESO");
        }
        else if ( imc >=30 && imc <=34.9){
            System.out.print("OBESIDADE");
        }

        scanner.close();
    }
}
