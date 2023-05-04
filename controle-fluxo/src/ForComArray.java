public class ForComArray {
    public static void main(String[] args) {
        String students[] = {"Ediardo", "Gustavo", "Rafael"};

        // for(int i =1; i<students.length; i++){
        //     System.out.println("O aluno do indice " +i+ " é " +students[i]);
        // }

        for(String student: students){
            System.out.println("Nome do aluno é: " +student);
        }
     }   
}
