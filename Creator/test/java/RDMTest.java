import  org.example.*;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class RDMTest {

    @Test
    public void testRegistrarMatricula() {
        RDM sistemaMatricula = new RDM();
        Aluno aluno = new Aluno("João", "8:00");
        Disciplina disciplina = new Disciplina("Matemática");

        // Registrar matrícula
        sistemaMatricula.registrarMatricula(aluno, disciplina);

        // Verificar se a matrícula foi registrada corretamente
        List<Disciplina> disciplinas = sistemaMatricula.listarDisciplinasDoAluno(aluno);
        assertEquals(1, disciplinas.size()); // O aluno deve estar matriculado em 1 disciplina
        assertTrue(disciplinas.contains(disciplina)); // A disciplina deve estar na lista de disciplinas
    }

    @Test
    public void testRegistrarMatriculaMultipla() {
        RDM sistemaMatricula = new RDM();
        Aluno aluno = new Aluno("Maria", "8:00");
        Disciplina disciplina1 = new Disciplina("Física");
        Disciplina disciplina2 = new Disciplina("Química");

        // Registrar múltiplas matrículas
        sistemaMatricula.registrarMatricula(aluno, disciplina1);
        sistemaMatricula.registrarMatricula(aluno, disciplina2);

        // Verificar se as duas disciplinas foram registradas
        List<Disciplina> disciplinas = sistemaMatricula.listarDisciplinasDoAluno(aluno);
        assertEquals(2, disciplinas.size()); // O aluno deve estar matriculado em 2 disciplinas
        assertTrue(disciplinas.contains(disciplina1)); // A primeira disciplina deve estar na lista
        assertTrue(disciplinas.contains(disciplina2)); // A segunda disciplina deve estar na lista
    }

    @Test
    public void testListarDisciplinasDoAlunoSemMatricula() {
        RDM sistemaMatricula = new RDM();
        Aluno aluno = new Aluno("Carlos", "8:00");

        try {
            // Tentativa de listar disciplinas para um aluno sem matrícula
            sistemaMatricula.listarDisciplinasDoAluno(aluno);
            fail("Deveria ter lançado uma exceção");
        } catch (RuntimeException e) {
            // Verifica se a exceção foi lançada corretamente
            assertEquals("Nenhuma disciplina encontrada.", e.getMessage());
        }
    }

    @Test
    public void testListarDisciplinasDoAluno() {
        RDM sistemaMatricula = new RDM();
        Aluno aluno = new Aluno("Lucia", "8:00");
        Disciplina disciplina = new Disciplina("Biologia");

        // Registrar a matrícula
        sistemaMatricula.registrarMatricula(aluno, disciplina);

        // Listar as disciplinas do aluno
        List<Disciplina> disciplinas = sistemaMatricula.listarDisciplinasDoAluno(aluno);
        assertEquals(1, disciplinas.size()); // O aluno deve estar matriculado em 1 disciplina
        assertTrue(disciplinas.contains(disciplina)); // A disciplina deve estar na lista de disciplinas
    }
}
