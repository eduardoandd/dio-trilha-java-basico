public class ResultadoEscolar{

    public static void main(String[] args) {
        int note =4;

        if(note >= 7){
            System.out.println("APROVADO");
        }
        else if(note >= 5 && note <7){
            System.out.println("RECUPERAÇÃO");
        }
        else{
            System.out.println("Reprovado");
        }

        //TERNARIO

        String result = note >=7 ? "APROVADO" : "REPROVADO";
        System.out.println(result);
    }

}