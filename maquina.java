/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominoes;

import java.util.Vector;

/**
 *
 * @author Deninson
 */
public class maquina {
    ///atributos
    int indice;
    String ficha;
    Vector<String> fichasjugador;

    ///metodos
    public int izq(String str, Vector<String> vector) {                         ///busca en la pocision izquierda
        

        for (int i = 0; i < vector.size(); i++) {                               ///recorre los elementos en el vector
            String cadena = vector.elementAt(i);                                ///valor en el indice i
            String recorFichajugador = cadena.substring(0, 1);                  ///substring recorta el str
            
                                                                                ///tomamos el valor en la posicion i y la recortamos mostrando solo el segundo numero de la ficha
            String recorFichaIZQ = str.substring(0, 1);                         ///recortamos la entrada de ficha, mostrando el segundo valor
                                   
            if (recorFichajugador.equals(recorFichaIZQ)) {
                int indice = i;
                return indice;
                
            }
        }
        return 33;
    }
    
    public int izq2(String str, Vector<String> vector) {                         ///busca en la pocision izquierda
        

        for (int i = 0; i < vector.size(); i++) {                               ///recorre los elementos en el vector
            String cadena = vector.elementAt(i);                                ///valor en el indice i
            String recorFichajugador = cadena.substring(0, 1);                  ///substring recorta el str
            
                                                                                ///tomamos el valor en la posicion i y la recortamos mostrando solo el segundo numero de la ficha
            String recorFichaIZQ = str.substring(2, 3);                         ///recortamos la entrada de ficha, mostrando el segundo valor
                                   
            if (recorFichajugador.equals(recorFichaIZQ)) {
                int indice = i;
                return indice;
                
            }
        }
        return 33;
    }
    
    
    public int der(String str, Vector<String> vector) {
        
        for (int i = 0; i < vector.size(); i++) {
        String cadenaIzq =vector.elementAt(i);                                  /////encontrar por el lado derecho
            String VecIzq= cadenaIzq.substring(2, 3);
            String textIzq= str.substring(2, 3);
            if (textIzq.equals(VecIzq)){
                int indice = i;
                return indice;
            }
        }    
        return 33;                                                              ///si no lo encuentra regresa 33
    }
    
    public int der2(String str, Vector<String> vector) {
        
        for (int i = 0; i < vector.size(); i++) {
        String cadenaIzq =vector.elementAt(i);                                  /////encontrar por el lado derecho
            String VecIzq= cadenaIzq.substring(2, 3);
            String textIzq= str.substring(0, 1);
            if (textIzq.equals(VecIzq)){
                int indice = i;
                return indice;
            }
        }    
        return 33;                                                              ///si no lo encuentra regresa 33
    }
    
    
    public int encontrar(String str, Vector<String> vector) {                   ////segun sea el caso va regresar el indice
        maquina ju = new maquina();                                             ////el valor a encontrar puede estar al inicio o al final de la ficha
        int a = ju.izq(str, vector);            
        int b = ju.der(str, vector);
        int c = ju.der2(str, vector);
        int d = ju.izq2(str, vector);
        
        if (a!=33){
            return a;
        }
        if (b!=33){
            return b;
        }
        if (c!=33){
            return c;
        }
        if (d!=33){
            return d;
        }
        return 99;                                                              ///99 si no esta el valor en la ficha
        
    }
    

}