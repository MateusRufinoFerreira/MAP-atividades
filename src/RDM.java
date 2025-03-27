import java.util.HashMap;
import java.util.ArrayList;

public class RDM {
    private HashMap<Aluno, ArrayList<Disciplina>> matriculas;

    public RDM() {
        this.matriculas = new HashMap<>();
    }

    public HashMap<Aluno, ArrayList<Disciplina>> registrarMatricula(Aluno aluno, Disciplina disciplina) {
        matriculas.computeIfAbsent(aluno, k -> new ArrayList<>()).add(disciplina);
        return matriculas;
    }

    public void listarDisciplinasDoAluno(Aluno aluno) {
        System.out.println("Disciplinas do aluno " + aluno.getNome() + ":");
        ArrayList<Disciplina> disciplinas = matriculas.get(aluno);
        if (disciplinas != null) {
            for (Disciplina d : disciplinas) {
                System.out.println(d.getNome());
            }
        } else {
            System.out.println("Nenhuma disciplina encontrada.");
        }
    }
}
