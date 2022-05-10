package br.com.dio.models;

public abstract class FuncionarioPJ {

    protected String nome;
    protected String documentacao;
    protected Endereco endereco;
    protected Integer horasTrabalhadas;
    protected Double valorHora;
    protected Double valorRemuneracao;

    public void calculaRemuneracao() {
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentacao() {
        return documentacao;
    }
    public void setDocumentacao(String documentacao) {
        this.documentacao = documentacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }
    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }
    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }



}
