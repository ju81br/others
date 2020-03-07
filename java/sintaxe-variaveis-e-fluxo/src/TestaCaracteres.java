
public class TestaCaracteres {
	public static void main (String[] args){
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "Sergio Fonseca ";
		System.out.println(palavra);
		
		//Concatenando string com número... converte num para string
		palavra = palavra + 1900;
		System.out.println(palavra);
	}

}
