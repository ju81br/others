
public class TesteSaca {

	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta conta = new ContaCorrente(1234, 5678);
		
		conta.deposita(201.2);
		conta.saca(200.0);
		
		System.out.println("Pega saldo da conta criada: " + conta.getSaldo());
	}

}
