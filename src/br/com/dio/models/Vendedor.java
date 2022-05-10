package br.com.dio.models;

public class Vendedor extends FuncionarioCLT implements Calculabonificacao {

    private Double valorBonificacao;


    @Override
    public String toString() {
        return "Vendedor" +
                "\nNome: " + nome +
                "\nDocumentacao: " + documentacao +
                "\nValorSaldo: " + valorSalario +
                "\nEndereço: " + endereco +
                "\nValor da Bonificação: " + this.valorBonificacao;
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }
}
