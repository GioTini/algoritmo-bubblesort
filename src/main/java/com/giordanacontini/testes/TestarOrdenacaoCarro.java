package com.giordanacontini.testes;

import com.giordanacontini.comparaveis.Ordenar;
import com.giordanacontini.ordenaveis.Carro;

public class TestarOrdenacaoCarro {
    public static void main(String[] args) {
        Carro[] carros = new Carro[4];
        carros[0] = new Carro("BMW", "i3", 500);
        carros[1] = new Carro("Ferrari", "F599 GTO", 700);
        carros[2] = new Carro("Ford", "New Fiesta Hatch", 400);
        carros[3] = new Carro("Lamborghini", "Gallardo LP 560 – 4 Spyder", 600);

        Ordenar o = new Ordenar();
        o.ordenar(carros);

        for(int cont = 0; cont < carros.length; cont++) {
            System.out.println("Marca: " + carros[cont].getMarca());
            System.out.println("Modelo: " + carros[cont].getModelo());
            System.out.println("Cilindradas: " + carros[cont].getCilindradas());
            System.out.println("\n--------\n");
        }
    }
}
