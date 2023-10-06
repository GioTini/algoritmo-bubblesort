package com.giordanacontini.ordenaveis;

import com.giordanacontini.comparaveis.Comparavel;

public class Pessoa implements Comparavel {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int comparar(Object o) {
        if (!(o instanceof Pessoa pessoa)) {
            return 0;
        }

        int comparacaoPorNome = this.nome.compareTo(pessoa.getNome());
        if (comparacaoPorNome != 0) {
            return comparacaoPorNome;
        }
        return this.cpf.compareTo(pessoa.getCpf());
    }
}
