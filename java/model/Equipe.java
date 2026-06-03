package model;

import java.util.ArrayList;

public class Equipe {
    private String nomeEquipe;
    private String descricao;
    private ArrayList<Usuario> membros;
    private ArrayList<Projeto> projetosAtuantes; // Atende: Uma equipe pode atuar em vários projetos

    public Equipe(String nomeEquipe, String descricao) {
        this.nomeEquipe = nomeEquipe;
        this.descricao = descricao;
        this.membros = new ArrayList<>();
        this.projetosAtuantes = new ArrayList<>();
    }

    public String getNomeEquipe() { return nomeEquipe; }
    public String getDescricao() { return descricao; }
    public ArrayList<Usuario> getMembros() { return membros; }
    public ArrayList<Projeto> getProjetosAtuantes() { return projetosAtuantes; }

    public void adicionarMembro(Usuario usuario) { this.membros.add(usuario); }
    public void associarProjeto(Projeto projeto) { this.projetosAtuantes.add(projeto); }
}