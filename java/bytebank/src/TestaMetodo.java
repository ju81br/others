
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoSergio = new Conta();
		contaDoSergio.saldo = 100;
		contaDoSergio.deposita(50);
		System.out.println("saldo da contaDoSergio: " + contaDoSergio.saldo);
		
		contaDoSergio.saca(30);
		System.out.println("saldo da contaDoSergio depois do saca: " + contaDoSergio.saldo);
		
		Conta contaDoNapoleao = new Conta();
		contaDoNapoleao.saldo = 1000;
		System.out.println("Saldo do Napoleao: " + contaDoNapoleao.saldo);
		
		boolean suscessoTransf = contaDoNapoleao.transfere(60, contaDoSergio);
		if (suscessoTransf){
			System.out.println("deu bom a transferencia");
		} else {
			System.out.println("deu ruim! faltou dinheiro para transferência");
		}
		
		System.out.println("Saldo do Napoleao depois da transf: " + contaDoNapoleao.saldo);
		System.out.println("Saldo do Sergio depois da transf: " + contaDoSergio.saldo);
		
		contaDoSergio.titular = "Sergio Fonseca";
		System.out.println("Titular da conta do Sergio: " + contaDoSergio.titular);
	}
}
