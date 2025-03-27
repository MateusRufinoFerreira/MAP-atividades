import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private String horario;
    private List<Aluno> alunosNaTurma;

    public Turma(Disciplina disciplina, Professor professor, String horario) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.horario = horario;
        this.alunosNaTurma = new ArrayList<>();
        professor.adicionarDisciplina(disciplina);
    }

    public List<Aluno> adicionarAluno(Aluno aluno) {
        if (!alunosNaTurma.contains(aluno)) {
            alunosNaTurma.add(aluno);
            aluno.adicionarDisciplina(disciplina);
        }
        return alunosNaTurma;
    }

    public String getHorario() {
        return horario;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunosNaTurma;
    }

    public int getNumeroDeAlunos() {
        return alunosNaTurma.size();
    }
}
