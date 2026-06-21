package com.github.lucasdevrj.exercicios.multaporatraso;

public class Principal {
    public static void main(String[] args) {
        ControleDevolucoesLivraria controleDevolucoesLivraria = new ControleDevolucoesLivraria();
        controleDevolucoesLivraria.cadastraAluguelLivro();
        controleDevolucoesLivraria.exibeAluguel();
    }
}
