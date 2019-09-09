/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author alew__000
 */
public class Lista {
    
 Nodo inicio = null;
 Nodo fin = null;
 
    void insertarInicio(int dato){
    Nodo nuevo = new Nodo();
    nuevo.dato = dato;
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
    
    void insertar (String cadena){
        int longit, ln;
        char sc;
        
        longit = cadena.length();
        ln = 0;
        
       for(int x=0; x<longit; x++){
           sc = cadena.charAt(x);
        switch(sc){
            case '0':
                ln = 0;
                break; 
            case '1':
                ln = 1;
                break;
            case '2':
                ln = 2;
                break;
            case '3':
                ln = 3;
                break;
            case '4':
                ln = 4;
                break;
            case '5':
                ln = 5;
                break;
            case '6':
                ln = 6;
                break;
            case '7':
                ln = 7;
                break;
            case '8':
                ln = 8;
                break;
            case '9':
                ln = 9;
                break;
        }
        Nodo nuevo = new Nodo();
        nuevo.dato = ln;
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
    
    void suma (Lista lista2){
        Lista add = new Lista();
        Nodo aux = fin;
        Nodo auxi = lista2.fin;
        int sm, d=0, res;
        
        while((aux != null) && (auxi != null)){
            sm = aux.dato + auxi.dato + d;
            if(sm > 9){
                if(aux != inicio && auxi != inicio){
                d = sm/10;
                res = sm%10;
                sm = sm-d*10;
                add.insertarInicio(sm); 
                }else{
                    add.insertarInicio(sm);
                }
            }else{
                d = 0;
                add.insertarInicio(sm);
            }
            aux = aux.ant;
            auxi = auxi.ant; 
        }
        System.out.println("RESULTADO SUMA: ");
        Nodo auxx = add.inicio;
        while(auxx != null){
            System.out.print(auxx.dato);
            auxx = auxx.next;
        }
    }
        
    
    void resta (Lista lista2){
        Lista resta = new Lista();
        Nodo aux = fin;
        Nodo auxx = lista2.fin;
        int rst;
        
        while((aux != null) && (auxx != null)){
            if(aux.dato >= auxx.dato){
                rst = aux.dato - auxx.dato;
                resta.insertarInicio(rst);
                aux = aux.ant;
                auxx = auxx.ant; 
            }else{
                aux.dato = aux.dato + 10;
                rst = (aux.dato) - auxx.dato;
                resta.insertarInicio(rst);
                aux = aux.ant;
                aux.dato = aux.dato - 1;
                auxx = auxx.ant;
            }
        }
        System.out.println("RESULTADO RESTA: ");
        Nodo auxxx = resta.inicio;
        while(auxxx != null){
            System.out.print(auxxx.dato);
            auxxx = auxxx.next;
        }       
    }
    
    
    void multiplicar (Lista lista2){
      int contador=0, contadorcito=0;
       Nodo auxi = inicio;
       Nodo auxxi = lista2.inicio;
       while(auxi != null){
           auxi = auxi.next;
           contador++;
       }
        while(auxxi != null){
           auxxi = auxxi.next;
           contadorcito++;
       }
       Nodo auxixi = inicio;
       int power = contador-1;
       int operacion, numero=0;
       while(auxixi != null){
           operacion = (auxixi.dato) * ((int)Math.pow(10, power));
           auxixi = auxixi.next;
           power--;
           numero+=operacion;    
       }
       //System.out.println("numadentro"+numAdentro);
       Nodo auxii = lista2.inicio;
       int pow = contadorcito-1;
       int mult, number=0;
       
       while(auxii != null){
           mult = (auxii.dato) * ((int)Math.pow(10, pow));
           auxii = auxii.next;
           pow--;
           number+=mult;    
       }
       //System.out.println("numAfuera"+numAfuera);
       double resultado;
       resultado = numero * number;
       System.out.println("MULTIPLICACION: "+resultado);
    }
 
    
    void dividir (Lista lista2){
       int contadorone=0, contadortwo=0;
       Nodo auxi = inicio;
       Nodo auxii = lista2.inicio;
       while(auxi != null){
           auxi = auxi.next;
           contadorone++;
       }
        while(auxii != null){
           auxii = auxii.next;
           contadortwo++;
       }
       Nodo auxiii = inicio;
       int potencia = contadorone-1;
       int mlt, numI=0;
       while(auxiii != null){
           mlt = (auxiii.dato) * ((int)Math.pow(10, potencia));
           auxiii = auxiii.next;
           potencia--;
           numI+=mlt;    
       }
       //System.out.println("numadentro"+numAdentro);
       Nodo auxiv = lista2.inicio;
       int potencia2 = contadortwo-1;
       int mul, numO=0;
       while(auxiv != null){
           mul = (auxiv.dato) * ((int)Math.pow(10, potencia2));
           auxiv = auxiv.next;
           potencia2--;
           numO+=mul;    
       }
       //System.out.println("numAfuera"+numAfuera);
       int resultado, residuo;
       resultado = numI/numO;
       residuo = numI%numO;
       System.out.println("COCIENTE: "+resultado);
       System.out.println("RESIDUO: "+residuo);
    }
   
   
     void imprimir(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.print(aux.dato+" ");
            aux = aux.next;
        }
    }
}