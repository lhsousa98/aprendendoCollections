package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaoLivre;

	public GuardadorDeContas() {
		super();
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	// public Conta[] getReferencias() {
	// return referencias;
	// }
	//
	// public void setReferencias(Conta[] referencias) {
	// this.referencias = referencias;
	// }

	public void adiciona(Conta ref) {
		// para refer�ncia n�o ter uma posi��o fixa
		this.referencias[this.posicaoLivre] = ref;
		//cada add ele vai incrementando n�o tem fim
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	// pega a posi��o do array como refer�ncia
	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}
