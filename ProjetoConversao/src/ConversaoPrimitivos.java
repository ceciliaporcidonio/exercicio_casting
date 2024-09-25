import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura de um número decimal do console (tipo double)
        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        // Casting para um tipo inteiro (int)
        int numeroInteiro = (int) numeroDecimal;

        // Imprimindo os valores antes e depois do casting
        System.out.println("Número original (double): " + numeroDecimal);
        System.out.println("Número após o casting para int: " + numeroInteiro);

        // Fechar o scanner
        scanner.close();
    }
}
