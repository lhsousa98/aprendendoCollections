package br.com.bytebank.testa.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaArrayList {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente(222, 111);

		Conta cc2 = new ContaCorrente(222, 222);

		/* Testa classe com duplicidade linkada */
		// LinkedList<Conta> lista = new LinkedList<Conta>();

		// quando quero pegar o tamanho e posições
		List<Conta> lista = new Vector<Conta>(); // Thread Safe

		//ArrayList<String> nomes = new ArrayList<String>();
		// ArrayList<Conta> lista = new ArrayList<>();
		lista.add(cc);
		lista.add(cc2);

		System.out.println(lista.size());

		// Me retorna a posição 1 da minha lista a cc
		// Object ref = lista.get(0);

		// casting da conta
		Conta ref = (Conta) lista.get(0);

		System.out.println(ref);
		System.out.println(ref.getNumero());

		// removendo elemento do meu array
		lista.remove(0);

		/* Me mostra que só tenho a posição 1 do meu array a 0 foi excluída */
		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(333, 311);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(333, 322);
		lista.add(cc4);

		System.out.println();
		System.out.println("----------------FOR-----------------------");
		for (int i = 0; i < lista.size(); i++) {
			// vai me trazer todas as informações
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println();
		System.out.println("************FOREACH***********************");
		// trouxe todas informações a mesma coisa do acima
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
