import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite o número da sua agência:");
        int nAgencia = scanner.nextInt();

        System.out.println("Agora digite o número da sua conta:");
        int nConta = scanner.nextInt();

        System.out.println("Digite quanto você tem na sua conta");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+nAgencia+", conta "+nConta+" e seu saldo "+ saldo+ 
        " já está disponível para saque.");
    }
}
