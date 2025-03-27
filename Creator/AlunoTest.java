import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
	//Grupo 9: Mateus Rufino, Alissom e josé Rafael
public class AlunoTest {

    private Aluno aluno;
    private Disciplina disciplina;

    @Before
    public void setUp() {
        aluno = new Aluno("Mateus", "Quarta, 1h as 15h");
        disciplina = new Disciplina("TAAL");
        aluno.adicionarDisciplina(disciplina);
    }

    @Test
    public void testAlunoDisciplinas() {
        assertTrue(aluno.getDisciplinas().contains(disciplina));
    }

    @Test
    public void testAlunoHorario() {
        assertEquals("Quarta, 1h as 15h", aluno.getHorario());
    }
}
