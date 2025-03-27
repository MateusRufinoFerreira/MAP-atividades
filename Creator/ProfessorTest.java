import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
//Grupo 9: Mateus Rufino, Alissom e josé Rafael
public class ProfessorTest {

    private Professor professor;
    private Disciplina disciplina;

    @Before
    public void setUp() {
        professor = new Professor("Robson", "Segunda-feira, 9h as 11h");
        disciplina = new Disciplina("Matematica");
        professor.adicionarDisciplina(disciplina);
    }

    @Test
    public void testProfessorDisciplinas() {
        assertTrue(professor.getDisciplinas().contains(disciplina));
    }

    @Test
    public void testProfessorHorario() {
        assertEquals("Segunda-feira, 9h as 11h", professor.getHorario());
    }
}
