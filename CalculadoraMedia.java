import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Media de notas");

        System.out.println("Digite a quantidade de notas: ");
        int quantidadeDeNotas = scanner.nextInt();

        double soma = 0;
        for (int i = 1; i <= quantidadeDeNotas; i++) {
            System.out.println("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / quantidadeDeNotas;
        System.out.println("Resultado da media: " + media);

        scanner.close();
    }
}
