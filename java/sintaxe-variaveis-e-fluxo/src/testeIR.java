public class testeIR {

    public static void main(String[] args) {

        double salario = 3300.0;
        double salarioAno = salario * 12;
        
        System.out.println("Sal�rio mensal: " + salario);
        System.out.println("Sal�rio anual: " + salarioAno);
        
        if (1900.0 < salario && salario < 2800.0){
        	System.out.println("Primeira faixa. Dedu��o de 7,5%");
        }
        else if (2801.0 < salario && salario < 3751.0){
        	System.out.println("Segunda faixa. Dedu��o de 15%");
        }
        else if (3751.0 < salario && salario < 4664.0){
        	System.out.println("Terceira faixa. Dedu��o de 22,5%");
        }
        else {
        	System.out.println("Sal�rio anual n�o est� em nenhuma das 3 faixas");
        }
    }
}