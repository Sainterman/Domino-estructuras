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
public class eliminarFicha {
    maquina ju = new maquina();
    int fichaCola;
    
    public int izq(String str, Vector<String> vector, int indice) {
        String text = vector.elementAt(indice);                                 ///ej 7|3 elemento en el vector
        String cod = str;
        
        String Fichajugador = text.substring(0, 1);                             ///substring recorta el str "7"
        String FichaIZQ = str.substring(0, 1);                                  //ej 7|5  recorta y queda "7"
        if(Fichajugador.equals(FichaIZQ)){                                      ///compara si son iguales *|3 ==*|8
            return 1;                                                           ///siendo * como el valor a comparar
        }
        String text2 = vector.elementAt(indice);                                 ///ej 7|3
        String Fichajugador2 = text.substring(0, 1);                             ///substring recorta el str "7"
        String FichaDer2 = cod.substring(2, 3);                                  //ej 7|5  recorta y queda "5"
        if(Fichajugador2.equals(FichaDer2)){                                      ///compara si son iguales 2|* ==*|8
            return 2;                                                           ///siendo * como el valor a comparar
        }
        String text3 = vector.elementAt(indice);                                 ///ej 7|3
        String Fichajugador3 = text.substring(2, 3);                             ///substring recorta el str "3"
        String FichaDer3 = str.substring(2, 3);                                  //ej 7|5  recorta y queda "5"
        if(Fichajugador3.equals(FichaDer3)){                                      ///compara si son iguales 2|* ==4|*
            return 3;                                                           ///siendo * como el valor a comparar
        }
        String text4 = vector.elementAt(indice);                                 ///ej 7|3
        String Fichajugador4 = text.substring(2, 3);                             ///substring recorta el str "3"
        String FichaDer4 = str.substring(0, 1);                                  //ej 7|5  recorta y queda "5"
        if(Fichajugador4.equals(FichaDer4)){                                      ///compara si son iguales 2|* ==*|8
            return 4;                                                           ///siendo * como el valor a comparar
        }
        
        return 0;
    } 
    
    public int datoJuego(String string, Vector<String> vector, int indice){        /// regresa el dato que va a jugar e elimina la ficha del vector
        eliminarFicha elim =new eliminarFicha();
        int b = elim.izq(string, vector, indice);
        String str = vector.elementAt(indice); 
        if (b==1){
            String tex = str.substring(2, 3);              ///recortar el numero a jugar  derecho
            int entero= Integer.parseInt(tex);
            vector.remove(indice);
            return entero;
        }
        if (b==2){
            String tex = str.substring(2, 3);              ///recortar el numero a jugar
            int entero= Integer.parseInt(tex);
            vector.remove(indice);
            return entero;
        }
        if (b==3){
            String tex = str.substring(0, 1);              ///recortar el numero a jugar  izquierdo
            int entero= Integer.parseInt(tex);
            vector.remove(indice);
            return entero;
        }
        if (b==4){
            String tex = str.substring(0, 1);              ///recortar el numero a jugar
            int entero= Integer.parseInt(tex);
            vector.remove(indice);
            return entero;
        }
        
        fichaCola=55;                                       ///por error bota 55
        return fichaCola;
    }
    
}
