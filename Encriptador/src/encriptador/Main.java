/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author alew__000
 */
public class Main {
    public static void main(String[] args){
        Lista letter = new Lista();
        Lista password = new Lista();
        Scanner opc = new Scanner(System.in);
        System.out.println("Seleccione una opción: \n1.-Encriptar \n2.-Descencriptar ");
        int o = opc.nextInt();
        if(o == 1){
        try{
        FileReader fr = new FileReader("ExEncriptar.txt");
        BufferedReader br = new BufferedReader(fr);
        String cadena;
        int con=0;
        while((cadena = br.readLine()) != null){
        con++;
            if(con == 1){
                letter.insertarFinal(cadena);
            }else{
                password.insertarFinal(cadena);
            }
         }
        }catch(Exception ex){
        }            
        letter.codificar(password);
        }else{
            if(o == 2){
        try{
        FileReader fr = new FileReader("ExDescencriptar.txt");
        BufferedReader br = new BufferedReader(fr);
        String cadena;
        int con=0;
        while((cadena = br.readLine()) != null){
        con++;
            if(con == 1){
                letter.insertarFinal(cadena);
            }else{
                password.insertarFinal(cadena);
            }
         }
        }catch(Exception ex){
        }
        letter.decodificar(password);
            }
        }
    }
}