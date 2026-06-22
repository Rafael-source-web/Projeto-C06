package org.example;

public class Bebida extends Produto {

    private String drink;

    public Bebida(String drink) {
        super(drink, definirPreco(drink));
        this.drink = drink;
    }

    public static boolean ehValido(String drink) {
        return drink.equalsIgnoreCase("Refrigerante") ||
                drink.equalsIgnoreCase("Suco") ||
                drink.equalsIgnoreCase("Agua") ||
                drink.equalsIgnoreCase("Nenhum");
    }

    private static double definirPreco(String drink) {

        if (drink.equalsIgnoreCase("Refrigerante")) {
            return 15.00;
        }
        else if (drink.equalsIgnoreCase("Suco")) {
            return 12.50;
        }
        else if (drink.equalsIgnoreCase("Agua")) {
            return 10.80;
        }
        else{
            return 0.00;
        }
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase();
    }

    @Override
    public void mostraInfo() {
        System.out.printf("Bebida: " + drink + ", Preço: R$ %.2f", calcularPreco());
        System.out.println();
    }

    public String getTipo() {
        return drink;
    }

    public void setTipo(String drink) {
        this.drink = drink;
    }
}