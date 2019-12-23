package br.com.bytebank.testa.arrays;

import java.util.*;

public class TesteWrappers {

	public static void main(String[] args) {

		// Wrappers class e lists

		int[] idades = new int[5];
		String[] nomes = new String[5];

		int idade = 29;
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);

		int valor = idadeRef.intValue();

		try {
			String s = args[0];// "10".
			int numero = Integer.parseInt(s);
			System.out.println(numero);
		} catch (Exception ex) {
			System.out.println("Exception" + ex);
		}

		// Integer numero = Integer.valueOf(s);
		
		

		/*
		 * Tipo primitivo não pode ir para dentro de um array pois ele não é uma
		 * referência, quando o Integer aparece riscado é que ele não deveria estar com
		 * esse contrutor ali ~Integer~
		 */
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // Autoboxing
		numeros.add(idade);

		/*
		 * System.out.println(valor); System.out.println(numeros);
		 */
	}

}
