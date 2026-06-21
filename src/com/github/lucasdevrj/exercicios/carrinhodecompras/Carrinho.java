/**
 * Você está desenvolvendo o sistema de checkout de um e-commerce de produtos eletrônicos.
 * Seu desafio é calcular o valor total do carrinho de compras, considerando que cada produto
 * pode ter quantidades diferentes e preços variados.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos nome, preço e quantidade.
 * Implemente um método que retorne o valor total do item (preço x quantidade).
 * Crie uma lista de item e calcule o valor total da compra.
 *
 * Exemplo de entrada:
 * i1.nome = "Teclado";
 * i1.preco = 120.0;
 * i1.quantidade = 1;
 *
 * i2.nome = "Mouse";
 * i2.preco = 60.0;
 * i2.quantidade = 2;
 *
 * Saída esperada:
 * Total da compra: R$ 240.00
 */

package com.github.lucasdevrj.exercicios.carrinhodecompras;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {

    List<Produto> produtos = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    BigDecimal valorTotal = BigDecimal.ZERO;;

    void adicionarProduto() {
        do {
            Produto produto = new Produto();

            System.out.print("Digite o nome do produto ou \"sair\": ");
            produto.nome = entrada.nextLine();

            if (produto.nome.equals("sair")) {
                break;
            }

            System.out.print("Digite o preço do produto: ");
            produto.preco = entrada.nextBigDecimal();

            System.out.print("Digite a quantidade do produto: ");
            produto.quantidade = entrada.nextInt();

            entrada.nextLine();
            produtos.add(produto);
            System.out.println("Produto adicionado com sucesso.");

        } while (true);
    }

    BigDecimal calculaValorTotal() {
        for (Produto produto : produtos) {
            BigDecimal precoDoProduto = produto.preco;
            BigDecimal quantidadeDoProduto = BigDecimal.valueOf(produto.quantidade);
            BigDecimal valorTotalProduto = precoDoProduto.multiply(quantidadeDoProduto);
            this.valorTotal = this.valorTotal.add(valorTotalProduto);
        }
        return this.valorTotal;
    }

    void exibirValorTotalDoCarrinho() {
        System.out.printf("\nTotal da compra: R$ %.2f", calculaValorTotal());
    }
}
