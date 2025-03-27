import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ControleAcademicoTest {
    private ControleAcademico controle;
    private Turma turma;
    private Aluno aluno;

    @Before
    public void setUp() {
        controle = new ControleAcademico();
        Disciplina disciplina = new Disciplina("Algoritmos");
        Professor professor = new Professor("João", "Segunda-feira, 9h às 11h");
        turma = new Turma(disciplina, professor, "Segunda-feira, 9h às 11h");
        aluno = new Aluno("Lucas", "Manhã");
    }

    @Test
    public void testAdicionarTurma() {
        controle.adicionarTurma(turma);
        assertTrue(controle.getTurmas().contains(turma));
    }

    @Test
    public void testMatricularAlunoEmTurma() {
        controle.matricularAlunoEmTurma(aluno, turma);
        assertTrue(turma.getAlunos().contains(aluno));
    }
}
