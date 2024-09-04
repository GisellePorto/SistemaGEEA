package main.java.model;
import java.time.LocalDate;


public class Aluno extends Usuario {
    private String curso;
    private int semestre;

    public Aluno() {
        super();
        this.curso = null;
        this.semestre = 0;
    }

    public Aluno(String nomeCompleto, LocalDate dataNascimento, String cpf, String telefone, String email, String senha, String curso, int semestre) {
        super(nomeCompleto, dataNascimento, cpf, telefone, email, senha);
        this.setCurso(curso);
        this.setSemestre(semestre);
    }

    public void setCurso(String curso) {
        if(curso != null && !curso.isEmpty()) {
            this.curso = curso;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setSemestre(int semestre) {
        if(semestre > 0) {
            this.semestre = semestre;
        }
    }

    public int getSemestre() {
        return semestre;
    }
}
