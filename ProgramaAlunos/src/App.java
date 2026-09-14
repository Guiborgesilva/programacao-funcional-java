import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("Maria", "Engenharia da Computação", 6);
        Aluno a2 = new Aluno("João", "Engenharia de Software", 7.2);
        Aluno a3 = new Aluno("Pedro", "Engenharia de Materiais", 9.4);
        Aluno a4 = new Aluno("Rafael", "Engenharia da Música", 8.9);
        Aluno a5 = new Aluno("Joana", "Engenharia Alimentar", 5.3);
        
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);

        // Passar essa responsabilidade para a class Aluno
        // alunos.forEach(aluno -> System.out.println(aluno.nome + " - " + aluno.curso + ": " + aluno.nota));
        // alunos.forEach(System.out::println);
        alunos.forEach(Aluno::mostrarDados);
        System.out.println("");
        System.out.println("Aprovados:");
        alunos.forEach(Aluno::aprovados);
    }
}
