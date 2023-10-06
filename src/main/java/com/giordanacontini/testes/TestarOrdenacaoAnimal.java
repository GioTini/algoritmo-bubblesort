package com.giordanacontini.testes;

import com.giordanacontini.comparaveis.Ordenar;
import com.giordanacontini.ordenaveis.Animal;

public class TestarOrdenacaoAnimal {
    public static void main(String[] args) {
        Animal[] animais = new Animal[4];
        animais[0] = new Animal("Cachorro", "Labrador");
        animais[1] = new Animal("Gato", "Siames");
        animais[2] = new Animal("Cachorro", "Border Collie");
        animais[3] = new Animal("Cachorro", "Shih Tzu");

        Ordenar o = new Ordenar();
        o.ordenar(animais);

        for(int cont = 0; cont < animais.length; cont++) {
            System.out.println("Especie: " + animais[cont].getEspecie());
            System.out.println("Raca: " + animais[cont].getRaca());
            System.out.println("\n--------\n");
        }
    }
}
