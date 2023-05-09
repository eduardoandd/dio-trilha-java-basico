package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno eduardo = new Aluno();
        eduardo.setName("eduardo");
        eduardo.setAge(21);

        System.out.println("O aluno " +eduardo.getname()+ " tem " +eduardo.getAge()+ " anos");
    }
}
