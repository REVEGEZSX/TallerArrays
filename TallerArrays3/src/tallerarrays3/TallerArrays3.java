package tallerarrays3;
import java.util.Scanner;
/**
 *
 * @author Stiven Melendez
 */
public class TallerArrays3 
{

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[6][8];
        
        for(int x = 0; x<6; x++)
        {
            for(int y = 0; y<8; y++)
            {
                System.out.println("ingrese un numero en fila "+(x+1)+" columna "+(y+1));
                matriz[x][y] = leer.nextInt();
                
                if(matriz[x][y] < 0)
                {
                    matriz[x][y] = 0;
                }
            }
        }
        
        for(int x = 0; x<6; x++)
        {
            for(int y = 0; y<8; y++)
            {
                System.out.print(" ["+matriz[x][y]+"] ");
            }
            System.out.println("");
        }
    }
    
}
