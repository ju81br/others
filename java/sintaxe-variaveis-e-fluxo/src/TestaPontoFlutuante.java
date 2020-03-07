
public class TestaPontoFlutuante {
	public static void main (String[] args) {
		
		double salario;
		salario = 1250.70;
		System.out.println("Salário do pião é: " + salario);
		
		int divisao = 5 / 2;
		System.out.println("Divisão de 5 por 2 com variável do tipo int, deveria dar 2.5: " +
							divisao);
		
		double novaDivisao = 5.0 / 2; // Precisa colocar uma das variáveis com double .0
		System.out.println("Divisão de 5 por 2 agora com variável do tipo double: " +
							novaDivisao);
	}
}
