package com.mycompany.boletin9_4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TablaMultiplicar {
    
    int num = 0;
    Scanner sc = new Scanner(System.in);
   
    public int pedirDatos(){
        System.out.println(" teclea numero: ");
        num= sc.nextInt();
        return num;
    }
    
    public void tabla(){
        num=pedirDatos();
        while(num != 0){
            
            System.out.println(" La tabla de multipilcar del " + num + " es: ");
            for(int i=1; i<=10; i++){
                System.out.println(num + "x" + i +"=" + (num*i));
            } 
            num=pedirDatos();
        }
            System.out.println("Acabó");
    }
}

