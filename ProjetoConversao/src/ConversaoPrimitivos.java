import java.util.Scanner;

public class ConversaoPrimitivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura de um número decimal do console (tipo primitivo double)
        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        // Conversão do tipo primitivo double para o wrapper Double
        Double numeroWrapper = Double.valueOf(numeroDecimal);

        // Imprimindo os valores antes e depois da conversão
        System.out.println("Número original (double): " + numeroDecimal);
        System.out.println("Número após a conversão para o wrapper Double: " + numeroWrapper);

        // Fechar o scanner
        scanner.close();
    }
}
