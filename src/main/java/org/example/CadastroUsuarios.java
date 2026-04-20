package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class CadastroUsuarios {
    static void cadastro (){

        Scanner sc = new Scanner(System.in);
        String nome, email;
        int idade;

        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        System.out.println("Informe o e-mail:");
        email = sc.nextLine();
        System.out.println("Informe a idade:");
        idade = sc.nextInt();

        if(idade < 0){
            System.out.println("Valor inválido!");
        }



    }
}

