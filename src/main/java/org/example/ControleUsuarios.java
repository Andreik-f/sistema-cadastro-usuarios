package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class ControleUsuarios {

    static void Cadastro (ArrayList<Usuarios> users, Scanner sc){

        String nome, email;
        int idade;

        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        System.out.println("Informe o e-mail:");
        email = sc.nextLine();

        // Verifica se email já existe

        while (EmailExiste(users, email)) {
            System.out.println("Email já cadastrado, informe outro!");
            System.out.print("Informe o e-mail: ");
            email = sc.nextLine();
        }

        System.out.println("Informe a idade:");
        idade = sc.nextInt();

        while(idade < 0){
            System.out.println("Valor inválido!");
            System.out.println("Informe a idade:");
            idade = sc.nextInt();
        }
        sc.nextLine();

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
    static void Buscar(ArrayList<Usuarios> users, Scanner sc){

        System.out.println("Informe o e-mail do usuário: ");
        String email = sc.nextLine();

        // Busca usuario pelo email

        Usuarios usuario = BuscarUsuario(users, email);

        if(usuario == null){
            System.out.println("Usuário não encontrado!");
        }else{
            System.out.println("Usuário encontrado:");
            System.out.println(usuario);
        }
    }
    static void Editar(ArrayList<Usuarios> users, Scanner sc){

        System.out.println("Informe o e-mail do usuário: ");
        String email = sc.nextLine();

        Usuarios usuario = BuscarUsuario(users, email);

        // Verifica se o novo email já pertence a outro usuário

        if(usuario == null){
            System.out.println("Usuário não encontrado!");
        }else{
            System.out.println("Usuário encontrado!");
            System.out.println(usuario);
            System.out.println("Digite o novo email: ");
            String novoEmail = sc.nextLine();

            Usuarios novoDono = BuscarUsuario(users, novoEmail); // Armazena o usuário com mesmo email ou null

            if(novoDono != null && novoDono != usuario){
                System.out.println("Email já existe!");
            }else{
                usuario.email = novoEmail;
                System.out.println("Email alterado com sucesso!");
            }
        }
    }
    static void Remover(ArrayList<Usuarios> users, Scanner sc){

        System.out.println("Informe o email do usuário: ");
        String email = sc.nextLine();
        Usuarios usuario = BuscarUsuario(users, email);

        //Verifica se o usuário existe utilizando a função

        if(usuario == null){
            System.out.println("Usuário não encontrado!");
        }else{
            users.remove(usuario);
            System.out.println("Usuário removido com sucesso!");
        }
    }

    static boolean EmailExiste(ArrayList<Usuarios> users, String email){

        for(Usuarios user: users){
            if (user.email.equals(email)){
                return true;
            }
        }
        return false;
    }
    static Usuarios BuscarUsuario(ArrayList<Usuarios> users, String email){

        for(Usuarios user: users){
            if(user.email.equals(email)){
                return user;
            }
        }
        return null;
    }
}

