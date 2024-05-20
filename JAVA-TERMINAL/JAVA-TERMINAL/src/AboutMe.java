import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        //criação do objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");
    }
}
