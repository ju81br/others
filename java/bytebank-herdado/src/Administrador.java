public class Administrador extends Funcionario implements Autenticavel {
    private AutenticaUtil autenticador;

    public Administrador (){
        this.autenticador = new AutenticaUtil();
    }

    @Override
    public double getBonificacao() {
        // TODO Auto-generated method stub
        return super.getBonificacao();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
}