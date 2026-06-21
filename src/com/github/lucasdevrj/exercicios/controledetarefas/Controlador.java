package com.github.lucasdevrj.exercicios.controledetarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {
    List<Tarefa> tarefas = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    void adicionarTarefa() {
        boolean desejaAdicionarTarefa = true;
        do {
            Tarefa tarefa = new Tarefa();

            System.out.print("Digite o nome da tarefa: ");
            tarefa.descricao = entrada.nextLine();

            System.out.println("true - Sim");
            System.out.println("false - Não");
            System.out.print("Digite se a tarefa foi concluída: ");
            tarefa.concluida = entrada.nextBoolean();

            tarefa.status = tarefa.concluida == true ? "Concluída" : "Pendente";

            tarefas.add(tarefa);
            System.out.println("Tarefa adicionada com sucesso.");

            System.out.println("true - Sim");
            System.out.println("false - Não");
            System.out.print("Digite se a deseja adicionar outra tarefa: ");
            desejaAdicionarTarefa = entrada.nextBoolean();
            entrada.nextLine();
        } while (desejaAdicionarTarefa);

    }

    void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.exibeTarefa());
        }
    }
}
