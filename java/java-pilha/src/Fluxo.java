public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
        	metodo1();
        }catch(ArithmeticException | NullPointerException ex){
        	String msg = ex.getMessage();
        	System.out.println("Mostra Exception: " + msg);
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        //for(int i = 1; i <= 3; i++) {
        //    System.out.println(i);
            //int a = i / 0;
        //    Conta c = null;
        //    c.getSaca();
        //}
        throw new ArithmeticException("algo deu errado");
        //System.out.println("Fim do metodo2");
    }
}