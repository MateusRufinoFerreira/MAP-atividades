public class Main {
    public static void main(String[] args) {
        Instituicao universidade = new Instituicao("UFBA");

        Professor professor = new Professor("Dr. Silva", "Segunda-feira, 8h às 12h");
        Disciplina disciplina = new Disciplina("Estruturas de Dados");
        Turma turma = new Turma(disciplina, professor, "ED101");

        Aluno aluno1 = new Aluno("Carlos", "Segunda-feira, 8h às 12h");
        Aluno aluno2 = new Aluno("Ana", "Segunda-feira, 8h às 12h");

        universidade.adicionarTurma(turma);
        universidade.matricularAluno(aluno1, turma);
        universidade.matricularAluno(aluno2, turma);

        universidade.listarDisciplinasDeAluno(aluno1);
        universidade.listarTurmas();
    }
}
