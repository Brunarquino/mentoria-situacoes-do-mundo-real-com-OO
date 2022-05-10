package br.com.dio.models;

//Abstract somente usado para fazer Herança
//não da para fazer um new dessa classe
public abstract class FuncionarioCLT {

    protected String nome;
    protected String documentacao;
    protected Double valorSalario;
    protected Endereco endereco;

    public FuncionarioCLT() {
    }

    public FuncionarioCLT(String nome, String documentacao, Double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documentacao = documentacao;
        this.valorSalario = valorSalario;
        //Atributo de associação -> composição
        this.endereco = endereco;
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

    public Double getValorSalario() {
        return valorSalario;
    }
    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
