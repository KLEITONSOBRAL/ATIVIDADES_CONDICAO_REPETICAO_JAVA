/*
Faça um programa em Java que leia as notas de um aluno nas disciplinas de **Matemática**, **Português** e **Biologia**.
Em seguida, calcule a média aritmética das três notas e informe a situação do aluno de acordo com os seguintes critérios:
* Média maior ou igual a **7,0**: **Aprovado**;
* Média maior ou igual a **5,0** e menor que **7,0**: **Recuperação**;
* Média menor que **5,0**: **Reprovado**.
Ao final, o programa deverá exibir a média obtida pelo aluno.
*/

package com.mycompany.lista_exercicios_q1;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1 = 0, nota2 = 0, nota3 = 0, media = 0;

        System.out.println("Digite sua nota em MATEMATICA:");
        nota1 = scanner.nextDouble();

        System.out.println("Digite sua nota em PORTUGUÊS:");
        nota2 = scanner.nextDouble();

        System.out.println("Digite sua nota em BIOLOGIA");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3)/ 3;

        if(media >=7){
            System.out.println("APROVADO");
        }
        else if(media >=5 && media <7){
            System.out.println("RECUPERAÇÃO");
        }
        else{
            System.out.println("REPROVADO");
        }

        System.out.println("Sua média vai ser de " + media);

        scanner.close();
    }
}

