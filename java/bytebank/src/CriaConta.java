
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		//Default zero quando constr�i objetos
		System.out.println("Default N�mero: " + primeiraConta.numero);
		System.out.println("Default Agencia: " + primeiraConta.agencia);
		System.out.println("Default Titular: " + primeiraConta.titular);
	}

}
