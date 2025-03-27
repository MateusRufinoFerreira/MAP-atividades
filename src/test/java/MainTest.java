import org.example.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class MainTest {

    private Instituicao universidade;
    private Aluno aluno1;
    private Aluno aluno2;
    private Turma turma;
    private Disciplina disciplina;
    private Professor professor;

    @Before
    public void setUp() {
        universidade = new Instituicao("UFBA");
        professor = new Professor("Dr. Silva", "Segunda-feira, 8h às 12h");
        disciplina = new Disciplina("Estruturas de Dados");
        turma = new Turma(disciplina, professor, "ED101");
        aluno1 = new Aluno("Carlos", "Segunda-feira, 8h às 12h");
        aluno2 = new Aluno("Ana", "Segunda-feira, 8h às 12h");
    }

    @Test
    public void testAdicionarTurma() {
        universidade.adicionarTurma(turma);
        List<Turma> turmas = universidade.listarTurmas();
        assertEquals(1, turmas.size());
        assertEquals("ED101", turmas.get(0).getHorario());
    }

    @Test
    public void testMatricularAluno() {
        universidade.adicionarTurma(turma);
        universidade.matricularAluno(aluno1, turma);
        universidade.matricularAluno(aluno2, turma);

        assertEquals(2, turma.getAlunos().size());
    }

    @Test
    public void testListarDisciplinasDeAluno() {
        universidade.adicionarTurma(turma);
        universidade.matricularAluno(aluno1, turma);

        universidade.listarDisciplinasDeAluno(aluno1);
    }
}
