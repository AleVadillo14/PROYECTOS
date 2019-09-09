/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author alew__000
 */

public class Main {
    public static void main(String[] args){
       Lista lista1 = new Lista(); 
       Lista lista2 = new Lista(); 
       Integer numero1=0, numero2=0, a, b, vuelta=0;
        
    try{
        
        int lin = 0;
        FileReader fr = new FileReader ("expol.txt");
        BufferedReader br = new BufferedReader (fr);
        String cadena;
        while((cadena=br.readLine()) != null){ 
            lin++; 
        if(lin == 1){  
        String[] aux = cadena.split(" "); 
            //System.out.println("nose"+aux[0]); 
            numero1 = Integer.valueOf(aux[0]); 
            //System.out.println("nose"+aux[1]); 
            numero2 = Integer.valueOf(aux[1]);
        }else{
        String[] valor = cadena.split(" "); 
        lin--;
            for (int i=0; i<lin; i++) { 
                a = Integer.valueOf(valor [0]); 
                b = Integer.valueOf(valor [1]); 
                //System.out.println("prueba "+c+","+e);   
                vuelta++;
                if((vuelta <= numero1)){ 
                    lista1.insertarFinal(a, b);
                }else{ 
                    lista2.insertarFinal(a, b);
                }
            }
        }
        }
    }catch(Exception ex){
    }
        System.out.println("P O L I N O M I O  I: ");
        lista1.imprimir();
        System.out.println("\n");
        System.out.println("P O L I N O M I O  II: ");
        lista2.imprimir();
        System.out.println("\n");
        System.out.println("------ S U M A ------");
        lista1.suma(lista2);
        System.out.println("\n");
        System.out.println("----- R E S T A ------");
        lista1.resta(lista2);
        System.out.println("\n");
        System.out.println("----- M U L T I  P L I C A C I Ó N -----");
        lista1.multiplicacion(lista2);
}
    
}