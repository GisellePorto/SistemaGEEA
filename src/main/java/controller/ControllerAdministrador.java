package controller;
import modelo.*;

import java.util.ArrayList;
import java.time.LocalDate;

    public class ControllerAdministrador {
        //private Administrador administrador;
        private ArrayList<Administrador> administradores;
        private ArrayList<Professor> professores;
        private ArrayList<Aluno> alunos;
        private ArrayList<Reserva> reservas;
        private ArrayList<Espaco> espacos;
        private ArrayList<Equipamento> equipamentos;

        public ControllerAdministrador(Administrador administrador) {
            //this.administrador = administrador;
            this.administradores = Administrador.getAdministradores();
            this.alunos = Administrador.getAlunos();
            this.professores = Administrador.getProfessores();
            this.reservas = Administrador.getReservas();
//            this.espacos = Administrador.getEspacos();
//            this.equipamentos = Administrador.getEquipamentos();
        }

        public Administrador adicionarAdministrador(String nomeCompleto, String cpf, String email, String senha) {
            Administrador administrador = new Administrador(nomeCompleto, cpf, email, senha);
            administradores.add(administrador);
            return administrador;
        }

        public void removerAdministrador(int idAdministrador) {
            administradores.removeIf(administrador -> administrador.getId() == idAdministrador);
        }

        public boolean solicitarEdicaoAdministrador(int idAdministrador) {
            for (Administrador administrador : administradores) {
                if (administrador.getId() == idAdministrador) {
                    return true;
                }
            }
            return false;
        }

        public void editarAdministrador(int idAdministrador, String nomeCompleto, LocalDate dataNascimento, String cpf, String telefone, String email, String senha, String funcao) {
            for (Administrador administrador : administradores) {
                if (administrador.getId() == idAdministrador) {
                    administrador.setNomeCompleto(nomeCompleto);
                    administrador.setCpf(cpf);
                    administrador.setEmail(email);
                    administrador.setSenha(senha);
                    break;
                }
            }
        }

        public Professor adicionarProfessor(String nomeCompleto, String cpf,  String email, String senha, String formacao) {
            Professor professor = new Professor(nomeCompleto, cpf, email, senha, formacao);
            professores.add(professor);
            return professor;
        }

        public void removerProfessor(int idProfessor) {
            professores.removeIf(professor -> professor.getId() == idProfessor);
        }

        public boolean solicitarEdicaoProfessor(int idProfessor) {
            for (Professor professor : professores) {
                if (professor.getId() == idProfessor) {
                    return true;
                }
            }
            return false;
        }

        public void editarProfessor(int idProfessor, String nomeCompleto, LocalDate dataNascimento, String cpf, String telefone, String email, String senha, String formacao) {
            for (Professor professor : professores) {
                if (professor.getId() == idProfessor) {
                    professor.setNomeCompleto(nomeCompleto);
                    professor.setCpf(cpf);
                    professor.setEmail(email);
                    professor.setFormacao(formacao);
                    professor.setSenha(senha);
                    break;
                }
            }
        }

        public Aluno adicionarAluno(String nomeCompleto, LocalDate dataNascimento, String cpf, String telefone, String email, String senha, String curso, int semestre) {
            Aluno aluno = new Aluno(nomeCompleto, cpf, email, senha, curso);
            return aluno;
        }

        public void removerAluno(int idAluno) {
            alunos.removeIf(aluno -> aluno.getId() == idAluno);
        }

        public boolean solicitarEdicaoAluno(int idAluno) {
            for (Aluno aluno : alunos) {
                if (aluno.getId() == idAluno) {
                    return true;
                }
            }
            return false;
        }

        public void editarAluno(int idAluno, String nomeCompleto, LocalDate dataNascimento, String cpf, String telefone, String email, String senha, String curso, int semestre) {
            for (Aluno aluno : alunos) {
                if (aluno.getId() == idAluno) {
                    aluno.setNomeCompleto(nomeCompleto);
                    aluno.setCpf(cpf);
                    aluno.setEmail(email);
                    aluno.setCurso(curso);
                    aluno.setSenha(senha);
                    break;
                }
            }
        }

        public Espaco adicionarEspaco(String descricao, int quantidade, boolean status, LocalDate dataDisponivel, String observacoes, int capacidade, boolean reforma) {
            Espaco espaco = new Espaco(descricao, quantidade, status, dataDisponivel, observacoes, capacidade, reforma);
            espacos.add(espaco);
            return espaco;
        }

        public void removerEspaco(int idEspaco) {
            espacos.removeIf(espaco -> espaco.getId() == idEspaco);
        }

        public boolean solicitarEdicaoEspaco(int idEspaco) {
            for (Espaco espaco : espacos) {
                if (espaco.getId() == idEspaco) {
                    return true;
                }
            }
            return false;
        }

        public void editarEspaco(int idEspaco, String descricao, int quantidade, boolean status, LocalDate dataDisponivel, String observacoes, int capacidade, boolean reforma) {
            for (Espaco espaco : espacos) {
                if (espaco.getId() == idEspaco) {
                    espaco.setDescricao(descricao);
                    espaco.setQuantidade(quantidade);
                    espaco.setStatus(status);
                    espaco.setDataDisponivel(dataDisponivel);
                    espaco.setCapacidade(capacidade);
                    espaco.setEmManutencao(reforma);
                    break;
                }
            }
        }

        public Equipamento adicionarEquipamento(String descricao, int quantidade, boolean status, LocalDate dataDisponivel, String observacoes, String fabricante, String modelo, boolean manutencao) {
            Equipamento equipamento = new Equipamento(descricao, quantidade, status, dataDisponivel, observacoes, fabricante, modelo, manutencao);
            equipamentos.add(equipamento);
            return equipamento;
        }

        public void removerEquipamento(int idEquipamento) {
            equipamentos.removeIf(equipamento -> equipamento.getId() == idEquipamento);
        }

        public boolean solicitarEdicaoEquipamento(int idEquipamento) {
            for (Equipamento equipamento : equipamentos) {
                if (equipamento.getId() == idEquipamento) {
                    return true;
                }
            }
            return false;
        }

        public void editarEquipamento(int idEquipamento, String descricao, int quantidade, boolean status, LocalDate dataDisponivel, String observacoes, String fabricante, String modelo, boolean manutencao) {
            for (Equipamento equipamento : equipamentos) {
                if (equipamento.getId() == idEquipamento) {
                    equipamento.setDescricao(descricao);
                    equipamento.setQuantidade(quantidade);
                    equipamento.setStatus(status);
                    equipamento.setDataDisponivel(dataDisponivel);
                    equipamento.setFabricante(fabricante);
                    equipamento.setModelo(modelo);
                    equipamento.setManutencao(manutencao);
                    break;
                }
            }
        }
    }
