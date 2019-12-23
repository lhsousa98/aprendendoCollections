package br.com.bytebank.testa.arrays;

import java.util.ArrayList;
import java.util.List;

public class TestaOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue()); // unboxing

		Double dRef = Double.valueOf(3.2); // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing

		Boolean bRef = Boolean.FALSE; // autoxing
		System.out.println(bRef.booleanValue()); // unboxing
		
		Number refNumero = Integer.valueOf(29);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);

	}

}
