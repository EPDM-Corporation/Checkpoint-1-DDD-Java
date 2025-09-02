package br.com.fiap2espa;

import java.util.Scanner;


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha um numero");
        int numero1 = leitor.nextInt();
        System.out.println("Escolha outro numero");
        int numero2 = leitor.nextInt();
        if (numero1>numero2){
            System.out.println("O numero "+numero1+" é maior");
        }
        else{
            System.out.println("O numero "+numero2+" é maior");
        }
        leitor.close();
    }

