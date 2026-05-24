package org.example;

public class Filme extends Produto {

    private String titulo;

    public Filme(String titulo) {
        super(titulo, definirPreco(titulo));
        this.titulo = titulo;
    }

    private static double definirPreco(String titulo) {

        if(titulo.equalsIgnoreCase("Batman")) {
            return 30.35;
        }
        else if(titulo.equalsIgnoreCase("Michael")) {
            return 24.00;
        }

        else if(titulo.equalsIgnoreCase("O Diabo Veste Prada 2")) {
            return 27.50;
        }

        else if(titulo.equalsIgnoreCase("Djago Livre")) {
            return 32.00;
        }

        else{
            return 00.00;
        }
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase();
    }

    @Override
    public void mostraInfo() {

        System.out.printf("Filme: " + titulo + ", Preço: R$ %.2f", calcularPreco());
        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}