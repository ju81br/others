
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 18;
		int pessoas = 2;
		boolean acompanhado = pessoas >= 2;
		
		if (idade >= 18 && acompanhado){
			System.out.println("Pode entrar! Voc� tem mais de 18 ou est� acompanhado.");
		}
		else{
			System.out.println("Voc� n�o tem mais de 18 anos ou n�o est� acompanhado,"
							   + "ent�o fuck off!");
			}
	}

}
