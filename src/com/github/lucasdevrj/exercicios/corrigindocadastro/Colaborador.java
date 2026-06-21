/**
 * Você está desenvolvendo um sistema de controle de colaboradores para uma empresa de tecnologia.
 * Às vezes, é necessário atualizar o cargo e o nível de acesso de um funcionário devido a promoções
 * ou mudanças de departamento. Seu programa deve permitir essas alterações e mostrar as informações atualizadas.
 *
 * Crie uma classe que:
 * Represente um colaborador com os atributos nome, cargo e nivel de acesso.
 * Implemente um método que permita alterar o cargo e o nível de acesso.
 * Exiba no console as informações antes e depois da atualização.
 * Exemplo de entrada:
 *
 * Nome: Júlia Oliveira
 * Cargo atual: Pessoa Desenvolvedora Júnior
 * Novo cargo: Pessoa Desenvolvedora Plena
 * Nível de acesso atual: 1
 * Novo nível de acesso: 2
 *
 * Saída esperada:
 * --- Antes da atualização ---
 * Nome: Júlia Oliveira
 * Cargo: Pessoa Desenvolvedora Júnior
 * Nível de acesso: 1
 *
 * --- Após atualização ---
 * Nome: Júlia Oliveira
 * Cargo: Pessoa Desenvolvedora Plena
 * Nível de acesso: 2
 */

package com.github.lucasdevrj.exercicios.corrigindocadastro;

import java.util.Scanner;

public class Colaborador {
    String nome;
    String cargo;
    int nivelDeAcesso;

    Scanner entrada = new Scanner(System.in);

    void cadastrarColaborador() {
        nome = atribuirValor("Digite o nome do colaborador: ", nome);
        cargo = atribuirValor("Digite o cargo do colaborador: ", cargo);
        nivelDeAcesso = atribuirNivelDeAcesso("Digite o nível de acesso do colaborador: ");
        entrada.nextLine();
        System.out.println("Colaborador cadastrado com sucesso.");
    }

    void exibirColaborador() {
        System.out.println("--------------------|COLABORADOR|--------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de Acesso: " + nivelDeAcesso);
        System.out.println("-----------------------------------------------------");
    }

    void atualizarColaborador() {
        cargo = atribuirValor("Digite o novo cargo do colaborador: ", cargo);
        nivelDeAcesso = atribuirNivelDeAcesso("Digite o novo nível de acesso do colaborador: ");
        System.out.println("Colaborador atualizado com sucesso.");
    }

    String atribuirValor(String mensagem, String atributo) {
        System.out.print(mensagem);
        atributo = entrada.nextLine();

        while (atributo.isEmpty()) {
            System.out.println("Digite o valor solicitado!");
            System.out.print(mensagem);
            atributo = entrada.nextLine();
        }
        return atributo;
    }

    int atribuirNivelDeAcesso(String mensagem) {
        System.out.print(mensagem);
        nivelDeAcesso = entrada.nextInt();

        while (nivelDeAcesso <= 0) {
            System.out.println("Digite um nível de acesso válido!");
            System.out.print(mensagem);
            nivelDeAcesso = entrada.nextInt();
        }
        return nivelDeAcesso;
    }

}
