import org.example.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TurmaTest {
    private Disciplina disciplina;
    private Professor professor;
    private Turma turma;
    private Aluno aluno1;
    private Aluno aluno2;

    @Before
    public void setup() {
        disciplina = new Disciplina("História");
        professor = new Professor("Dr. Silva", "Quarta, 1h as 15h");
        turma = new Turma(disciplina, professor, "08:00");
        aluno1 = new Aluno("Maria", "08:00");
        aluno2 = new Aluno("José", "08:00");
    }

    @Test
    public void testAdicionarAluno() {
        turma.adicionarAluno(aluno1);
        assertTrue(turma.getAlunos().contains(aluno1));
        assertEquals(1, turma.getNumeroDeAlunos());
        turma.adicionarAluno(aluno1);
        assertEquals(1, turma.getNumeroDeAlunos());
        turma.adicionarAluno(aluno2);
        assertEquals(2, turma.getNumeroDeAlunos());
    }

    @Test
    public void testGetters() {
        assertEquals("08:00", turma.getHorario());
        assertEquals(disciplina, turma.getDisciplina());
        assertEquals(professor, turma.getProfessor());
    }
}
