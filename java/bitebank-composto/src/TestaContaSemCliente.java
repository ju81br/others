
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaBraddock = new Conta();
		System.out.println("saldo do Braddock: " + contaBraddock.pegaSaldo());
		
		contaBraddock.titular = new Cliente();
		System.out.println("titular da conta Braddock: " + contaBraddock.titular);
		
		contaBraddock.titular.nome = "Chuck N�ia � Braddock!";
		System.out.println("nome do titular da conta Braddock sem criar cliente: " + contaBraddock.titular.nome);
	}

}