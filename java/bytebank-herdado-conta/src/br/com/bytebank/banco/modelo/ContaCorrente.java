package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta {
	public ContaCorrente (int agencia, int numero){
		super (agencia, numero);
		
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double sacarValor = valor + 0.2;
		super.saca(sacarValor);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

}
