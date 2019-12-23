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
		// para referência não ter uma posição fixa
		this.referencias[this.posicaoLivre] = ref;
		//cada add ele vai incrementando não tem fim
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	// pega a posição do array como referência
	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}
