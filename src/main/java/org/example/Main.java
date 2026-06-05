package org.example;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        ArrayList<Usuarios> users = new ArrayList<>();

        while(opcao != 0){

            System.out.println("=== Sistema de Cadastro de Usuários ===");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Lista de Usuários");
            System.out.println("3 - Buscar Usuário");
            System.out.println("4 - Editar Usuário");
            System.out.println("5 - Remover Usuário");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            if (opcao < 0 || opcao > 5){
                System.out.println("Opção inválida!");
                continue;
            }

            switch (opcao){
                case 1:
                    ControleUsuarios.Cadastro(users);
                    break;
                case 2:
                    ControleUsuarios.Listar(users);
                    break;
                case 3 :
                    ControleUsuarios.Buscar(users);
                    break;
                case 4:
                    ControleUsuarios.Editar(users);
                    break;
                case 5:
                    ControleUsuarios.Remover(users);
                    break;
            }
        }
    }
}
