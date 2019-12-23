package br.com.bytebank.testa.arrays;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();

		Conta cc = new ContaCorrente(222, 333);
		Conta cc2 = new ContaCorrente(222, 444);

		guardador.adiciona(cc);

		guardador.adiciona(cc2);

		int tamanho = guardador.getQuantidadeDeElementos();
		
		Conta ref = guardador.getReferencia(0);

		System.out.println(cc);
		System.out.println(cc2);
		System.out.println(tamanho);
		System.out.println(ref.getNumero());

	}

}
