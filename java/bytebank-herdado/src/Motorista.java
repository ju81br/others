
public class Motorista extends Funcionario {
	public double getBonificacao() {
		System.out.println("Chamou bonifica��o do Motorista!");
		return super.getBonificacao() + 1;
	}

}
