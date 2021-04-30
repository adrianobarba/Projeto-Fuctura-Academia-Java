
public class ContaCorrente extends Conta {

	private double saldoContaCorrente;

	@Override
	public void sacar(double valor) {
		if (saldoContaCorrente >= valor) {
			System.out.println("Saque efetuado com sucesso!");
			this.saldoContaCorrente -= valor + 5.0;
		} else {
			System.err.println("Saldo insuficiente");
		}

	}

	@Override
	public void depositar(double valor) {
		this.saldoContaCorrente += valor;
		System.out.println("Deposito efetuado com sucesso!");
	}

	@Override
	public void exibirSaldo() {
		System.out.println("Seu saldo em conta é: R$ " + saldoContaCorrente);

	}

	public double getSaldoContaCorrente() {
		return saldoContaCorrente;
	}

	@Override
	public void exibirDados() {

		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("Numero da Conta: " + this.getNumero());
		System.out.println("Conta possui Pix: " + this.isContemPix());

	}

}
