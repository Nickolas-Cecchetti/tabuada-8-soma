 /* Aluno: Nickolas E. F. Cecchetti - MatrÃƒÂ­cula: 0050015711 */ 
 
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author nicke
 */
public class TabuadaSoma 
{
    public static void main(String[] args)
    {
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ola Nickolas, entre com um numero: ");
        valor = teclado.nextInt();
        for(int i = 0; i < 11; i++)
        {
            System.out.println(valor + " + " + i + " = " + (valor + i));
        }
    }
}


