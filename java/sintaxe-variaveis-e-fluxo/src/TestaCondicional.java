
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 10;
		int pessoas = 2;
		
		if (idade >= 18){
			System.out.println("Voc� tem mais de 18 anos!");
		}
		else{
			if (pessoas > 1){
				System.out.println("Voc� n�o tem mais de 18 anos mas est� acompanhado,"
						+ "ent�o beleza!");
			}
			System.out.println("Voc� ainda n�o possui 18 anos rap�!");
		}
	}

}
