import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Aluno> adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        return alunos;
    }

    public int getNumeroDeAlunos() {
        return alunos.size();
    }
    public ArrayList<Aluno> listarAlunos() {
        System.out.println("Alunos da disciplina " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
        return alunos;
    }

        public int listarNumeroDeAlunos() {
        System.out.println("Número de alunos na disciplina " + nome + ": " + getNumeroDeAlunos());
        return getNumeroDeAlunos();
        }
}

