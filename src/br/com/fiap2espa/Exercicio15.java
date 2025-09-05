import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        leitor.close();
    }
}
