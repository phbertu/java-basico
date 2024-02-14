import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o número da Agência !");
		
		String agencia = sc.next();
		
		System.out.println("Por favor, digite o número da Conta !");
		
		int numeroConta = sc.nextInt();
		
		System.out.println("Por favor, digite seu Nome !");
		
		String nome = sc.next();
		
		System.out.println("Por favor, informe o Saldo !");
		
		Double saldo = sc.nextDouble();
		
		Cliente cliente = new Cliente(nome);
		Conta conta = new Conta(agencia, numeroConta, saldo);
		
		System.out.println("Olá " + cliente.nome + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + conta.agencia + ", conta " + conta.conta + " e seu saldo R$" + conta.saldo + " já está disponível para saque.	");
		
	}

}
