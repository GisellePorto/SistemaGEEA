package main.java.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Administrador extends Usuario{

    private String funcao;
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Administrador> administradores = new ArrayList<>();
    private static ArrayList<Professor> professores = new ArrayList<>();
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    private static ArrayList<Espaco> espacos = new ArrayList<>();
    private static ArrayList<Equipamento> equipamentos = new ArrayList<>();

    public Administrador() {
        super();
        this.funcao = null;
        administradores.add(this);
    }

    public Administrador(String nomeCompleto, LocalDate dataNascimento, String cpf, String telefone, String email, String senha, String funcao) {
        super(nomeCompleto, dataNascimento, cpf, telefone, email, senha);
        setFuncao(funcao);
        administradores.add(this);
    }

    public void setFuncao(String funcao) {
        if (funcao != null && !funcao.isEmpty()) {
            this.funcao = funcao;
        }
    }

    public String getFuncao() {
        return funcao;
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public static ArrayList<Professor> getProfessores() {
        return professores;
    }

    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public static ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public static ArrayList<Espaco> getEspacos() {
        return espacos;
    }

    public static ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public static void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}

