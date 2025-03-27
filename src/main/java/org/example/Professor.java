package org.example;

import java.util.*;

public class Professor {
    private String nome;
    private String horario;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getHorario() {
        return horario;
    }
}
