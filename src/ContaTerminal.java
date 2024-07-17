import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Integer conta_numero = 0;
        String agencia = "";
        String nome = "";
        BigDecimal saldo = BigDecimal.valueOf(0);

        Scanner scs = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da agencia :");
        conta_numero = scs.nextInt();
        scs.nextLine();
        System.out.println("Digite o nome da agencia :");
        agencia = scs.nextLine();
        System.out.println("Digite o seu nome :");
        nome = scs.nextLine();
        System.out.println("Digite o valor de deposito inicial :");
        saldo = scs.nextBigDecimal();

        System.out.println("Ola "
                + nome + " , obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + " conta "
                + conta_numero
                + " e seu saldo "
                + saldo
                + " já esta disponivel para saque");
    }
}
