/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.expressivo.loop;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class Loop {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        Random variavel = new Random();

        int numeroSecreto = variavel.nextInt(10) + 1; // número de 1 a 10
        int tentativa = 0;
        int cont = 0;

        System.out.println("Bem-vindo ao jogo do número secreto!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 10.");

        try {
            do {
                System.out.print("Digite seu palpite: ");

                tentativa = entrada.nextInt();
                cont++;

                if (tentativa < numeroSecreto) {
                    System.out.println("O número secreto é MAIOR!");
                } else if (tentativa > numeroSecreto) {
                    System.out.println("O número secreto é MENOR!");
                } else {
                    System.out.println("Parabéns! Você acertou!");
                    if (cont == 1) {
                        System.out.println("Você tentou apenas 1 vez!");
                    } else {
                        System.out.println("Você tentou " + cont + " vezes!");
                    }
                }

            } while (tentativa != numeroSecreto);
        } catch (InputMismatchException e) {
            System.out.println("Erro: você deve digitar apenas números inteiros!");
        } finally {
            entrada.close();
            System.out.println("Programa encerrado. Obrigado por jogar!");
        }
    }
}