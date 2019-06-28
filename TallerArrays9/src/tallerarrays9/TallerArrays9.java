package tallerarrays9;

import java.util.Scanner;

public class TallerArrays9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        int tamaño;
        int v1[], v2[], v3[];
        System.out.println("Ingrese el tamaño del vector");
        tamaño=leer.nextInt();
        v1=new int [tamaño];
        v2=new int [tamaño];
        v3=new int [tamaño];
        for(int i=0; i<v1.length; i++){
        System.out.println("Ingrese el dato en el vector 1");
        v1[i]=leer.nextInt();
        System.out.println("Ingrese el dato en el vector 2");
        v2[i]=leer.nextInt();
        v3[i]=v1[i]+v2[i];
        }
        for (int j=0; j<v3.length; j++){
        System.out.println(v3[j]+"\t");
    }
        System.out.println("");
    }
}
