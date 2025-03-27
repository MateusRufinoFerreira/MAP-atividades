import org.example.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class ControleAcademicoTest {
    private ControleAcademico controleAcademico;
    private Turma turma;
    private Aluno aluno;

    @Before
    public void setUp() {
        controleAcademico = new ControleAcademico();
        turma = new Turma(new Disciplina("Matemática"), new Professor("Prof. Silva", "Segunda-feira, 10h às 12h"), "MAT101");
        aluno = new Aluno("Carlos", "Segunda-feira, 8h às 12h");
    }

    @Test
    public void testAdicionarTurma() {
        controleAcademico.adicionarTurma(turma);

        List<Turma> turmas = controleAcademico.getTurmas();
        assertEquals(1, turmas.size());
        assertEquals("MAT101", turmas.get(0).getHorario());
    }

    @Test
    public void testMatricularAlunoEmTurma() {
        controleAcademico.adicionarTurma(turma);
        controleAcademico.matricularAlunoEmTurma(aluno, turma);

        assertEquals(1, turma.getAlunos().size());
        assertEquals("Carlos", turma.getAlunos().get(0).getNome());
    }

    @Test
    public void testGetTurmas() {
        controleAcademico.adicionarTurma(turma);

        List<Turma> turmas = controleAcademico.getTurmas();
        assertNotNull(turmas);
        assertEquals(1, turmas.size());
    }
}
