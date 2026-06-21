/**
 * Você está desenvolvendo um sistema de gerenciamento de tarefas pessoais para ajudar usuários
 * a organizar suas atividades diárias. Cada tarefa precisa ser registrada com uma descrição
 * e um status que indique se já foi concluída ou não. Seu objetivo é criar uma estrutura que
 * armazene essas tarefas e permita visualizá-las.
 *
 * Crie um programa que:
 * Defina uma classe com os atributos descrição e concluída.
 * Implemente um método que mostre a descrição da tarefa e seu status.
 * Crie uma lista de tarefas e exiba todas as tarefas cadastradas. Dica: use ArrayList.
 *
 * Exemplo de entrada:
 * Tarefa t1 = new Tarefa();
 * t1.descricao = "Estudar Java";
 * t1.concluida = false;
 *
 * Tarefa t2 = new Tarefa();
 * t2.descricao = "Fazer exercícios";
 * t2.concluida = true;
 *
 * Saída esperada:
 * Tarefa: Estudar Java - Status: Pendente
 * Tarefa: Fazer exercícios - Status: Concluída
 */

package com.github.lucasdevrj.exercicios.controledetarefas;

public class Principal {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.adicionarTarefa();
        controlador.exibirTarefas();
    }
}
