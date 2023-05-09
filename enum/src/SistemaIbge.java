public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getNome() + " " +e.getSigla());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.RIO_GRANDE_SUL;

        System.out.println(eb.getNome());
        System.out.println(eb.getNomeUpperCase());
        System.out.println(eb.getCodIBGE());
    }
}
