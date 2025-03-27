import java.util.ArrayList;

public class RDM {
    private ArrayList<Aluno> alunos;
    
    private ArrayList<ArrayList<Disciplina>> disciplinas;

    public RDM() {
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    
    public void registrarMatricula(Aluno aluno, Disciplina disciplina) {
        
    	int index = alunos.indexOf(aluno);
        
        if (index == -1) {
            
        	alunos.add(aluno);
            ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();
            listaDisciplinas.add(disciplina);
            disciplinas.add(listaDisciplinas);
        } else {
            
        	disciplinas.get(index).add(disciplina);
        }
    }

    
    public ArrayList<Disciplina> listarDisciplinasDoAluno(Aluno aluno) {
        int index = alunos.indexOf(aluno);
        if (index != -1) {
            return disciplinas.get(index);
        } else {
            return new ArrayList<>(); 
            }
    }
}
