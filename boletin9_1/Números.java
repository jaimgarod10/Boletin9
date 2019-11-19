package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author jgarciaodowd
 */
public class Números {
    
    private int num;
    Scanner sc = new Scanner(System.in);

    /**
     *
     * @return
     */
    public int pedirDatos(){
        System.out.println(" teclea numero: ");
        num= sc.nextInt();
        return num;
    } 

    /**
     *
     */
    public void calcularNum(){
        int i;
        int pos=0,neg=0,cero=0;
        for(i=0;i<10;i++){
            num=pedirDatos();
            if(num>0) {
               pos++ ;
            }
            else if(num<0) {
               neg++;
            }
          else
          cero++; 
                      
    }
        
        System.out.println(" Positivos: " + pos);
        System.out.println(" Negativos: " + neg);
        System.out.println(" Ceros: " + cero);
    
}
    
}
