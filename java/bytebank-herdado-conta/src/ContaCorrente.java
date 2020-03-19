
public class ContaCorrente extends Conta {
	public ContaCorrente (int agencia, int numero){
		super (agencia, numero);
		
	}
	
	@Override
	public boolean saca(double valor) {
		double sacarValor = valor + 0.2;
		return super.saca(sacarValor);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

}
