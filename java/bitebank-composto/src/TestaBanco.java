
public class TestaBanco {
	public static void main(String[] args) {
		Cliente sergio = new Cliente();
		sergio.nome = "Sergio Carlos Fonseca Junior";
		sergio.cpf = "111.222.333-99";
		sergio.profissao = "Analista de Sistemas";
		
		Conta contaSergiao = new Conta();
		contaSergiao.deposita(130);
		
		//Associa a conta com o cliente
		contaSergiao.titular = sergio;
		//=============================
		
		System.out.println("saldo da conta do sergi�o: " + contaSergiao.pegaSaldo());
		System.out.println("cpf do cliente sergio: " + sergio.cpf);
		System.out.println("mostra nome do cliente atraves do objeto conta: "
				+ contaSergiao.titular.nome);
		System.out.println(contaSergiao.titular);
		System.out.println(sergio);
	}

}
