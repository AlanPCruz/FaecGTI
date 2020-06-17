
package FaecGTI;

import java.util.Scanner;

/**
 *
 * @author: Alan P Cruz <alanpcruz_tec.ti@outlook.com>
 * @date: 11/06/2020
 */

/*
ATIVIDADE 07:
A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
Faça um programa capaz de gerar a série até o n−ésimo termo.
*/
public class Atividade07 {

    public static void main(String[] args) {
       new Atividade07().ExecutarAlgoritmo();
    }
    
    private void ExecutarAlgoritmo(){
       int vezes = perguntarSequenciaDeVezes();
       long primeiroNumero = 0;
       long segundoNumero = 1;
       long fibonacci;
 
       System.out.println("0 \n1");
       for(int i = 0; i < vezes ; i++){
            fibonacci = fazerSerieFibonacci(primeiroNumero, segundoNumero);
            primeiroNumero = segundoNumero;
            segundoNumero = fibonacci;
            System.out.println(fibonacci);
            }
    }
    
    private int perguntarSequenciaDeVezes(){
       Scanner read = new Scanner(System.in);
       System.out.print("Digite quantas vezes você quer executar a sequência"
               + "(obs: não incluindo os 2 primeiros termos): ");
       int vezes = read.nextInt();
       return vezes;
    }
    
    private long fazerSerieFibonacci(long primeiroNumero, long segundoNumero){
        long numeroSequencia = primeiroNumero + segundoNumero;
        return numeroSequencia;
    }
}