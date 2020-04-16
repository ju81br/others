package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TestaAutoboxing {

	public static void main(String[] args) {
		int [] idades = new int [5];
		String [] nomes = new String[5];
		
		int idade = 30; // Classe Integer
		Integer idadeRef = new Integer(30);
		//List numeros = new ArrayList();
		List <Integer> numeros = new ArrayList<Integer>(); // <--
		numeros.add(idade);//autoboxing = apesar de idade ser primitivo o java transforma em referencia
		numeros.add(30);
	}

}
