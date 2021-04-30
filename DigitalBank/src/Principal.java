import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Conta cc1 = new ContaCorrente();

		Pessoa c1 = new Pessoa();

		System.out.println("*** BEM-VINDO AO DIGITAL BANK ***");

		System.out.print("Digite seu nome:");
		c1.setNome(ler.nextLine());

		System.out.print("Digite o número da sua agencia:");
		cc1.setAgencia(ler.nextInt());

		System.out.print("Digite o número da sua conta:");
		cc1.setNumero(ler.nextInt());

		cc1.setContemPix(false);

		System.out.print("Deseja ativar o Pix? (y/n):");
		char resposta = ler.next().charAt(0);
		if (resposta == 'y') {
			cc1.ativarPix();
		}
		System.out.println("===================================");

		System.out.println(c1);
		cc1.exibirDados();

		System.out.println("===================================");

		cc1.exibirSaldo();

		System.out.print("Entre com um valor de deposito: ");
		cc1.depositar(ler.nextDouble());
		System.out.println();

		cc1.exibirSaldo();
		System.out.println("===================================");

		System.out.print("Qual valor deseja sacar? "); // Desconto de R$5.0 por saque efetuado
		cc1.sacar(ler.nextDouble());

		System.out.println();
		cc1.exibirSaldo();

		ler.close();
	}
}
