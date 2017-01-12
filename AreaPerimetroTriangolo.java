/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangolo;

import java.util.Scanner;

/**
 *
 * @author studente
 */

public class AreaPerimetroTriangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lato1, lato2, lato3,h;
        int perimetro;
        float area;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Inserire il primo lato: ");
            lato1 = input.nextInt();

            System.out.println("Inserire il secondo lato: ");
            lato2 = input.nextInt();

            System.out.println("Inserire il terzo lato: ");
            lato3 = input.nextInt();
             
            System.out.println("Inserire altezza: ");
            h = input.nextInt();
        }while((lato3==0)||(lato2==0)||(lato1==0)||(h==0));

        System.out.println("lato1(base)= " + lato1);
        System.out.println("lato2= " + lato2);
        System.out.println("lato3= " + lato3);
        System.out.println("altezza= " + h);
        
        perimetro=lato1+lato2+lato3;
        System.out.println("Perimetro= " + perimetro);
        area=lato1*h/2;
        System.out.println("Area= " + area);
        
        
    }

}
