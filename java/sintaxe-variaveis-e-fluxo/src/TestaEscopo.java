
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 18;
		int pessoas = 2;
		//boolean acompanhado = pessoas >= 2;
		boolean acompanhado;
		if (pessoas >= 2) {
			// O escopo da vari�vel, ela nasce quando abre a chave e morre quando fecha
			acompanhado = true;
		}else {
				acompanhado = false;
			}
		
		System.out.println("Valor de acompanhado �: " + acompanhado);
		
		if (idade >= 18 && acompanhado){
			System.out.println("Pode entrar! Voc� tem mais de 18 ou est� acompanhado.");
		}
		else{
			System.out.println("Voc� n�o tem mais de 18 anos ou n�o est� acompanhado,"
							   + "ent�o fuck off!");
			}
	}

}
