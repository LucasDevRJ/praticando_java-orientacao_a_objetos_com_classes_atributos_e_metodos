/**
 * Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem realizar
 * transações financeiras. Em determinadas situações, como encerramento de conta, é necessário
 * zerar o saldo disponível.
 *
 * Crie um programa que:
 *
 * Defina uma classe com o atributo saldo.
 * Implemente um método que redefine o valor do saldo para 0.0.
 * Implemente um método que mostra o saldo atual formatado.
 *
 * Exemplo de entrada:
 *
 * conta.saldo = 1579.42;
 *
 * conta.exibirSaldo();
 * conta.zerarSaldo();
 * conta.exibirSaldo();
 *
 * Saída esperada:
 *
 * Saldo atual: R$ 1579.42
 * Saldo atual: R$ 0.00
 */

package com.github.lucasdevrj.exercicios.zerandoosaldo;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositarValor();
        contaBancaria.depositarValor();
        contaBancaria.exibirSaldo();
        contaBancaria.zerarSaldo();
        contaBancaria.exibirSaldo();
    }
}
