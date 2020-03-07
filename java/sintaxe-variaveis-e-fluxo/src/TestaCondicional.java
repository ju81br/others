
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 10;
		int pessoas = 2;
		
		if (idade >= 18){
			System.out.println("Você tem mais de 18 anos!");
		}
		else{
			if (pessoas > 1){
				System.out.println("Você não tem mais de 18 anos mas está acompanhado,"
						+ "então beleza!");
			}
			System.out.println("Você ainda não possui 18 anos rapá!");
		}
	}

}
