import java.util.Scanner;
import java.util.Locale;



public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.out.println("Digite seu nome, por favor: ");
        String NomeCliente = scanner.next();

        System.out.println("Informe o número da sua conta: ");
        int numero = scanner.nextInt();
    
        System.out.println("Informe o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o saldo da sua conta: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + NomeCliente +", " + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta número " + numero + ", e seu saldo é " + saldo + "." );
    }
}
