/**
 * Imagine que você está desenvolvendo um sistema de controle de devoluções para uma livraria.
 * Quando um livro é devolvido com atraso, é necessário calcular o valor da multa conforme os dias de atraso.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos título e dias de atraso.
 * Implemente um método que:
 * Cobre R$ 2,50 por dia de atraso.
 * Retorne o valor total da multa.
 * Implemente um método que mostre o título e o valor da multa formatado.
 *
 * Exemplo de entrada:
 * pedido.titulo = "Dom Casmurro";
 * pedido.diasAtraso = 3;
 *
 * pedido.exibirDetalhes();
 *
 * Saída esperada:
 * Livro: Dom Casmurro | Multa por 3 dias de atraso: R$ 7,50
 */

package com.github.lucasdevrj.exercicios.multaporatraso;

import java.math.BigDecimal;
import java.util.Scanner;

public class ControleDevolucoesLivraria {

    String titulo;
    int diasDeAtraso;
    BigDecimal valorMulta;

    Scanner entrada = new Scanner(System.in);

    void cadastraAluguelLivro() {
        System.out.print("Digite o livro que foi alugado: ");
        titulo = entrada.nextLine();

        System.out.print("Digite os dias de atraso: ");
        diasDeAtraso = entrada.nextInt();

        valorMulta = calculaMulta();

        System.out.println("Aluguel do livro cadastrado.");
    }

    BigDecimal calculaMulta() {
        BigDecimal multaDiaria = new BigDecimal("2.50");
        valorMulta = multaDiaria.multiply(BigDecimal.valueOf(diasDeAtraso));
        return valorMulta;
    }

    void exibeAluguel() {
        String aluguelDoLivro = String.format(
                "Livro: %s | Multa por %d dia(s) de atraso: R$ %.2f",
                titulo,
                diasDeAtraso,
                valorMulta
        );
        System.out.println(aluguelDoLivro);
    }
}
