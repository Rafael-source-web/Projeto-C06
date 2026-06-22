package org.example;

public class Filmes {
    private String titulo;

    public Filmes(String titulo) {
        this.titulo = titulo;
    }

    public static boolean ehValido(String titulo) {
        return titulo.equalsIgnoreCase("Batman O Cavaleiro das Trevas") ||
                titulo.equalsIgnoreCase("Michael Jackson") ||
                titulo.equalsIgnoreCase("O Diabo Veste Prada 2") ||
                titulo.equalsIgnoreCase("Django Livre");
    }

    public void mostraInfo() {
        System.out.println("Filme: " + titulo);
    }

    public String getTitulo() {
        return titulo;
    }
}