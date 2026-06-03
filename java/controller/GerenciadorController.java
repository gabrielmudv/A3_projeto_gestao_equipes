package controller;

import model.Usuario;
import model.Equipe;
import model.Projeto;
import java.util.ArrayList;

public class GerenciadorController {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Equipe> equipes = new ArrayList<>();
    private ArrayList<Projeto> projetos = new ArrayList<>();

    public GerenciadorController() {
        // Carga inicial (Seed) adaptada com os perfis corretos
        usuarios.add(new Usuario("Carlos Silva", "111.222.333-44", "carlos@ibmr.com", "Coordenador", "carlos1", "123", "administrador"));
        usuarios.add(new Usuario("Ana Souza", "555.666.777-88", "ana@ibmr.com", "Gerente de TI", "ana1", "123", "gerente"));
        usuarios.add(new Usuario("Bruno Lima", "999.888.777-66", "bruno@ibmr.com", "Analista", "bruno1", "123", "colaborador"));
    }

    public void cadastrarUsuario(String nome, String cpf, String email, String cargo, String login, String senha, String perfil) {
        usuarios.add(new Usuario(nome, cpf, email, cargo, login, senha, perfil.toLowerCase()));
    }

    public ArrayList<Usuario> listarUsuarios() { return usuarios; }

    public void cadastrarEquipe(String nome, String descricao) {
        equipes.add(new Equipe(nome, descricao));
    }

    public ArrayList<Equipe> listarEquipes() { return equipes; }

    public void cadastrarProjeto(String nome, String descricao, String dataIn, String dataFim, String status, Usuario gerente) {
        projetos.add(new Projeto(nome, descricao, dataIn, dataFim, status.toLowerCase(), gerente));
    }

    public ArrayList<Projeto> listarProjetos() { return projetos; }

    public Usuario buscarUsuarioPorNome(String nome) {
        for (Usuario u : usuarios) {
            if (u.getNomeCompleto().equalsIgnoreCase(nome)) {
                return u;
            }
        }
        return null;
    }

    public Equipe buscarEquipePorNome(String nome) {
        for (Equipe e : equipes) {
            if (e.getNomeEquipe().equalsIgnoreCase(nome)) {
                return e;
            }
        }
        return null;
    }

    public Projeto buscarProjetoPorNome(String nome) {
        for (Projeto p : projetos) {
            if (p.getNomeProjeto().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
}