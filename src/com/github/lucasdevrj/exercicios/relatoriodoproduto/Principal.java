/**
 * Imagine que você é responsável pelo controle de estoque de uma loja de informática que está
 * expandindo seus negócios. Com o aumento da demanda, é importante manter um registro organizado
 * e preciso de todos os produtos disponíveis. Sua tarefa é criar um sistema que armazene as
 * informações de cada item e gere um relatório para facilitar a gestão do estoque.
 *
 * Sua tarefa é criar uma classe que:
 *
 * Represente um produto com os atributos nome, preço e quantidade.
 * Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com
 * duas casas decimais.
 *
 * Exemplo de entrada:
 * nome = "Mouse Gamer"
 * preco = 159.9
 * quantidade = 25
 *
 * Saída esperada:
 * Produto: Mouse Gamer
 * Preço: R$ 159,90
 * Quantidade em estoque: 25
 */


package com.github.lucasdevrj.exercicios.relatoriodoproduto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        produto.nome = entrada.nextLine();

        System.out.print("Digite o preço do produto: ");
        produto.preco = entrada.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        produto.quantidade = entrada.nextInt();

        entrada.close();

        produto.exibirProduto();
    }
}
