/**
 * Você está desenvolvendo um sistema de gerenciamento para uma loja de roupas e precisa garantir
 * que o estoque seja atualizado corretamente a cada venda realizada. Seu programa deve processar
 * as vendas e alertar quando não houver produtos suficientes no estoque.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos nome e quantidade.
 * Implemente um método que:
 * Subtraia a quantidade vendida do estoque se houver disponibilidade.
 * Exiba uma mensagem formatada com o saldo atual usando printf
 * Exiba um alerta “Estoque insuficiente” quando não for possível atender a venda.
 * Exemplo de entrada:
 *
 * item.nome = "Camiseta";
 * item.quantidade = 10;
 *
 * item.vender(3);
 * item.vender(8);
 *
 * Saída esperada:
 * Venda realizada. Estoque restante de Camiseta: 7
 * Estoque insuficiente
 */

package com.github.lucasdevrj.exercicios.controledeestoque;

import java.util.Scanner;

public class Produto {

    String nome;
    int quantidade;

    Scanner entrada = new Scanner(System.in);

    void cadastrar() {
        System.out.print("Digite o produto: ");
        nome = entrada.nextLine();

        while (nome.isEmpty()) {
            System.out.println("Digite o nome do produto!");
            System.out.print("Digite o produto: ");
            nome = entrada.nextLine();
        }

        System.out.print("Digite a quantidade: ");
        quantidade = entrada.nextInt();

        while (quantidade <= 0) {
            System.out.println("Digite uma quantidade positiva!");
            System.out.print("Digite a quantidade: ");
            quantidade = entrada.nextInt();
        }

        System.out.printf("Produto \"%s\" cadastrado com sucesso.\n", nome);
    }

    void vender() {
        System.out.print("Digite a quantidade vendida: ");
        int quantidade = entrada.nextInt();

        while (quantidade <= 0) {
            System.out.println("Digite uma quantidade positiva!");
            System.out.print("Digite a quantidade vendida: ");
            quantidade = entrada.nextInt();
        }

        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Venda realizada.");
            System.out.printf("Estoque restante de \"%s\": %d", nome, this.quantidade);
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}
