import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale localeBR = new Locale("pt", "BR");

    ContaTerminal conta = new ContaTerminal();
    Scanner banco = new Scanner(System.in);

    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

    System.out.println("Por favor, digite o seu nome.: ");
    conta.nomeClinte = banco.nextLine();

    System.out.println("Por favor, digite o número da Agência.: ");
    conta.agencia = banco.nextLine();

    System.out.println("Por favor, digitie o número da sua conta.:");
    conta.numero = banco.nextInt();

    System.out.println("Por favor, digite o valor do deposito.: ");
    conta.saldo = banco.nextFloat();

    BigDecimal novoSaldo = new BigDecimal(conta.saldo);

    System.out.printf(
      "Olá " +
      conta.nomeClinte +
      ",obrigado por criar uma conta em nosso banco," +
      "sua agência é " +
      conta.agencia +
      ",conta " +
      conta.numero +
      " e o seu saldo: " +
      dinheiro.format(novoSaldo) +
      ", já está disponível para saque."
    );
  }
}
