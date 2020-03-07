public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario sergio = new Funcionario();

		sergio.setNome("Sérgio Carlos Fonseca Junior");
		sergio.setCpf("123456789-00");
		sergio.setSalario(1000);

		System.out.println(sergio.getNome());
		System.out.println(sergio.getBonificacao());

	}

}