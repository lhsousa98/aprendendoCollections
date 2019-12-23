package br.com.bytebank.testa.arrays;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayReferencia {

	public static void main(String[] args) {
		Conta[] contas = new Conta[5];

		ContaCorrente cc1 = new ContaCorrente(222, 587264);

		// posição 0 adiciona as informações da conta 1
		contas[0] = cc1;

		ContaCorrente cc2 = new ContaCorrente(223, 587265);
		contas[1] = cc2;

		ContaPoupanca cc3 = new ContaPoupanca(1234, 12345);
		contas[1] = cc3;

		// array pos 1 mostra só o numero da conta
		System.out.println(contas[1].getNumero());

		// pos guarda a referencia de conta corrente
		Conta ref1 = contas[1];

		Conta ref = contas[1];

		Conta ref2 = contas[1];

		// relizando um type cast ma conta mais específica para mais uma genérica

		ContaPoupanca refPoup = (ContaPoupanca) contas[1];

		// arrays tipo genérico
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		System.out.println(ref1.getNumero());
		System.out.println(ref2.getAgencia());
		System.out.println(refPoup.getAgencia());

		System.out.println(contas[0].getAgencia());
	}

}
