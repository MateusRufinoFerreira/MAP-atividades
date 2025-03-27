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
        assertTrue(rdm.registrarMatricula(aluno, disciplina).containsKey(aluno));
        assertTrue(rdm.registrarMatricula(aluno, disciplina).get(aluno).contains(disciplina));
    }
}
