package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;


public class TesteArrayUtil {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(12, 123);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(34, 345);
        lista.add(cc2);
        
        Conta ref = (Conta) lista.get(1); //faz o cast na referencia
        
        System.out.println("Tamanho do array: " + lista.size());
        System.out.println("Posi��o do array: " + ref.getAgencia());
        
        lista.remove(0);
        
        System.out.println("Novo tamanho do array depois do remove: " + lista.size());
        
		Conta cc3 = new ContaCorrente(77, 789);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(88, 890);
        lista.add(cc4);
        System.out.println("Outro tamanho do array: " + lista.size());
        
        for (int i = 0; i < lista.size(); i++) {
        	Conta oRef = (Conta)lista.get(i); //explicitando!
        	System.out.println(oRef.getNumero());
        }
        System.out.println("--------------------------------------------------------");

        for(Object o : lista) {
            System.out.println(o);
        }
        
        
        
        
	}

}
