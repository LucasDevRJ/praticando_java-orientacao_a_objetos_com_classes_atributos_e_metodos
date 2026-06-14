package com.github.lucasdevrj.principal;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void exibirInformacoes() {
        System.out.printf("Funcionário: %s - Cargo: %s - Salário: %.2f", nome, cargo, salario);
    }
}