public enum EstadoBrasileiro {

    SAO_PAULO ("São Paulo", "SP",10),
    RIO_JANEIRO ("Rio de Janeiro", "RJ",16),
    RIO_GRANDE_SUL ("Rio grande do sul", "RS",7);

    private String nome;
    private String sigla;
    private int codIBGE;

    private EstadoBrasileiro(String nome,String sigla, int codIBGE ) {
        this.nome = nome;
        this.sigla = sigla;
        this.codIBGE = codIBGE;
    }

    public int getCodIBGE() {
        return codIBGE;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeUpperCase() {
        return nome.toUpperCase();
    }

    

}
