package br.com.bytebank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		// autoboxing é a criação do objeto Wrapper
		// a retirada do valor primitido do Wrapper é unboxing
		Integer idadeRef = 29; // autoboxinng, é criado um objeto do tipo Integer
		int primitivo = new Integer(21); // que loucura!! unboxing
		Integer valorRef = Integer.valueOf(33);
		int valorPri = valorRef.intValue();
		Integer iParseado1 = Integer.valueOf("42");
		int iParseado2 = Integer.valueOf("44");

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);

		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef); // ok
		lista.add(primitivo); // autoboxing

		int i1 = lista.get(0); // unboxing
		Integer i2 = lista.get(1); // ok

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(valorPri);
		System.out.println(iParseado1);
		System.out.println(iParseado2);
	}
}
