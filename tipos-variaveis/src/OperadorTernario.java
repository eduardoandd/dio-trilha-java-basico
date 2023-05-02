public class OperadorTernario {
    public static void main(String[] args) throws Exception {

        //<EXPRESSÃO CONDICIONAL> ? <CASO SEJA TRUE> : <CONDIÇÃO FALSA>

        int a,b;
        a=5;
        b=6;
        String resultado = "";

        //IF NORMAL
        if(a == b){
            resultado = "Verdadeiro";
        }
        else{
            resultado = "false";
        }

        System.out.println(resultado);

        //TERNÁRIO
        String resultadoTernario= a!=b? "Verdadeiro" : "falso";
        System.out.println(resultadoTernario);

    }
}
