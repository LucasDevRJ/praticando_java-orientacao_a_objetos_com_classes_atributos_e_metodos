package com.github.lucasdevrj.exercicios.relatoriodoproduto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void exibirProduto() {
        String informacoes = String.format("Produto: %s\nPreço: R$ %.2f\nQuantidade em estoque: %d",
                nome, preco, quantidade);
        System.out.println(informacoes);
    }
}
