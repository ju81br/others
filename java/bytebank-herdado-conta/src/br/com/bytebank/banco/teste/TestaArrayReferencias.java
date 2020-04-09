package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayReferencias {

	public static void main(String[] args) {
		//int [] idades = new int[5];
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(111, 222);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(333, 444);
		contas[1] = cc2;
		
		ContaCorrente ref = contas[1];
		
		System.out.println("contas[1]: " + contas[1].getNumero());
		System.out.println("cc2:       " + cc2.getNumero());
		System.out.println("ref: 	   " + ref.getNumero());
		
		
		//literal
		int[] refes = {7, 8, 9};
		System.out.println("Literal: " + refes[2]);
		System.out.println("-------------------------------------------------");
		
		//referencias mais genéricas, tipo Object-----------------
		Object[] referencias = new Object[4];
		
		ContaPoupanca cp = new ContaPoupanca(666, 777);
		referencias[0] = cp;
		ContaPoupanca refCast = (ContaPoupanca) referencias[0]; //Type Cast
		
		System.out.println("Type Cast: " + refCast.getAgencia());

	}

}
