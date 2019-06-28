package tallerarrays6;
import java.util.Scanner;
/**
 *
 * @author Stiven Melendez
 */
public class TallerArrays6 
{

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[6][8];
        int contpos=0, contzero=0, contneg=0, MC;
        System.out.println("ingrese el tamaño de la matriz cuadrada");
        MC = leer.nextInt();
        
        for(int x = 0; x<MC; x++)
        {
            for(int y = 0; y<MC; y++)
            {
                System.out.println("ingrese un numero en fila "+(x+1)+" columna "+(y+1));
                matriz[x][y] = leer.nextInt();
                
                if(matriz[x][y] < 0)
                {
                    contneg++;
                }
                
                if(matriz[x][y] > 0)
                {
                    contpos++;
                }
                  
                if(matriz[x][y] == 0)
                {
                    contzero++;
                }
            }
        }
        
        for(int x = 0; x<MC; x++)
        {
            for(int y = 0; y<MC; y++)
            {
                System.out.print(" ["+matriz[x][y]+"] ");
            }
            System.out.println("");
        }
    }
    
}
