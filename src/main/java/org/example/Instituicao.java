package org.example;

import java.util.List;

public class Instituicao {
    private String nome;
    private ControleAcademico controleAcademico;
    private RDM rdm;

    public Instituicao(String nome) {
        this.nome = nome;
        this.controleAcademico = new ControleAcademico();
        this.rdm = new RDM();
    }

    public void adicionarTurma(Turma turma) {
        controleAcademico.adicionarTurma(turma);
    }

    public void matricularAluno(Aluno aluno, Turma turma) {
        controleAcademico.matricularAlunoEmTurma(aluno, turma);
        rdm.registrarMatricula(aluno, turma.getDisciplina());
    }

    public void listarDisciplinasDeAluno(Aluno aluno) {
        rdm.listarDisciplinasDoAluno(aluno);
    }
    public List<Turma> listarTurmas() {
        return controleAcademico.getTurmas();
    }

}
