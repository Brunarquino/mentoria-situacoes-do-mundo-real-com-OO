package br.com.dio.models;

public class Gerente extends FuncionarioPJ implements Calculabonificacao {

    private Double valorBonificacao;

    @Override
    public String toString() {
        return "\tGerente\t" +
                "\nNome: " + nome +
                "\nDocumentacao: " + documentacao +
                "\nEndereco: " + endereco +
                "\nHoras Trabalhadas: " + horasTrabalhadas +
                "\nvalor da Hora: " + valorHora +
                "\nvalor da Remuneracao: " + valorRemuneracao +
                "\nValor da Bonificação: " + this.valorBonificacao;
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = super.getValorRemuneracao() * (porcentagemBonificacao/100d);
    }
}
