
public class ContaCorrente extends Conta {
	public ContaCorrente (int agencia, int numero){
		super (agencia, numero);
		
	}
	
	@Override
	public void saca(double valor) {
		double sacarValor = valor + 0.2;
		super.saca(sacarValor);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

}
