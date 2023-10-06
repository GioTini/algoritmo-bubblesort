package com.giordanacontini.testes;

import com.giordanacontini.comparaveis.Ordenar;
import com.giordanacontini.ordenaveis.Pessoa;

public class TestarOrdenacaoPessoa {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[4];
        pessoa[0] = new Pessoa("Giordana", "22222222222");
        pessoa[1] = new Pessoa("Joao", "11111111111");
        pessoa[2] = new Pessoa("Sara", "33333333333");
        pessoa[3] = new Pessoa("Robson", "44444444444");

        Ordenar o = new Ordenar();
        o.ordenar(pessoa);

        for (int cont = 0; cont < pessoa.length; cont++) {
            System.out.println("Nome:: " + pessoa[cont].getNome());
            System.out.println("Cpf: " + pessoa[cont].getCpf());
            System.out.println("\n--------\n");
        }
    }
}
