package com.mycompany.boletin9_6;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Sueldo {
    
     private double cant;
    Scanner sc =new Scanner(System.in);
    
    public double pedirDatos(){
        System.out.print("Introduce un sueldo: ");
        return sc.nextDouble();
    }
    
     public void contabilidad(){
        double sueldo = pedirDatos();
        int i=0, j=0, k=0;
        while (sueldo!=0){
            if ((sueldo>=1000)&&(sueldo<=1750)) {
                i++;
            } else if (sueldo<1000) {
                j++;
            }
        k++;
        sueldo=pedirDatos();
        }
        System.out.println("Empleados que ganan entre 1000 e 1750 €(incluidos) " + i);
        System.out.println("Porcentaje de traballadores que ganan menos de 1000 €(incluido) " + (j*100)/k + "%");
    }
    
}
