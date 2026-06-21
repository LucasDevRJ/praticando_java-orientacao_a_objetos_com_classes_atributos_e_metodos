package com.github.lucasdevrj.exercicios.calculadoasnotas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = entrada.nextLine();

        System.out.print("Digite a primeira nota: ");
        aluno.primeiraNota = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        aluno.segundaNota = entrada.nextDouble();

        entrada.close();

        String resultado = String.format(
                "Aluno: %s\nNota 1: %.1f\nNota 2: %.1f\nMédia: %.1f\n%s",
                aluno.nome,
                aluno.primeiraNota,
                aluno.segundaNota,
                aluno.calcularMedia(),
                aluno.exibirResultado()
        );

        System.out.println(resultado);
    }
}
