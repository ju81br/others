public class TesteSistema {
public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(1234);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);

        Autenticavel c = new Cliente();
        c.setSenha(9);
        si.autentica(c);

    }

}