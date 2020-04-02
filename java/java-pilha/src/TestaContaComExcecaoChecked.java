
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta c = new Conta();
		try {
			c.getSaca();
		}catch(MinhaExcecao ex){
			System.out.println("tratamento bla bla bla");
		}

	}

}
