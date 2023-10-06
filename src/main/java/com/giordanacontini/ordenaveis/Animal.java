package com.giordanacontini.ordenaveis;

import com.giordanacontini.comparaveis.Comparavel;

public class Animal implements Comparavel {
    private String especie;
    private String raca;

    public Animal(String especie, String raca) {
        this.especie = especie;
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public int comparar(Object o) {
        if (!(o instanceof Animal animal)) {
            return 0;
        }

        int comparacaoPorEspecie = this.especie.compareTo(animal.getEspecie());
        if (comparacaoPorEspecie != 0) {
            return comparacaoPorEspecie;
        }
        return this.raca.compareTo(animal.getRaca());
    }
}
