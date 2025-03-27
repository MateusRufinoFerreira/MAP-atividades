import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TurmaTeste {

    private Turma turma;
    private Disciplina disciplina;
    private Professor professor;
    private Aluno aluno1, aluno2;

    @Before
    public void setUp() {
        disciplina = new Disciplina("Matemática");
        Professor professor = new Professor("Sabrina", "08:00 - 12:00");
        turma = new Turma(disciplina, professor, "Segunda-feira, 10h às 12h");

        Aluno aluno1 = new Aluno("Rafael", "Manhã");
        Aluno aluno2 = new Aluno("Mateus", "Manhã");

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
    }

    @Test
    public void testNumeroDeAlunosNaTurma() {
        assertEquals(2, turma.getNumeroDeAlunos());
    }

    @Test
    public void testDisciplinaDaTurma() {
        assertEquals("Matemática", turma.getDisciplina().getNome());
    }

    @Test
    public void testProfessorDaTurma() {
        assertEquals("Sabrina", turma.getProfessor().getNome());
    }

    @Test
    public void testHorarioDaTurma() {
        assertEquals("Segunda-feira, 10h às 12h", turma.getHorario());
    }

    @Test
    public void testAdicionarAlunoNaTurma() {
        Aluno aluno3 = new Aluno("Beatriz","Noite");
        turma.adicionarAluno(aluno3);
        assertEquals(3, turma.getNumeroDeAlunos());
    }
}
