public abstract class Conta {

	private Pessoa pessoa;
	private int numero;
	private int agencia;
	private String tipo;
	private boolean contemPix = false;
	

	public abstract void sacar(double valor);

	public abstract void depositar(double valor);

	public abstract void exibirSaldo();

	public abstract void exibirDados();

	public void tipo() {

	}

	public void ativarPix() {
		if (contemPix == false) {
			this.contemPix = true;
			System.out.println("Pix ativado com sucesso");
		} else {
			System.err.println("pix ja está ativo");

		}

	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isContemPix() {
		return contemPix;
	}

	public void setContemPix(boolean contemPix) {
		this.contemPix = contemPix;
	}

	@Override
	public String toString() {
		return "Conta [numero: " + numero + ", agencia: " + agencia + ", contemPix: " + contemPix
				+ "]";
	}

}
