package br.com.fiap2espa;


import java.util.Scanner;


public class PagamentoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Preço: ");
        double preco = sc.nextDouble();


        System.out.print("Forma (1 = à vista, 2 = 2x, 3 = 4x): ");
        int f = sc.nextInt();


        if (f == 1) {
            System.out.println("Valor final: R$ " + (preco * 0.90));
        } else if (f == 2) {
            double t = preco;
            System.out.println("Valor final: R$ " + t + " (2x de R$ " + (t / 2) + ")");
        } else if (f == 3) {
            double t = preco * 1.08;
            System.out.println("Valor final: R$ " + t + " (4x de R$ " + (t / 4) + ")");
        } else {
            System.out.println("Opção inválida");
        }


        sc.close();
    }
}
