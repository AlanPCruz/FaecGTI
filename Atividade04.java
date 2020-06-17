package FaecGTI;

import java.util.Scanner;
/**
 *
 * @author: Alan P Cruz <alanpcruz_tec.ti@outlook.com>
 * @date: 14/05/2020
 */

/*
ATIVIDADE 04:

Crie um programa em java que leia o valor de um produto em dólar
e imprima o total a ser pago em reais considerando a cotação do dolar a $ 5,89
e a taxa de IOF aplicada de 1,1%.
Segue sugestão de formato de algoritmo (novo padrão ensinado em aula hoje). 
*/
public class Atividade04 {
    private final float VALOR_DA_COTACAO_DO_DOLAR = 5.89f;
    
    float valorEmDolar = 0;
    float valorEmReal = 0;
    float valorIof = 0;
    float valorTotal = 0;
   
    public static void main(String[] args) {
        new Atividade04().executarAlgoritmo();
    }
    
    private void executarAlgoritmo(){
        valorEmDolar = lerValorEmDolar();
        valorEmReal = calcularCotacao(valorEmDolar);
        valorIof = calcularValorIof(valorEmReal);
        valorTotal = calcularValorTotal(valorEmReal, valorIof);
        imprimirExtrato();
    }

    private float lerValorEmDolar() {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        float valorDigitado = read.nextFloat();
        read.close();
        return valorDigitado;
    }

    private float calcularCotacao(float valorEmDolar) {
        float valorTransformado = valorEmDolar * VALOR_DA_COTACAO_DO_DOLAR;
        return valorTransformado;
    }

    private float calcularValorIof(float valorEmReal) {
        float valorIof = valorEmReal * getPorcentagemIof();
        return valorIof;
    }

    private float getPorcentagemIof() {
        return (float)(1.1/100);
    }

    private float calcularValorTotal(float valorEmReal, float valorIof) {
        float soma = valorEmReal + valorIof;
        return soma;
    }
    
    private void imprimirExtrato(){
        System.out.println("-------------------------------------");
        System.out.println("|       Extrato do produto          |");
        System.out.println("-------------------------------------");
        System.out.format("|Valor em Dolar: US$ %.2f" 
                       +"\n|Valor em Reais: R$ %.2f"
                       +"\n|IOF: R$ %.2f",
                        valorEmDolar,valorEmReal,valorIof );
        System.out.println("\n-------------------------------------");
        System.out.format("|Valor Total: R$ %.2f", valorTotal);
        System.out.println("\n-------------------------------------");
    }
}
