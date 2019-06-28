package tallerarrays7;

import java.util.Scanner;

public class TallerArrays7 {

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String nombre[] = new String[5];
        int horas[][] = new int [5][7];
        int sueldo[] = new int[5];
        int horasT[] = new int[5];
        int SueldosT[] = new int[5];
        int horastv=0, Salacum=0, totalemp = 0, mhlp=0, mhl=0;
        
        for(int x=0; x<5; x++)
        {
            System.out.println("ingrese nombre del trabajador"+(x+1));
            nombre[x] = leer.next();
            System.out.println("ingrese salario por hora");
            sueldo[x] = leer.nextInt();
            
            for(int y = 0; y<6;y++)
            {
                System.out.println("ingrese horas trabajadas el dia "+(y+1));
                horas[x][y] = leer.nextInt();
            }
        }
        //horas trabajadas
        for(int x=0; x<5; x++)
        {
            for(int y = 0; y<6;y++)
            {
                horastv = horastv + horas[x][y];
                
                if(horas[x][1] > mhl)
                {
                    mhlp = x;
                }
            }
            horasT[x] = horastv;
            horastv = 0;
        }
        //sueldo semanal
        for(int x=0; x<5; x++)
        {
            for(int y = 0; y<6;y++)
            {
                Salacum = Salacum + (horas[x][y]*horasT[x]);
                totalemp = totalemp + (horas[x][y]*horasT[x]);
            }
            SueldosT[x] = Salacum;
            Salacum = 0;
        }
        
        for(int x=0; x<5; x++)
        {
            System.out.print(" ["+nombre[x]+"] "+" ["+horasT[x]+"] ");
        }
        System.out.println("");
        
        for(int x=0; x<5; x++)
        {
            System.out.print(" ["+nombre[x]+"] "+" ["+SueldosT[x]+"] ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("el trabajador que labora mas el dia lunes es: "+nombre[mhlp]);
        System.out.println("");
        System.out.println("el total que pagara la empresa es: "+totalemp);
    }
    
}
