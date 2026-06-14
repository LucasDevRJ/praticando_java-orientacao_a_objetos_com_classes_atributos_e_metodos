package com.github.lucasdevrj.principal;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Ana";
        funcionario1.cargo = "Gerente de Projetos";
        funcionario1.salario = 9000;

        funcionario1.exibirInformacoes();
        System.out.println();

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "João";
        funcionario2.cargo = "Desenvolvedor";
        funcionario2.salario = 8500;

        funcionario2.exibirInformacoes();
        System.out.println();
        funcionario2.reajustarSalario(5);
    }
}
