import org.example.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DisciplinaTest {
    private Disciplina disciplina;
    private Aluno aluno1;
    private Aluno aluno2;

    @Before
    public void setUp() {
        disciplina = new Disciplina("Matemática");
        aluno1 = new Aluno("Carlos", "Segunda-feira, 8h às 12h");
        aluno2 = new Aluno("Ana", "Segunda-feira, 8h às 12h");
    }

    @Test
    public void testGetNome() {
        assertEquals("Matemática", disciplina.getNome());
    }

    @Test
    public void testAdicionarAluno() {
        disciplina.adicionarAluno(aluno1);

        assertEquals(1, disciplina.getNumeroDeAlunos());
        assertTrue(disciplina.listarAlunos().contains(aluno1));
    }

    @Test
    public void testGetNumeroDeAlunos() {
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);

        assertEquals(2, disciplina.getNumeroDeAlunos());
    }

    @Test
    public void testListarAlunos() {
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);

        ArrayList<Aluno> alunos = disciplina.listarAlunos();
        assertEquals(2, alunos.size());
        assertTrue(alunos.contains(aluno1));
        assertTrue(alunos.contains(aluno2));
    }

    @Test
    public void testListarNumeroDeAlunos() {
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);

        assertEquals(2, disciplina.listarNumeroDeAlunos());
    }
}
