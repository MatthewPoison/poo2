package com.facebook.ui;

import com.facebook.dominio.Redesocial;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class RedeSocialUI {
    private static Scanner console = new Scanner(System.in);
    private static Redesocial redeSocial = new Redesocial();

    public static void main(String[] args) {

        while (true){
            System.out.println("escolha uma das opcoes");
            System.out.println("\tcriar conta [c] ");
            System.out.println("\tSair [s]");

            var opcao = console.nextLine();

            if(opcao.equalsIgnoreCase("c")){
                criarConta();



            }else  if (opcao.equalsIgnoreCase("s")){
                System.out.println("bye bye");
                break;

            }else {
                System.out.println("ops! deu bosta opcao invalida");





            }

        }
    }

    private static void criarConta() {
        System.out.println("qual seu email?");
        var email = console.nextLine();
        System.out.println(" qual e seu nome");
        var nome = console.nextLine();
        System.out.println(" qual sua senha ?");
        var senha = console.nextLine();
        var u = redeSocial.criarConta(email, senha, nome);
        redeSocial.criarConta(email, senha, nome);
        System.out.println("conta criada com sucesso");
        System.out.println(u);

        }
}