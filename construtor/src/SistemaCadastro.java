public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa eduardo = new Pessoa();

        eduardo.setEndereco("rua romã");

        System.out.println(eduardo.getEndereco() + eduardo.getCpf() + eduardo.getNome());
    }
}
