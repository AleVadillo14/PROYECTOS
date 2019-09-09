/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;

/**
 *
 * @author alew__000
 */
public class Lista {
    Nodo inicio = null;
    Nodo fin = null;

    void insertarFinal (String cadena){
        int longC;
        char c;
        longC = cadena.length();
        for (int i=0; i<longC; i++) {
            c = cadena.charAt(i);
            int ascii = c;
        Nodo nuevo = new Nodo();
        nuevo.code = ascii;
        nuevo.next = null;
        nuevo.ant = null;
            if(inicio == null){
                inicio = nuevo;
                fin = nuevo;
            }else{
                fin.next = nuevo;
                nuevo.ant = fin;
                fin = nuevo;
            }
    }
    }
    
    
    void insertar (int elemento){
    Nodo nuevo = new Nodo();
    nuevo.code = elemento;
    nuevo.next = null;
    nuevo.ant = null;
    if(inicio == null){
        inicio = nuevo;
        fin = nuevo;
    }else{
        inicio.ant = nuevo;
        nuevo.next = inicio;
        inicio = nuevo;
    }
    }
    
    void completar (int elemento){
    Nodo nuevo = new Nodo();
    nuevo.code = elemento;
    nuevo.next = null;
    nuevo.ant = null;
    if(inicio == null){
        inicio = nuevo;
        fin = nuevo;
    }else{
        fin.next = nuevo;
        nuevo.ant = fin;
        fin = nuevo;
    }        
    }
    
    void codificar (Lista lista2){
        Nodo aux = inicio;
        Nodo auxx = lista2.inicio;
        int cont=0, conti=0;
        while(aux != null){
            cont++;
            aux = aux.next;
        }
        while(auxx != null){
            conti++;
            auxx = auxx.next;
        }
        Lista finaf = new Lista();
        int suma;
        if(cont == conti){
        Nodo auxi = fin;
        Nodo ascs = lista2.fin;
        while((auxi != null) && (ascs != null)){
            suma = auxi.code + ascs.code;
            finaf.insertar(suma);
            auxi = auxi.ant;
            ascs = ascs.ant;
        }
        //CASO 2 
        }else{
            Nodo cas2 = lista2.inicio; 
            if(cont > conti){
                while((cont != conti)){
                    lista2.completar(cas2.code);
                    cas2 = cas2.next;
                    conti++;
                }
            Nodo casii = fin;
            Nodo casiii = lista2.fin;
            //hacer la suma del ascci
            while((casii != null) && (casiii != null)){
                suma = casii.code + casiii.code;
                finaf.insertar(suma);
                casii = casii.ant;
                casiii = casiii.ant;
            }
        //CASO 3
            }else{
                Nodo cast = inicio;
                Nodo casti = lista2.inicio;
                int vuelta=0;
                if(cont < conti){
                    while(vuelta < cont){
                        while((cast != null) && (casti != null)){
                        suma = cast.code + casti.code;
                        finaf.completar(suma);
                        cast = cast.next;
                        casti = casti.next;
                        }
                        vuelta++;
                    }
                }
            }
        }
        Nodo msj = finaf.inicio;
        int p;
            System.out.println("MENSAJE ENCRIPTADO:");
        while(msj != null){
            p = msj.code;
            char c = (char)p;
            System.out.print(" "+c);
            msj = msj.next;
        }
    }
    
    
    void decodificar (Lista lista2){
        Nodo aux = inicio;
        Nodo auxx = lista2.inicio;
        int msj=0, cont=0;
        while(aux != null){
            msj++;
            aux = aux.next;
        }
        while(auxx != null){
            cont++;
            auxx = auxx.next;
        }
        Lista acabada = new Lista();
        int resta;
        if(msj == cont){
        Nodo mism = fin;
        Nodo mismm = lista2.fin;
        while((mism != null) && (mismm != null)){
            resta = mism.code - mismm.code;
            acabada.insertar(resta);
            mism = mism.ant;
            mismm = mismm.ant;
        }
        //CASO 2 
        }else{
            Nodo cass2 = lista2.inicio; 
            if(msj > cont){
                while((msj != cont)){
                    lista2.completar(cass2.code);
                    cass2 = cass2.next;
                    cont++;
                }
                    Nodo cas2 = fin;
                    Nodo casi = lista2.fin;
                    while((cas2 != null) && (casi != null)){
                    resta = cas2.code - casi.code;
                    acabada.insertar(resta);
                        cas2 = cas2.ant;
                        casi = casi.ant;
                    }
        //CASO 3
            }else{
                Nodo cass3 = inicio;
                Nodo casi3 = lista2.inicio;
                int vuelta=0;
                if(msj < cont){
                    while(vuelta < msj){
                        while((cass3 != null) && (casi3 != null)){
                        resta = cass3.code - casi3.code;
                        acabada.insertar(resta);
                        cass3 = cass3.next;
                        casi3 = casi3.next;
                        }
                        vuelta++;
                    }
                }
            }
        }
        Nodo des = acabada.inicio;
        int dc;
            System.out.println("MENSAJE DESENCRIPTADO:");
        while(des != null){
            dc = des.code;
            char c = (char)dc;
            System.out.print(" "+c);
            des = des.next;
        }     
    }

    
    void imprimir (){
        Nodo aux = inicio;
        while(aux != null){
            System.out.print(" "+aux.code);
            aux = aux.next;
        }
    }
}