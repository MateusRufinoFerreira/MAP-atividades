import org.example.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AlunoTest {
    private Aluno aluno;

    @Before
    public void setUp() {
        aluno = new Aluno("Carlos", "Segunda-feira, 8h às 12h");
    }

    @Test
    public void testGetNome() {
        assertEquals("Carlos", aluno.getNome());
    }

    @Test
    public void testGetHorario() {
        assertEquals("Segunda-feira, 8h às 12h", aluno.getHorario());
    }

    @Test
    public void testAdicionarDisciplina() {
        Disciplina disciplina = new Disciplina("Matemática");
        aluno.adicionarDisciplina(disciplina);

        assertEquals(1, aluno.getDisciplinas().size());
        assertEquals("Matemática", aluno.getDisciplinas().get(0).getNome());
    }

    @Test
    public void testGetDisciplinas() {
        Disciplina d1 = new Disciplina("Física");
        Disciplina d2 = new Disciplina("Química");

        aluno.adicionarDisciplina(d1);
        aluno.adicionarDisciplina(d2);

        ArrayList<Disciplina> disciplinas = aluno.getDisciplinas();
        assertEquals(2, disciplinas.size());
        assertEquals("Física", disciplinas.get(0).getNome());
        assertEquals("Química", disciplinas.get(1).getNome());
    }

    @Test
    public void testListarDisciplinas() {
        Disciplina d1 = new Disciplina("História");
        aluno.adicionarDisciplina(d1);

        ArrayList<Disciplina> disciplinas = aluno.listarDisciplinas();
        assertEquals(1, disciplinas.size());
        assertEquals("História", disciplinas.get(0).getNome());
    }

    @Test
    public void testListarHorario() {
        assertEquals("Segunda-feira, 8h às 12h", aluno.listarHorario());
    }
}
