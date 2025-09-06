package br.com.fiap2espa;

import java.util.Scanner;

public class PessoaMaisVelha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = 1;
        String maisVelho = "";
        int maiorIdade = -1;

        while (x <= 3) {
            System.out.println("Digite o nome da pessoa " + x + ":");
            String nome = leitor.next(); // simples (uma palavra)
            System.out.println("Digite a idade de " + nome + ":");
            int idade = leitor.nextInt();

            if (idade > maiorIdade) {
                maiorIdade = idade;
                maisVelho = nome;
            }
            x++;
        }

        System.out.println("Pessoa mais velha: " + maisVelho);
        leitor.close();
    }
}
