package org.example;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class RDM {
    private HashMap<Aluno, ArrayList<Disciplina>> matriculas;

    public RDM() {
        this.matriculas = new HashMap<>();
    }

    public HashMap<Aluno, ArrayList<Disciplina>> registrarMatricula(Aluno aluno, Disciplina disciplina) {
        matriculas.computeIfAbsent(aluno, k -> new ArrayList<>()).add(disciplina);
        return matriculas;
    }

    public List<Disciplina> listarDisciplinasDoAluno(Aluno aluno) {
        ArrayList<Disciplina> disciplinas = matriculas.get(aluno);
        if (disciplinas != null) {
            return disciplinas;
        } else {
            throw new RuntimeException("Nenhuma disciplina encontrada.");
        }
    }

}
