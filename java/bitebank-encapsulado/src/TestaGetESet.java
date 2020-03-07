
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(666);
		System.out.println("Número da conta: " + conta.getNumero());
		
		conta.setAgencia(42);
		System.out.println("Agencia: " + conta.getAgencia());
		
		Cliente sergio = new Cliente();
		sergio.setNome("Sérgio Fonseca");
		System.out.println("--------------------------------------------------");
		System.out.println("nome da classe criada cliente: " + sergio.getNome());
		
		conta.setTitular(sergio);
		System.out.println("Nome do titular da Conta: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Analista de Sistemas");
		conta.getTitular().setCpf("777.888.999-22");
		
		System.out.println("Mostra atributos do titular pegando como referencia a conta: ");
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getProfissao());
	}
	

}
