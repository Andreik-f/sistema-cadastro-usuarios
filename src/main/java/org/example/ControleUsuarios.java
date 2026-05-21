package org.example;

import java.util.Scanner;
import java.util.ArrayList;


public class ControleUsuarios {

    static void cadastro (ArrayList<Usuarios> users){

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

        Usuarios user = new Usuarios(nome, email, idade);
        users.add(user);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    static void listar(ArrayList<Usuarios> users){

        for(Usuarios user: users)
            System.out.println(user);
    }

}

