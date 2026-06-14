/**
 * Imagine que você está criando um sistema de catalogação para uma biblioteca. Seu objetivo é desenvolver
 * uma estrutura que armazene dados de obras literárias e as exiba em um formato padronizado, facilitando
 * a consulta por outros leitores.
 *
 * Crie um programa que:
 *
 * Defina uma classe com os atributos título, autor e páginas.
 * Implemente um método que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com
 * [PÁGINAS] páginas.
 *
 * Exemplo de entrada:
 * l.titulo = "O Guia do Mochileiro das Galáxias";
 * l.autor = "Douglas Adams";
 * l.paginas = 208;
 *
 * Saída esperada:
 * "O Guia do Mochileiro das Galáxias" de Douglas Adams com 208 páginas
 */

package com.github.lucasdevrj.exercicios.imprimindoresumodolivro;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do livro: ");
        livro.titulo = entrada.nextLine();

        System.out.print("Digite o autor: ");
        livro.autor = entrada.nextLine();

        System.out.print("Digite o número de páginas: ");
        livro.paginas = entrada.nextInt();

        entrada.close();

        livro.exibeTitulo();
    }
}
