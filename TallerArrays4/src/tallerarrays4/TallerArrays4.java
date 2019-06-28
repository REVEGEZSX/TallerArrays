package tallerarrays4;
import java.util.Scanner;
/**
 *
 * @author Stiven Rafael Melendez Tovar
 */
public class TallerArrays4  
{
    public static String nombre[] = new String[50];
    public static double nota[] = new double[50];;
    public static void main(String[] args) 
    {
        int cantE, cantsp=0;
        
        double notaprom = 0, notaacum = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el numero de estudiantes");
        cantE = leer.nextInt();
        
        for (int i = 0; i < cantE; i++) 
        {
            System.out.println("Ingrese el nombre del estudiante");
            nombre[i] = leer.next();
            
            System.out.println("ingrese la nota (1 a 5)");    
            nota[i] = leer.nextDouble();
            
            notaacum = notaacum + nota[i];
        }
        notaprom = notaacum/cantE;
        for (int i = 0; i < cantE; i++) 
        {
            if(nota[i] > notaprom)
            {
                cantsp++;
            }
        }
        System.out.println("el promedio de los estudiantes es: "+notaprom);
        System.out.println("la cantidad de estudiantes sobre el promedio es: "+cantsp);
    } 
}

