package br.com.fiap2espa;

import java.util.Scanner;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sua altura em metros?");
        double altura = leitor.nextDouble();
        System.out.println("Qual seu peso?");
        double peso = leitor.nextDouble();
        double imc= peso/(altura*altura)    ;
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (18.5 <= imc && imc<= 24.9){
            System.out.println("Peso normal");
        }
        else if (25 <= imc && imc <= 29.9){
            System.out.println("Sobre Peso");
        }
        else{
            System.out.println("Obesidade");
        }
        leitor.close();
    }

