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

    void insertarFinal (int coef,int exp){
        Nodo dato = new Nodo();
        dato.coef = coef;
        dato.exp = exp;
        dato.next = null;
        dato.ant = null;
        if(inicio == null){
            inicio = dato;
            fin = dato;
        }else{
            fin.next = dato;
            dato.ant = fin;
            fin = dato;
        }
    }
    
     void suma (Lista lista2){
       Nodo auxone = inicio;
       Nodo auxnine = lista2.inicio;
       Lista listasuma = new Lista();
        while(auxone != null){
           listasuma.insertarFinal(auxone.coef, auxone.exp);
           auxone = auxone.next;
        }
        while(auxnine != null){
           listasuma.insertarFinal(auxnine.coef, auxnine.exp);
           auxnine = auxnine.next;
        }
       Nodo aux = listasuma.inicio;
        Nodo auxtwo = aux.next;
        Nodo auxthree = null;
        Nodo aux4 = null;
        //System.out.println("dsv");
        while(aux != null){
           auxtwo = aux.next;
            while(auxtwo != null){
                if(aux.exp == auxtwo.exp){
                    aux.coef = aux.coef + auxtwo.coef;
                    auxthree = auxtwo.ant;
                    auxthree.next = auxtwo.next;
                    aux4 = auxtwo.next;
                    auxtwo = aux4;
                }else{
                    auxtwo = auxtwo.next;
                }
            }
            aux = aux.next;       
        }   
       Nodo intento = listasuma.inicio;
       while(intento.next != null){
            if(intento.coef > 0){
                if(intento.exp == 0){
                System.out.print(" +"+intento.coef);
                }
                else{
                    System.out.print(" +"+intento.coef+"x^"+intento.exp+" ");
                }
            }else{
                if(intento.exp == 0){
                System.out.print(intento.coef);
                }else{
                System.out.print(intento.coef+"x"+intento.exp+" ");   
                }
            }
            intento = intento.next;
       }
   }
   

   void resta (Lista lista2){
       Nodo auxun = inicio;
       Nodo auxneuf = lista2.inicio;
       Lista listasuma = new Lista();
        while(auxun != null){
           listasuma.insertarFinal(auxun.coef, auxun.exp);
           auxun = auxun.next;
        }
        while(auxneuf != null){
           listasuma.insertarFinal(auxneuf.coef, auxneuf.exp);
           auxneuf = auxneuf.next;
        }

        Nodo aux = listasuma.inicio;
        Nodo auxdeux = aux.next;
        Nodo auxtrois = null;
        Nodo auxquatre = null;
        //System.out.println("sdf");
        while(aux != null){
           auxdeux = aux.next;
            while(auxdeux != null){
                if(aux.exp == auxdeux.exp){
                    aux.coef = aux.coef - auxdeux.coef;
                    auxtrois = auxdeux.next;
                    auxtrois.next = auxdeux.next;
                    auxquatre = auxdeux.next;
                    auxdeux = auxquatre;
                }else{
                    auxdeux = auxdeux.next;
                }
            }
            aux = aux.next;       
        }   
       Nodo muestra = listasuma.inicio;
       while(muestra.next != null){
            if(muestra.coef > 0){
                if(muestra.exp == 0){
                System.out.print(" +"+muestra.coef);
                }
                else{
                    System.out.print(" +"+muestra.coef+"x^"+muestra.coef+" ");
                }
            }else{
                if(muestra.exp == 0){
                System.out.print(muestra.coef);
                }else{
                System.out.print(muestra.coef+"x"+muestra.exp+" ");   
                }
            }
            muestra = muestra.next; 
       }      
   }

    
    void multiplicacion (Lista lista2){ 
        Lista newList = new Lista();
        Nodo auxuno = fin;
        Nodo aux2 = lista2.fin;
        Integer auxCoef, auxExpo;
        Integer newCoef, newExpo, vuelta=0;
        while(aux2 != null){
            auxuno = fin;
        while(auxuno != null){
           newCoef = (auxuno.coef) * (auxuno.coef);
           newExpo = (aux2.exp) + (auxuno.exp);
           newList.insertarFinal(newCoef, newExpo);
           auxuno = auxuno.ant;
        }
        aux2= aux2.ant;
        }
        simplificar(newList);
        Nodo auxi = newList.inicio;
        while(auxi != null){
            if(auxi.coef > 0){
                if(auxi.exp == 0){
                System.out.print(" +"+auxi.coef);
                }
                else{
                    System.out.print(" +"+auxi.coef+"x^"+auxi.exp+" ");
                }
            }else{
                if(auxi.exp == 0){
                System.out.print(auxi.coef);
                }else{
                System.out.print(auxi.coef+"x"+auxi.exp+" ");   
                }
            }
            auxi=auxi.next;
        }
    }
    
    
   void simplificar (Lista lista){
        Nodo auxx = lista.inicio;
        Nodo auxdos = auxx.next;
        Nodo auxtres = null;
        Nodo auxcuatro = null;
        while(auxx != null){
            auxdos = auxx.next;
            while(auxdos != null){
                if(auxx.exp == auxdos.exp){
                    auxx.coef = auxx.coef + auxdos.coef;
                    auxtres = auxdos.ant;
                    auxtres.next = auxdos.next;
                    auxcuatro = auxdos.next;
                    auxcuatro.ant = auxtres;
                    auxdos = auxcuatro;
                }else{
                    auxdos = auxdos.next;
                }
            }
            auxx = auxx.next;       
        }   
   }


    void imprimir(){
        Nodo aux = inicio;
        while(aux != null){
            if(aux.coef > 0){
                if(aux.exp == 0){
                System.out.print(" +"+aux.coef);
                }
                else{
                    System.out.print(" +"+aux.coef+"x^"+aux.exp+" ");
                }
            }else{
                if(aux.exp == 0){
                System.out.print(aux.coef);
                }else{
                System.out.print(aux.coef+"x"+aux.exp+" ");   
                }
            }
            aux = aux.next;
        }
    }
   }