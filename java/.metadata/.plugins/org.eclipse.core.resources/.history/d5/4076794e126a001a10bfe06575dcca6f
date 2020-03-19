
public class testaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 123456);
		cc.deposita(1000.0);
		
		ContaPoupanca cp = new ContaPoupanca(111, 111111);
		cp.deposita(2000.0);
		
		cc.transfere(100.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
