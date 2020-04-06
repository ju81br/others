package br.com.bytebank.banco.teste;

public class TestaString {

	public static void main(String[] args) {
		
		String nome = "Ser gio"; //object literal
		String outro = new String("Sergio");

		String vazio = " ";
		//String outroVazio = vazio.trim();
		String outroVazio = nome.trim(); 
		System.out.println(outroVazio.isEmpty());
		
		System.out.println(nome.length());
		
		for (int i = 0; i< nome.length(); i++){
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(2);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("gi");
//		System.out.println(pos);
		
//		char c = nome.charAt(4);
//		System.out.println(c);
		
//		char c = 'S';
//		char d = 's';
//		String outra = nome.replace(c, d);
		//String outra = nome.replace("S", "s");
		
//		System.out.println(nome);
//		System.out.println(outra);

	}

}
