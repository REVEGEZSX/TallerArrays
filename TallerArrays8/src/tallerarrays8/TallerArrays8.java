package tallerarrays8;

import java.util.Scanner;

public class TallerArrays8 
{
    public static void main(String[] args) 
    {
        int numeros[][] = new int[3][3];
        int valor;
        Scanner lector = new Scanner(System.in);

        System.out.println("MATRIZ CUADRADA 3 X 3");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.println("Ingrese el valor de " + i + " y" + j + ": ");
                valor = lector.nextInt();
                numeros[i][j] = valor;
            }
        }

        System.out.println("");
        System.out.println("Presentacion de la matriz");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(numeros[i][j] + "\t");
                if (j == 2) {
                System.out.print("\n");
                }
            }
        }

        System.out.println("");
        System.out.println("Diagonal Principal");

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (i == j) 
                {
                    System.out.print(numeros[i][j] + " ");
                }
            }
        }

        System.out.println("\n");
        System.out.println("Diagonal Secundaria");
        
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (i == 0 && j == 2) 
                {
                    System.out.print(numeros[i][j] + " ");
                }

                if (i == 1 && j == 1) 
                {
                    System.out.print(numeros[i][j] + " ");
                }

                if (i == 2 && j == 0) 
                {
                    System.out.print(numeros[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
    }
}