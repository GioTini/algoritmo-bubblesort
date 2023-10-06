package com.giordanacontini.ordenaveis;

import com.giordanacontini.comparaveis.Comparavel;

public class Carro implements Comparavel {
    private String marca;
    private String modelo;
    private int cilindradas;

    public Carro(String marca, String modelo, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public int comparar(Object o) {
        if (o instanceof Carro carro) {
            return Integer.compare(carro.getCilindradas(), this.cilindradas);
        } else {
            throw new IllegalArgumentException("O objeto não é um Carro.");
        }
    }
}
