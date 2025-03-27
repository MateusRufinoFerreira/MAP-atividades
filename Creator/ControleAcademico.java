import java.util.ArrayList;
import java.util.List;

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
    public List<Turma> getTurmas() {
        return new ArrayList<>(turmas); 
        }

}
