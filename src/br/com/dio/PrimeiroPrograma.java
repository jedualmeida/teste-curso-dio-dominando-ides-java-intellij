package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/

        Gato gato = new Gato();

        System.out.println(gato);

        Livro Livro1 = new Livro("The Witcher", 300);

        System.out.println(Livro1);

    }
}

class Livro {
    private String nome;
    private Integer numPag;

    public Livro(String nome, Integer numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}
