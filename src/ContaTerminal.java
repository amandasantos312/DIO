import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Numero: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("\nOla %s! \nObrigada por criar uma conta em nosso banco \nSua agencia eh %s, conta %d e seu saldo %.2f ja esta disponivel para saque!\n", nome, agencia, numero, saldo);

        scanner.close();
    }
}
