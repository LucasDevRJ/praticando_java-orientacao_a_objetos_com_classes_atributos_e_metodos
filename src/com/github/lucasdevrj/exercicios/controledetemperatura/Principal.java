package com.github.lucasdevrj.exercicios.controledetemperatura;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        EstufaInteligente estufaInteligente = new EstufaInteligente();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do local: ");
        estufaInteligente.local = entrada.nextLine();

        System.out.print("Digite a temperatura do local: ");
        estufaInteligente.temperatura = entrada.nextDouble();

        estufaInteligente.status = estufaInteligente.temperatura > 37.5 ?
                "Alerta: Temperatura acima do limite!" : "Temperatura normal.";

        entrada.close();

        String resultado = String.format(
                "Sensor no local: %s\nTemperatura: %.1f ºC\n%s",
                estufaInteligente.local,
                estufaInteligente.temperatura,
                estufaInteligente.status
        );

        System.out.println(resultado);
    }
}
