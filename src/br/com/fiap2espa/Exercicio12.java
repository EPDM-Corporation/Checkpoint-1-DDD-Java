package br.com.fiap2espa;

import java.util.Scanner;

public class VolumeCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Comprimento: ");
        double comprimento = sc.nextDouble();

        System.out.print("Largura: ");
        double largura = sc.nextDouble();

        System.out.print("Unidade (cm/m): ");
        String unidade = sc.next();
        String unidadeCubo = unidade.equalsIgnoreCase("cm") ? "cm³" : "m³";

        double volume = altura * comprimento * largura;
        System.out.printf("Volume da caixa = %.2f %s%n", volume, unidadeCubo);

        sc.close();
    }
}
