import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class MainTest {

    private Instituicao universidade;
    private Aluno aluno1;
    private Aluno aluno2;
    private Disciplina disciplina;

    @Before
    public void setUp() {
        aluno1 = new Aluno("Carlos", "Segunda-feira, 8h às 12h");
        aluno2 = new Aluno("Ana", "Segunda-feira, 8h às 12h");
        disciplina = new Disciplina("Estruturas de Dados");
    }

    @Test
    public void testMatriculas() {
        List<Disciplina> disciplinasAluno1 = universidade.listarDisciplinasDeAluno(aluno1);
        List<Disciplina> disciplinasAluno2 = universidade.listarDisciplinasDeAluno(aluno2);

        assertEquals(1, disciplinasAluno1.size());
        assertTrue(disciplinasAluno1.contains(disciplina));

        assertEquals(1, disciplinasAluno2.size());
        assertTrue(disciplinasAluno2.contains(disciplina));
    }

    @Test
    public void testListarTurmas() {
        
        List<Turma> turmas = universidade.listarTurmas();

        assertNotNull(turmas);
        assertEquals(1, turmas.size());
        assertNotNull(turmas.get(0));
    }
}
