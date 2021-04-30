/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad30_04_2021;

import java.util.Scanner;

/**
 *
 * @author chent
 */
public class Actividad30_04_2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-------------------------------------------------------" );
System.out.println("-------------------------------------------------------" );
          System.out.println("1.-Calcular el factorial del 1 al 10" );     
        int cont = 1;
        int factorial=1;
           System.out.println("la lista es de:" );
        while (cont <=10){
           
              System.out.println("el numero "+cont );
                
            factorial*= cont;
            cont++;
            System.out.println("= "+factorial);
       
        }
        System.out.println("-------------------------------------------------------" );
System.out.println("-------------------------------------------------------" );
          System.out.println("2.- Calcular la media de la suma de  0 hasta el número introcucido por el usuario" ); 
          int num=0;
     int sum=0;
     int media=0;
  int e=0;
    Scanner insertar=new Scanner(System.in);
      System.out.println("ingrese un numero" ); 
    num=insertar.nextInt();
    while (e<=num){
        sum+=e;
        e++;
        media=sum/num;
        
    } 
 System.out.println("La suma del listado es igual a : " +sum); 
        System.out.println("La media es igual a : "+media);
System.out.println("-------------------------------------------------------" );
 System.out.println("-------------------------------------------------------" );
     System.out.println("3.-" ); 
     int n=0;
     int s=0;
     int prom=0;
     int mayor=0;
     int menor = 0;
     int cont1 = 0;
    System.out.println("ingresa una cantidad de numeros a ingresar" );  
    n=insertar.nextInt();
   System.out.println("inicia la suma" );
     for(int i=0; i<=n;i++){ 
        s+=i; 
      prom=s/n; 
        System.out.println("+ "+i+" es igual a: "+ s);
    }
        if (n>mayor) {
            mayor=n;
           
        } 
        if (n<=menor) {
            menor=n;
         
        }
            
System.out.println("El promedio de "+s+" es de: "+prom);
System.out.println("el numero mayor introducido es "+ mayor);
System.out.println("el numero menor introducido es "+menor);
cont1=mayor-menor;
        System.out.println(" La distancia numérica entre ellos es de "+cont1);
}
        }
