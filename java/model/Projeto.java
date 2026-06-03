package model;

public class Projeto {
    private String nomeProjeto;
    private String descricao;
    private String dataInicio;
    private String dataTerminoPrevista;
    private String status; // planejado, em andamento, concluido, cancelado
    private Usuario gerenteResponsavel;

    public Projeto(String nomeProjeto, String descricao, String dataInicio, String dataTerminoPrevista, String status, Usuario gerenteResponsavel) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
        this.status = status;
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public String getNomeProjeto() { return nomeProjeto; }
    public String getDescricao() { return descricao; }
    public String getDataInicio() { return dataInicio; }
    public String getDataTerminoPrevista() { return dataTerminoPrevista; }
    public String getStatus() { return status; }
    public Usuario getGerenteResponsavel() { return gerenteResponsavel; }
}