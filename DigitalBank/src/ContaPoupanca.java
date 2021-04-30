
public class ContaPoupanca extends Conta {

	private double saldoContaPoupanca;

	public double getSaldoContaPoupanca() {
		return saldoContaPoupanca;
	}

	@Override
	public void sacar(double valor) {
		if (saldoContaPoupanca >= valor) {
			System.out.println("Saque efetuado com sucesso!");
			this.saldoContaPoupanca -= valor;
		} else {
			System.err.println("Saldo insuficiente");
		}

	}

	@Override
	public void depositar(double valor) {
		this.saldoContaPoupanca += valor;
		System.out.println("Deposito efetuado com sucesso!");

	}

	@Override
	public void exibirSaldo() {
		System.out.println("Seu saldo em conta é: R$ " + saldoContaPoupanca);

	}

	@Override
	public void exibirDados() {
		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("Numero da Conta: " + this.getNumero());
		System.out.println("Conta possui Pix: " + this.isContemPix());

	}

}
