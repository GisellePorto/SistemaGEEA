package modelo;

import java.util.ArrayList;

public class Administrador extends Usuario{

    //private String funcao;
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Administrador> administradores = new ArrayList<>();
    private static ArrayList<Professor> professores = new ArrayList<>();
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Reserva> reservas = new ArrayList<>();

    public Administrador() {
        super();
        administradores.add(this);
    }

    public Administrador(String nomeCompleto, String cpf, String email, String senha) {
        super(nomeCompleto, cpf, email, senha);
        administradores.add(this);
    }

    /** public void setFuncao(String funcao) {
        if (funcao != null && !funcao.isEmpty()) {
            this.funcao = funcao;
        }
    }

    public String getFuncao() {
        return funcao;
    }**/

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static Usuario getUsuario(int id){
        for (Usuario aux : usuarios){
            if (aux.getId() == id) {
                return aux;
            }
        } return null;
    }

    public static ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public Administrador getAdministrador (int id){
        for (Administrador aux : administradores){
            if(aux.getId() == id){
                return  aux;
            }
        }
        return null;
    }

    public static ArrayList<Professor> getProfessores() {
        return professores;
    }

    public Professor getProfessor (int id){
        for (Professor aux : professores){
            if (aux.getId() == id){
                return aux;
            }
        }
        return null;
    }
    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno getAluno(int id){
        for (Aluno aux : alunos){
            if (aux.getId() == id){
                return aux;
            }
        }return null;
    }

    public static ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public Reserva getReserva(int id){
        for(Reserva aux : reservas){
            if(aux.getId() == id){
                return aux;
            }
        }return null;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        if (usuario instanceof Professor){
            professores.add((Professor) usuario);
        } else if (usuario instanceof Aluno) {
            alunos.add((Aluno) usuario);
        }else if (usuario instanceof Administrador){
            administradores.add((Administrador) usuario);
        }else return;
    }
 }

