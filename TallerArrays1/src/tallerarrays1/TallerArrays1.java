package tallerarrays1;

/**
 *
 * @author Stiven Melendez
 */
import java.util.*;
public class TallerArrays1 
{
    
    public static void main(String[] args) 
    {
        //variables
        Scanner leer = new Scanner(System.in);
        int Edades[] = new int[10];
        String Nombres[] = new String[10];
        int Mayor = 0, posm = 0;
        //
        
        for(int x = 0; x<10; x++)
        {
            System.out.println("ingrese el nombre del estudiante "+(x+1));
            Nombres[x] = leer.next();

            
            if(Edades[x] > Mayor)
            {
                posm = x;
                Mayor = Edades[x];
            }
        }
        System.out.println("el estudiante de mayor edad es: "+Nombres[posm]+" con edad de "+Edades[posm]);
    }
}
