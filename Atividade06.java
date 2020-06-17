
package FaecGTI;

/**
 *
 * @author: Alan P Cruz <alanpcruz_tec.ti@outlook.com>
 * @date: 07/06/2020
 */

/*
ATIVIDADE 06:
Faça um Programa que peça os 3 lados de um triângulo.
O programa deverá informar se os valores podem ser um triângulo.
Indique, caso os lados formem um triângulo, se o mesmo é: equilátero,
isósceles ou escaleno.

Dicas:
- Três lados formam um triângulo quando a soma de quaisquer dois lados
for maior que o terceiro;
- Triângulo Equilátero: três lados iguais;
- Triângulo Isósceles: quaisquer dois lados iguais;
- Triângulo Escaleno: três lados diferentes;
*/

public class Atividade06 {

    public static void main(String[] args) {
        ExecutarAlgoritmo();
    }
    
    private static void ExecutarAlgoritmo(){
        imprimirCabecalho();
        float ladoA = lerLadoDoTriangulo("Digite o tamanho do lado A: ");
        float ladoB = lerLadoDoTriangulo("Digite o tamanho do lado B: ");
        float ladoC = lerLadoDoTriangulo("Digite o tamanho do lado C: ");
        formarTriangulo(ladoA, ladoB, ladoC);
        imprimirDadosDoTriangulo(ladoA, ladoB, ladoC);
    }
    
    private static float lerLadoDoTriangulo(String msg){
        java.util.Scanner read = new java.util.Scanner(System.in);
        System.out.print(msg);
        float lado = read.nextFloat();
        return lado;
    }
    
    private static void formarTriangulo(
        float ladoA, 
        float ladoB, 
        float ladoC){
        boolean triangulo;
            triangulo = ladoA + ladoB > ladoC &&
                        ladoB + ladoC > ladoA &&
                        ladoA + ladoC > ladoB;
        
        if(!triangulo){
            System.err.println("As medidas informadas não formam um triângulo!");
            System.out.println("Tente novamente:");
            ExecutarAlgoritmo();
        }else{
            System.out.println("As medidas informadas formam um triângulo!");
        }

    }

    private static void imprimirCabecalho(){
        System.out.println("Conforme a representação abaixo,"
            + " informe o tamanho de cada lado do triângulo.");
        System.out.println("        /\\         ");
        System.out.println("       /  \\        ");
        System.out.println("   A  /    \\  B    ");
        System.out.println("     /      \\      ");
        System.out.println("    /        \\     ");
        System.out.println("    ¯¯¯¯¯¯¯¯¯¯      ");
        System.out.println("         C          ");
    }
    
    private static void imprimirDadosDoTriangulo(
            float ladoA, 
            float ladoB, 
            float ladoC){
        if(ladoA == ladoB && ladoA == ladoC)
            System.out.println("O triângulo é equilátero!");
        if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC)
            System.out.println("O triângulo é escaleno!");
        if(ladoA == ladoB && ladoA != ladoC ||
           ladoA != ladoB && ladoA == ladoC ||
           ladoB == ladoC && ladoB != ladoA    )
            System.out.println("O triângulo é isósceles!");
    }
}
