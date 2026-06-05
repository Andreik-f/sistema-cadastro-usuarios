package org.example;

import java.util.Scanner;
import java.util.ArrayList;


public class ControleUsuarios {

    static void Cadastro (ArrayList<Usuarios> users){

        Scanner sc = new Scanner(System.in);
        String nome, email;
        int idade;
        boolean emailExiste = false;

        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        System.out.println("Informe o e-mail:");
        email = sc.nextLine();

        // Verifica se email já existe

        do {
            emailExiste = false;

            for (Usuarios usuario : users) {
                if (usuario.email.equals(email)) {
                    emailExiste = true;
                    System.out.println("Email já cadastrado, informe outro!");
                    System.out.print("Informe o e-mail: ");
                    email = sc.nextLine();
                    break;
                }
            }

        } while (emailExiste);

        System.out.println("Informe a idade:");
        idade = sc.nextInt();

        while(idade < 0){
            System.out.println("Valor inválido!");
            System.out.println("Informe a idade:");
            idade = sc.nextInt();
        }

        Usuarios user = new Usuarios(nome, email, idade);
        users.add(user);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    static void Listar(ArrayList<Usuarios> users){

        if(users.isEmpty()){
            System.out.println("Nenhum usuário cadastrado!");
        }else{
            System.out.println("Usuários Cadastrados: ");

            for(Usuarios user: users)
                System.out.println(user);
        }
    }
    static void Buscar(ArrayList<Usuarios> users){

        boolean achou = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o e-mail do usuário: ");
        String email = sc.nextLine();

        // Busca usuario pelo email

        for(Usuarios user: users){
            if(user.email.equals(email)){
                achou = true;
                System.out.println("Usuário encontrado! ");
                System.out.println(user);
            }
        }
        if(!achou)
            System.out.println("Usuário não encontrado!");
    }
    static void Editar(ArrayList<Usuarios> users){

        boolean achou = false;
        boolean emailExiste = false;
        Usuarios usuarioEncontrado = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o e-mail do usuário: ");
        String email = sc.nextLine();

        // Localiza o usuário que será editado

            for (Usuarios user : users) {
                if (user.email.equals(email)) {
                    achou = true;
                    usuarioEncontrado = user;

                    System.out.println("Usuário encontrado! ");
                    System.out.println(user);

                    System.out.println("Digite o novo email: ");
                    email = sc.nextLine();
                    break;
                }
            }
        if(!achou) {
            System.out.println("Usuário não encontrado!");
            return;
        }

        // Verifica se o novo email já pertence a outro usuário

        for(Usuarios user: users){
            if(user != usuarioEncontrado && user.email.equals(email)) {
                emailExiste = true;
            }
        }
        if(emailExiste){
            System.out.println("Email já existe!");
        }else{
            usuarioEncontrado.email = email;
            System.out.println("Email alterado com sucesso!");
        }

    }
    static void Remover(ArrayList<Usuarios> users){

        boolean achou = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o email do usuário: ");
        String email = sc.nextLine();

        //Percorre a lista Usuarios por índice

        for(int i = 0; i < users.size(); i++){
            if(users.get(i).email.equals(email)){
                users.remove(i);
                achou = true;
                System.out.println("Usuário removido com sucesso!");
                break;
            }
        }
        if(!achou)
            System.out.println("Usuário não encontrado!");
    }
}

