package org.example;

public class Comida extends Produto {
    public Comida(String nome) {
        super(nome, definirPreco(nome));
    }

    private static double definirPreco(String nome) {

        if (nome.equalsIgnoreCase("Pipoca")) {
            return 15.00;
        }
        else if (nome.equalsIgnoreCase("Chocolate")) {
            return 7.25;
        }
        else if (nome.equalsIgnoreCase("Balas")) {
            return 2.50;
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
        System.out.printf("Comida: " + getNome() + ", Preço: R$ %.2f", calcularPreco());
        System.out.println();
    }
}
