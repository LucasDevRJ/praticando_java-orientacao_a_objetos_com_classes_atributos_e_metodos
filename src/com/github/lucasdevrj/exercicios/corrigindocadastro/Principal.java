package com.github.lucasdevrj.exercicios.corrigindocadastro;

public class Principal {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        colaborador.cadastrarColaborador();
        colaborador.exibirColaborador();
        colaborador.atualizarColaborador();
        colaborador.exibirColaborador();
    }
}
