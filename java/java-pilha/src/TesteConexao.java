
public class TesteConexao {
	public static void main(String[] args) {
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch (IllegalStateException ex) {
			System.out.println("Deu pau na conex�o");
		}
		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.fecha();
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu pau na conex�o");
//		}finally {
//			con.fecha();
//		}
	}
}
