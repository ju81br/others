
public class TesteReferencias {
	    public static void main(String [] args) { 
	        Conta primeiraConta = new Conta();
	        primeiraConta.saldo = 300;

	        System.out.println("saldo da primeira: " + primeiraConta.saldo);
	        
	        Conta segundaConta = primeiraConta;
	        
	        System.out.println("saldo da segunda conta referenciada com a prim: " + segundaConta.saldo);
	        
	        if (primeiraConta == segundaConta) {
	        	System.out.println("s�o iguais... a referencia!");
	        }
	        
	        System.out.println("ref da primeira: " + primeiraConta);
	        System.out.println("ref da segunda:  " + segundaConta);
	    }
}
