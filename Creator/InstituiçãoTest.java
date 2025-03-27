import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class InstituicaoTest {
    private Instituicao instituicao;
    private Aluno aluno;
    private Turma turma;
    private Disciplina disciplina;
    private Professor professor;

    @Before
    public void setUp() {
        instituicao = new Instituicao("UEPB");
        professor = new Professor("Dr. Silva", "Segunda-feira, 10h às 12h");
        disciplina = new Disciplina("MAP");
        turma = new Turma(disciplina, professor, "MAT101");
        aluno = new Aluno("Carlos", "Segunda-feira, 8h às 12h");
    }

    @Test
    public void testAdicionarTurma() {
        instituicao.adicionarTurma(turma);

        List<Turma> turmas = instituicao.listarTurmas();
        assertEquals(1, turmas.size());
        assertEquals("MAT101", turmas.get(0).getHorario());
    }

    @Test
    public void testMatricularAluno() {
        instituicao.adicionarTurma(turma);
        instituicao.matricularAluno(aluno, turma);

        assertEquals(1, turma.getAlunos().size());
        assertEquals("Carlos", turma.getAlunos().get(0).getNome());
    }

    @Test
    public void testListarDisciplinasDeAluno() {
        instituicao.adicionarTurma(turma);
        instituicao.matricularAluno(aluno, turma);

        instituicao.listarDisciplinasDeAluno(aluno);
    }

    @Test
    public void testListarTurmas() {
        instituicao.adicionarTurma(turma);

        List<Turma> turmas = instituicao.listarTurmas();
        assertNotNull(turmas);
        assertEquals(1, turmas.size());
    }
}
