public class TesteGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Sérgio Fonseca");
        g1.setCpf("111.222.333-99");
        g1.setSalario(4500.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(666);
        boolean autenticou = g1.autentica(666);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }

}