package br.com.dio;

import br.com.dio.models.Endereco;
import br.com.dio.models.Gerente;
import br.com.dio.models.OperadorDeCaixa;
import br.com.dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        //atribuindo rua para esse endereço
        endereco1.setRua("Rua 1");
        //atribuindo rua para esse endereço
        endereco1.setBairro("Bairro 1");
        //atribuindo rua para esse endereço
        endereco1.setComplemento("complemento 1");

        System.out.println("Rua: " + endereco1.getRua());
        System.out.println("Bairro: " + endereco1.getBairro());
        System.out.println("Complemento: " + endereco1.getComplemento());
        System.out.println("\nEndereço 1 Completo\n" + endereco1);

        //Passando Endereço por paramêtro
        Endereco endereco2 = new Endereco("Rua 2", "Bairro 2", "Complemento 2");
        System.out.println("\nEndereço 2 Completo\n" + endereco2);

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Bruna Vendedora");
        vendedor.setDocumentacao("432.123.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco1);
        vendedor.calculaBonificacao(2d);

        System.out.println("\n" + vendedor);

        System.out.println("\n");
        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Bruna Operadora de Caixa", "532.123.789-00" , 2000d, endereco2);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("Bruna Gerente");
        gerente.setDocumentacao("122.123.789-00");
        gerente.setEndereco(endereco1);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println("\n" + gerente);


    }
}
