
public class Multiplos3 {
	public static void main(String[] args) {
		//Imprime os múltiplos de 3 entre 0 e 100
		int numero = 1;
		int resultado;
		while (numero <= 100){
			resultado = numero%3;
			if (resultado == 0){
				System.out.println(numero);
			}
			numero++;
		}
		
	}

}
