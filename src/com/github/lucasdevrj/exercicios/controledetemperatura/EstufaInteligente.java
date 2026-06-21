/**
 * Imagine que você faz parte de uma equipe de agricultura tecnológica responsável por monitorar
 * estufas inteligentes. Cada setor possui sensores que coletam dados críticos para o crescimento
 * das plantas. Seu desafio é desenvolver um sistema que não apenas registre a temperatura,
 * mas também alerte quando as condições saírem do ideal, garantindo a saúde das culturas.
 *
 * Crie uma classe que:
 *
 * Possua os atributos local, indicando o setor monitorado, e temperatura atual, armazenando a última medição.
 * Implemente um método que mostre:
 *
 * O local do sensor.
 * A temperatura formatada com uma casa decimal.
 * Um alerta se a temperatura ultrapassar 37.5ºC.
 *
 * Exemplo de entrada:
 * local = "Setor A"
 * temperaturaAtual = 39.2
 *
 * Saída esperada:
 * Sensor no local: Setor A
 * Temperatura: 39,2 ºC
 * Alerta: Temperatura acima do limite!
 */

package com.github.lucasdevrj.exercicios.controledetemperatura;

public class EstufaInteligente {
    String local;
    double temperatura;
    String status = "";
}
