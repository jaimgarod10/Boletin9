package com.mycompany.boletin9_5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Números {
 
   private int num;
   Scanner sc= new Scanner(System.in);
   
    public int pedirDatos(){
        System.out.println(" teclea numero: ");
        num= sc.nextInt();
        return num;
    }
    public void serieNumeros(){
        int num=pedirDatos();
        int i = 1;
        System.out.print("a) ");
        while (i!=num){
            if (i%2==0) {
                System.out.print(i+" + ");
            }
            i++;
        }
        i=1;
        System.out.print("\nb) ");
        while (i!=num){
            if (i%2==0) {
                System.out.print(" +"+i+" ");
            } else {
                System.out.print(" - "+i+" ");
            }
            i++;
        }
        System.out.print("\nc) ");
        int t1=0, t2=1;
        for (i=1; i<=num; ++i)
        {
            System.out.print(t1 + " + ");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }
    }
}
