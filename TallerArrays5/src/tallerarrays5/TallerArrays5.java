package tallerarrays5;

import java.util.Scanner;

public class TallerArrays5 
{

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int fila = 6, columna = 8;
        int arreglo[][] = new int[50][50];
        
        for (int i = 0; i <fila; i++) 
        {
            for (int j = 0; j < columna; j++) 
            {
                System.out.println("Ingrese el dato en la posicion[" + i + "][" + j + "]");
                arreglo[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < columna; j++) 
            {
                if (arreglo[i][j] < 0) 
                {
                   fila=i;
                   columna=j;
                }
            }
        }
        
        for (int i = 0; i<fila; i++) 
        {
            for (int j = 0; j < columna; j++) 
            {
                System.out.print(arreglo[i][j]+" ");  
            }    
        }
        System.out.println ("El arreglo en la fila " +fila+ " y la columna " +columna+ " Tiene un numero negativo");   
    }
}

