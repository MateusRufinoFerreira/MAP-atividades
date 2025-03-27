import java.util.ArrayList;

public class ControleAcademico {
    private ArrayList<Turma> turmas;

    public ControleAcademico() {
        this.turmas = new ArrayList<>();
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void matricularAlunoEmTurma(Aluno aluno, Turma turma) {
        turma.adicionarAluno(aluno);
    }

}
