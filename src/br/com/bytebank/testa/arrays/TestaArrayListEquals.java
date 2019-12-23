package br.com.bytebank.testa.arrays;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<>();

		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		Conta cc3 = new ContaCorrente(22, 23);

		lista.add(cc);
		lista.add(cc2);
		/* false porque estou removendo esse 3 elemento da minha lista */
		lista.add(cc3);

		/* contains ele retorna se é true ou false se existe esse elemento ou não */
		boolean existe = lista.contains(cc2);
		boolean igual = cc.ehIgual(cc2);

		// se esse elemento existe true, senão false
		System.out.println(existe);
		System.out.println(igual);

		lista.forEach(conta -> {
			System.out.println(conta);
			if (conta.ehIgual(cc3)) {
				System.out.println("Já possuo essa conta!");
			}
		});

	}
}
