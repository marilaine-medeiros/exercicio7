import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaDasIdades = 0;
        int totalPessoas = 20;

        for (int contagem = 1; contagem <= totalPessoas; contagem++) {
            System.out.println("Digite a idade da pessoa " + contagem + ":");
            int idade = scanner.nextInt();
            somaDasIdades += idade;

        }

        // Para exibir a média
        double mediaDasIdades = (double) somaDasIdades / totalPessoas;
        System.out.println("A média das idades é: " + mediaDasIdades);

        scanner.close();

    }
}
