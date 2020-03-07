
public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(30);
		System.out.println(conta.saca(100));
		
		// proibido acesso direto
		//conta.saldo = conta.saldo - 35;
		//System.out.println("Saldo da conta: " + conta.saldo);
		
		System.out.println("Saldo através do método: " + conta.pegaSaldo());
	}

}
