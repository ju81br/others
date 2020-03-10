
public class Motorista extends Funcionario {
	public double getBonificacao() {
		System.out.println("Chamou bonificação do Motorista!");
		return super.getBonificacao() + 1;
	}

}
