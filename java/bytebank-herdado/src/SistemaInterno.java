public class SistemaInterno {
    private int senha = 1111;

    public void autentica(Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);

        if (autenticou) {
            System.out.println("Deu bom, pode entrar no sistema");
        } else {
            System.out.println("Deu ruim, acesso negado");
        }
    }
}