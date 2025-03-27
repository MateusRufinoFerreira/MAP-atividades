import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
//Grupo 9: Mateus Rufino, Alissom e josé Rafael
public class DisciplinaTest {

    private Disciplina disciplina;
    private Aluno aluno1, aluno2;

    @Before
    public void setUp() {
        disciplina = new Disciplina("Matematica");
        aluno1 = new Aluno("Jose", "Segunda-feira, 9h as 11h");
        aluno2 = new Aluno("Maria", "Segunda-feira, 9h as 11h");
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
    }

    @Test
    public void testNumeroDeAlunosNaDisciplina() {
        assertEquals(2, disciplina.getNumeroDeAlunos());
    }
}
