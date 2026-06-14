package com.github.lucasdevrj.principal;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void exibirInformacoes() {
        System.out.printf("Funcionário: %s - Cargo: %s - Salário: %.2f", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("Novo salário de %s é R$ %.2f", nome, salario);
    }
}