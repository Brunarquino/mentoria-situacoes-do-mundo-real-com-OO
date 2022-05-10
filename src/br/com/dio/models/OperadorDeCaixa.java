package br.com.dio.models;

public class OperadorDeCaixa  extends FuncionarioCLT {


    public OperadorDeCaixa() {
    }

    public OperadorDeCaixa(String nome, String documentacao, Double valorSalario, Endereco endereco) {
        //Construtor da superclasse
        super(nome, documentacao, valorSalario, endereco);
    }

    //Sobreescrevendo o método toString
    @Override
    public String toString() {
        return "Operador De Caixa" +
                "\nNome: " + nome +
                "\nDocumentacao: " + documentacao +
                "\nValorSaldo: " + valorSalario +
                "\nEndereço: " + endereco;
    }
}
