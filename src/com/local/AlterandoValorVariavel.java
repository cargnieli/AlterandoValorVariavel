package com.local;
import java.util.Scanner;

public class AlterandoValorVariavel {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite o tipo do pagamento [1 = à vista | 2 = a prazo]: ");
        Integer tipoPagamento = scanner.nextInt();

        double juros = 0.0;

        Boolean pagamentoAVista = tipoPagamento.equals(1);

        if (!pagamentoAVista) {
            juros = 10.0;
        }
            double acrescimo =  valorProduto * juros / 100;
            double valorTotal = acrescimo + valorProduto;

        System.out.println("Valor total: " + valorTotal);


	    scanner.close();
    }
}
