package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=====Bem vindo ao MaRaMaYa Cinema!=====");
        System.out.println("Vamos começar seu pedido! Qual filme você quer assistir?");
        System.out.println("- Batman \n- Michael \n- O Diabo Veste Prada 2 \n- Django Livre");
        Filme filme = new Filme(teclado.nextLine());

        System.out.println("Qual o tamanho do seu ingresso:");
        System.out.println("- Meia \n- Inteira");
        Ingresso ingresso = new Ingresso(teclado.nextLine());

        System.out.println("Escolha sua comida:");
        System.out.println("- Pipoca \n- Chocolate \n- Balas \n- Nada");
        Comida comida = new Comida(teclado.nextLine());

        System.out.println("Escolha sua bebida:");
        System.out.println("- Refrigerante \n- Suco \n- Agua \n- Nada");
        Bebida bebida = new Bebida(teclado.nextLine());

        System.out.println("----- Seu Pedido Foi Finalizado-----");
        teclado.close();

        filme.mostraInfo();
        ingresso.mostraInfo();
        comida.mostraInfo();
        bebida.mostraInfo();

        double valorTotal = filme.getPrecoBase() + ingresso.getPrecoBase() + comida.getPrecoBase() + bebida.getPrecoBase();

        System.out.printf("\nO valor total a pagar será: R$ %.2f", valorTotal);
        System.out.println("\n=====Aproveite seu Filme!=====");
    }
}