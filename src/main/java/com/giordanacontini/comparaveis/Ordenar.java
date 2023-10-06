package com.giordanacontini.comparaveis;

public class Ordenar {
    public void ordenar(Comparavel[] objetos) {
        for (int i = 0; i < objetos.length; i++) {
            for (int j = i + 1; j < objetos.length; j++) {
                if (objetos[i].comparar(objetos[j]) > 0) {
                    Comparavel temp = objetos[i];
                    objetos[i] = objetos[j];
                    objetos[j] = temp;
                }
            }
        }
    }

    public void ordenarDecrescente(Comparavel[] objetos) {
        for (int i = 0; i < objetos.length; i++) {
            for (int j = i + 1; j < objetos.length; j++) {
                if (objetos[i].comparar(objetos[j]) < 0) {
                    Comparavel temp = objetos[i];
                    objetos[i] = objetos[j];
                    objetos[j] = temp;
                }
            }
        }
    }
}
