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
         Lista num1 = new Lista();
         Lista num2 =new Lista();
    try{
        FileReader fr = new FileReader("excalcgde.txt");
        BufferedReader br = new BufferedReader(fr);
        String cadena;
        int con = 0;
        while((cadena = br.readLine()) != null){
        con++;
        if(con == 1){
            num1.insertar(cadena);
        }else{
            num2.insertar(cadena);
        }
        }
    }catch(Exception ex){
    }
        System.out.println("-----SUMA-----");
    num1.suma(num2);
            System.out.println("\n");
        System.out.println("-----RESTA-----");
    num1.resta(num2);
            System.out.println("\n");
        System.out.println("-----MULTIPLICACION-----");
    num1.multiplicar(num2);
            System.out.println("\n");
        System.out.println("-----DIVISION-----");    
    num1.dividir(num2);
    }
}