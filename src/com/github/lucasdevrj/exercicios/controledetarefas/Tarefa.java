package com.github.lucasdevrj.exercicios.controledetarefas;

public class Tarefa {
    String descricao;
    boolean concluida;
    String status;

    String exibeTarefa() {
        String tarefa = String.format("Tarefa: %s - Status: %s", descricao, status);
        return tarefa;
    }
}
