package org.example;

public class Ingresso extends Produto {

    private String tamanho;

    public Ingresso(String tamanho) {
        super("Ingresso " + tamanho, definirPreco(tamanho));
        this.tamanho = tamanho;
    }


    public static boolean ehValido(String tamanho) {
        return tamanho.equalsIgnoreCase("Meia") ||
                tamanho.equalsIgnoreCase("Inteira");
    }

    private static double definirPreco(String tamanho) {

        if (tamanho.equalsIgnoreCase("Meia")) {
            return 17.00;
        }
        else if (tamanho.equalsIgnoreCase("Inteira")) {
            return 34.00;
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
        System.out.printf("Ingresso: " + tamanho + ", Preço: R$ %.2f", calcularPreco());
        System.out.println();
    }

    public String getTipo() {
        return tamanho;
    }

    public void setTipo(String tamanho) {
        this.tamanho = tamanho;
    }
}