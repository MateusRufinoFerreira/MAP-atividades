import org.example.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

//Grupo 9: Mateus Rufino, Alissom e josé Rafael
public class ProfessorTest {
    private Professor professor;
    private Disciplina disciplina1;
    private Disciplina disciplina2;

    @Before
    public void setUp() {
        professor = new Professor("Dr. Silva", "Segunda-feira, 10h às 12h");
        disciplina1 = new Disciplina("Estruturas de Dados");
        disciplina2 = new Disciplina("Algoritmos");
    }

    @Test
    public void testProfessorNome() {
        assertEquals("Dr. Silva", professor.getNome());
    }

    @Test
    public void testProfessorHorario() {
        assertEquals("Segunda-feira, 10h às 12h", professor.getHorario());
    }

    @Test
    public void testAdicionarDisciplina() {
        professor.adicionarDisciplina(disciplina1);
        List<Disciplina> disciplinas = professor.getDisciplinas();
        assertEquals(1, disciplinas.size());
        assertEquals("Estruturas de Dados", disciplinas.get(0).getNome());

        professor.adicionarDisciplina(disciplina2);
        disciplinas = professor.getDisciplinas();
        assertEquals(2, disciplinas.size());
        assertEquals("Algoritmos", disciplinas.get(1).getNome());
    }

    @Test
    public void testGetDisciplinas() {
        professor.adicionarDisciplina(disciplina1);
        professor.adicionarDisciplina(disciplina2);

        List<Disciplina> disciplinas = professor.getDisciplinas();
        assertNotNull(disciplinas);
        assertEquals(2, disciplinas.size());
        assertTrue(disciplinas.contains(disciplina1));
        assertTrue(disciplinas.contains(disciplina2));
    }
}
