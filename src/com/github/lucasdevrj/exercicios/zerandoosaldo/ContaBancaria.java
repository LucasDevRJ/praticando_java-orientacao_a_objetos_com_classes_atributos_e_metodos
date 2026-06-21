package com.github.lucasdevrj.exercicios.zerandoosaldo;

import java.util.Scanner;

public class ContaBancaria {

    double saldo = 0.00;

    public void depositarValor() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = entrada.nextDouble();
        saldo += valor;

        System.out.printf("O deposito de R$%.2f foi realizado com sucesso.\n", valor);
    }

    public void exibirSaldo() {
        System.out.printf("Saldo Atual: R$%.2f.\n", saldo);
    }

    public void zerarSaldo() {
        saldo = 0.00;
        System.out.println("Saldo zerado com sucesso.");
    }
}
