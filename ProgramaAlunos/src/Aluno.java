public class Aluno {
    String nome;
    String curso;
    double nota;

    public Aluno(String nome, String curso, double nota){
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    // Passando a responsabilidade de imprimir os dados
    
    // public String toString() {
    //     return nome + " - " + curso + ": " + nota;
    // }

    public void mostrarDados() {
        System.out.println( nome + " - " + curso + ": " + nota);
        
    }

    public void aprovados() {
        if(nota >= 6) {
            System.out.println(nome);
        }
    }
}
