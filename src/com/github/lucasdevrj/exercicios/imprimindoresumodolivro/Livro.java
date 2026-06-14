package com.github.lucasdevrj.exercicios.imprimindoresumodolivro;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public void exibeTitulo() {
        String informacoesDoTitulo = "\"%s\" de %s com %d páginas.".formatted(titulo, autor, paginas);
        System.out.println(informacoesDoTitulo);
    }
}
