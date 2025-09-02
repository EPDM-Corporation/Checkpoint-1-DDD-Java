package br.com.fiap2espa;

import java.util.Scanner;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = 0;
        int par = 0;
        int impar = 0;
        while (x < 10) {
            System.out.println("qual numero deseja saber se é par ou impar");
            int numero = leitor.nextInt();
            if (numero % 2 != 0) {
                System.out.println("Ímpar");
                impar++;
            } else {
                System.out.println("Par");
                par++;
            }
            x++;
        }
        System.out.println("impares: "+impar);
        System.out.println("Pares: "+par);
        leitor.close();
    }

