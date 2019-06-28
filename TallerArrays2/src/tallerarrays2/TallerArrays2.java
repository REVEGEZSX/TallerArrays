package tallerarrays2;

import java.util.Scanner;

/**
 * @author Stiven Melendez
 */
public class TallerArrays2 
{
    public static void main(String[] args) 
    {
        int i, j, aux;
        int A[]=new int[10];
        Scanner leer = new Scanner(System.in);

        for(int x = 0; x<10; x++)
        {
            System.out.println("ingrese un numero ");
            A[x] = leer.nextInt();
        }
        for (i = 0; i < A.length - 1; i++) 
        {
            for (j = 0; j < A.length - i - 1; j++) {
                
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        for(int x = 0; x<10; x++)
        {
            System.out.println(A[x]);
        }
    }  
}
