package org.example;

public class Usuarios {

    String nome;
    String email;
    int idade;

    public Usuarios (String nome, String email, int idade){

        this.nome = nome;
        this.email = email;
        this.idade = idade;

    }
    @Override
    public String toString(){

        return "Nome: " + nome + "\nE-mail: " + email + "\nIdade: " + idade;

    }
}
