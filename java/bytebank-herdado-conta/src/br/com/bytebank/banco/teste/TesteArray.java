package br.com.bytebank.banco.teste;

public class TesteArray {

	public static void main(String[] args) {
		int [] idades = new int[5];//inicializa posi��es com zero
		
		for (int i = 0; i < idades.length; i++){
			idades[i] = i + 5;
			System.out.println(idades[i]);
		}
		

	}

}
