package FaecGTI;

/**
 *
 * @author: Alan P Cruz <alanpcruz_tec.ti@outlook.com>
 * @date: 09/05/2020
 */

/*
ATIVIDADE 02:
Crie um programa em java que utilize pelo menos quatro variáveis de tipos diferentes em sua composição.
Vide documento em anexo.

Caso não receba uma cópia, faça uma cópia do documento via google documentos.
*/
public class Atividade02 {

    public static void main(String[] args) {
        String nome = "Alan Patrik da Cruz";
        int idade = 28;
        float altura = 1.78f;
        String trabalho = "Programador Java!";
        boolean fezAtividade = true;
    
    String texto = "Meu nome é " + nome 
            + "\nIdade: " + idade + "\nAltura: "
            + altura + "\nSou "+trabalho;

        System.out.println(texto);
        System.out.println("Atividade feita: " + fezAtividade);
    }
}
