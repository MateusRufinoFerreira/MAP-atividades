package org.example;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Disciplina> disciplinas;
    private String horario;

    public Aluno(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getHorario() {
        return horario;
    }

    public ArrayList<Disciplina> listarDisciplinas() {
        System.out.println("Disciplinas do aluno " + nome + ":");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
		return disciplinas;
    }

    public String listarHorario() {
        System.out.println("Horário do aluno " + nome + ": " + horario);
		return horario;
    }
}