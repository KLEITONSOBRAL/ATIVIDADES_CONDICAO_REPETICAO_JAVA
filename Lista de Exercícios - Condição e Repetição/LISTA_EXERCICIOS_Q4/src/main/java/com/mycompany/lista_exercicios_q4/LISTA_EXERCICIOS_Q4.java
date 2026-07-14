/*
Crie um programa em Java que simule um sistema de login.
O programa deverá possuir um nome de usuário e uma senha previamente cadastrados. 
Em seguida, deverá solicitar que o usuário informe suas credenciais.
O sistema deverá permitir no máximo três tentativas de acesso. 
Caso o usuário e a senha estejam corretos, deverá exibir a mensagem “Login bem-sucedido”. Caso as três tentativas sejam utilizadas sem sucesso, deverá informar que o acesso foi bloqueado.
*/

package com.mycompany.lista_exercicios_q4;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String usuarioCorreto = "KLEITON";
        String senhaCorreta = "12345";

        int tentativas = 0;
        boolean loginBemSucedido = false;

        while (tentativas < 3 && !loginBemSucedido) {
            System.out.println("Digite o nome de usuario:");
            String usuario = scanner.nextLine();

            System.out.println("Digite a senha:");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                loginBemSucedido = true;
                System.out.println("Login bem sucedido!");
            } else {
                tentativas++;
                System.out.println("Usuario ou senha incorretos. Tentativas restantes: " + (3 - tentativas));
            }
        }

        if (!loginBemSucedido) {
            System.out.println("Número máximo de tentativas excedido. Acesso bloqueado.");
        }

        scanner.close();
    }
}
