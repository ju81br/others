public class TesteReferencias {
	public static void main(String[] args) {
		Gerente ger = new Gerente();
		ger.setNome("Sergião Berranteiro");
		ger.setSalario(10000.0);
		
		Funcionario fun = new Funcionario();
		fun.setSalario(2000.0);
		
		Motorista mot = new Motorista();
		mot.setSalario(3000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(ger);
		controle.registra(fun);
		controle.registra(mot);
		
		System.out.println(controle.getSoma());
		System.out.println("------------------------------------");
		
		Funcionario fun2 = new Motorista();
		fun2.setSalario(2000.0);
		ControleBonificacao controle2 = new ControleBonificacao();
		controle2.registra(fun2);
		System.out.println(controle2.getSoma());
		
	}

}
