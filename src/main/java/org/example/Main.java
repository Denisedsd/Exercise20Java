package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int anoCarro = 0;
        float valorCarro = 0.0f;
        float valorComDesconto = 0.0f;
        int totalCarros = 0;
        int carrosMaisNovos = 0;

        Scanner leitor = new Scanner (System.in);

        char repetir = 'S';

        while (repetir == 'S' || repetir == 's') {

            System.out.println ("Digite o ano de fabricação do veículo");
            anoCarro = leitor.nextInt();
            System.out.println ("Digite o valor do veículo");
            valorCarro = leitor.nextFloat();

            if (anoCarro <= 2000) {
                valorComDesconto = (float) (valorCarro - valorCarro * 0.12);
            }
            else {
                valorComDesconto = (float) (valorCarro - valorCarro * 0.07);
                carrosMaisNovos = carrosMaisNovos + 1;
            }
            totalCarros = totalCarros + 1;

            System.out.println("Valor do veículo com desconto: " + valorComDesconto);

            System.out.println("Deseja consultar novo veículo? S - Sim / N - Não");
            repetir = leitor.next().charAt(0);

        }
        System.out.println("Total veículos Consultados: "+ totalCarros +"; Total veículos mais novos: "+ carrosMaisNovos);

    }
}