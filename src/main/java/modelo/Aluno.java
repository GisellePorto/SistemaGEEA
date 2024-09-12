package modelo;
import java.time.LocalDate;


public class Aluno extends Usuario {
    private String curso;

    public Aluno() {
        super();
        this.curso = null;
    }

    public Aluno(String nomeCompleto, String cpf, String email, String senha, String curso) {
        super(nomeCompleto, cpf, email, senha);
        this.setCurso(curso);
    }

    public void setCurso(String curso) {
        if(curso != null && !curso.isEmpty()) {
            this.curso = curso;
        }
    }

    public String getCurso() {
        return curso;
    }
}
