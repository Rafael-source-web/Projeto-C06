package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=====Bem vindo ao MaRaMaYa Cinema!=====");


        Filmes filme;
        while (true) {
            System.out.println("Qual filme você quer assistir?");
            System.out.println("- Batman O Cavaleiro das Trevas");
            System.out.println("- Michael Jackson");
            System.out.println("- O Diabo Veste Prada 2");
            System.out.println("- Django Livre");
            String entrada = teclado.nextLine();

            if (Filmes.ehValido(entrada)) {
                filme = new Filmes(entrada);
                break;
            }
            System.out.println("Filme indisponível! Por favor, escolha um disponível.");
        }

        System.out.println("Qual o tamanho do seu ingresso:");
        System.out.println("- Meia \n- Inteira");

        Produto ingresso;
        while (true) {
            String entrada = teclado.nextLine();

            if (Ingresso.ehValido(entrada)) {
                ingresso = new Ingresso(entrada);
                break;
            }

            System.out.println("Opção inválida! Digite Meia ou Inteira:");
        }

        System.out.println("Escolha sua comida:");
        System.out.println("- Pipoca \n- Chocolate \n- Balas \n- Nenhum");

        Produto comida;
        while (true) {
            String entrada = teclado.nextLine();

            if (Comida.ehValido(entrada)) {
                comida = new Comida(entrada);
                break;
            }

            System.out.println("Opção inválida! Escolha Pipoca, Chocolate, Balas ou Nenhum:");
        }

        System.out.println("Escolha sua bebida:");
        System.out.println("- Refrigerante \n- Suco \n- Agua \n- Nenhum");

        Produto bebida;
        while (true) {
            String entrada = teclado.nextLine();

            if (Bebida.ehValido(entrada)) {
                bebida = new Bebida(entrada);
                break;
            }

            System.out.println("Opção inválida! Escolha Refrigerante, Suco, Agua ou Nenhum:");
        }

        System.out.println("----- Seu Pedido Foi Finalizado-----");

        filme.mostraInfo();
        ingresso.mostraInfo();
        comida.mostraInfo();
        bebida.mostraInfo();

        double valorTotal = ingresso.calcularPreco()
                + comida.calcularPreco()
                + bebida.calcularPreco();

        System.out.printf("\nO valor total a pagar será: R$ %.2f", valorTotal);

        System.out.println("\n=====Aproveite seu Filme!=====");

        teclado.close();
    }
}