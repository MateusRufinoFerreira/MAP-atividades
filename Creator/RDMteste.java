import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class RDMteste {
    private RDM rdm;
    private Aluno aluno;
    private Disciplina disciplina;

    @Before
    public void setUp() {
        rdm = new RDM();
        aluno = new Aluno("Carlos", "Manhã");
        disciplina = new Disciplina("POO");
        rdm.registrarMatricula(aluno, disciplina);
    }

    @Test
    public void testRegistroMatricula() {
        assertTrue(rdm.listarDisciplinasDoAluno(aluno).contains(disciplina));
    }

    @Test
    public void testListarDisciplinasDoAluno() {
        
    	ArrayList<Disciplina> disciplinasAluno = rdm.listarDisciplinasDoAluno(aluno);
        assertEquals(1, disciplinasAluno.size());
        assertTrue(disciplinasAluno.contains(disciplina));
    }
}
