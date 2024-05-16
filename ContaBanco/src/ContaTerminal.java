import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
      
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome completo");
    String nome = scanner.nextLine();

    System.out.println("Digite o número da sua conta: ");
    int conta = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite sua agência:");
    String agencia = scanner.nextLine();

    System.out.println("Digite seu saldo:");
    Double saldo = scanner.nextDouble();

    System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque ");
    scanner.close ();
    }
}
