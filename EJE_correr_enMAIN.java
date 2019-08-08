/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominoes;

/**
 *
 * @author Deninson
 */
public class EJE_correr_enMAIN {
    /*
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ficha;
        System.out.print("Ficha: ");
        ficha = sc.next();                                                    /// ficha a encontrar en el vector

        Vector<String> fichasjugador = new Vector<String>();                 ///ejemplo de vector 
        fichasjugador.add("0|0");
        fichasjugador.add("0|1");
        fichasjugador.add("0|2");
        fichasjugador.add("7|3");
        fichasjugador.add("6|4");
        fichasjugador.add("0|1");

        maquina ju = new maquina();
        int a = ju.encontrar(ficha, fichasjugador);
        
        eliminarFicha elim = new eliminarFicha();
        int b = elim.izq(ficha, fichasjugador, a);
        
        int fichajuego= elim.datoJuego(ficha, fichasjugador, a);
        
        
        for (int i = 0; i < fichasjugador.size(); i++) {                               ///recorre los elementos en el vector
            String cadena = fichasjugador.elementAt(i);
            System.out.println(cadena);
        }  
        /*
        ////System.out.println("el caso que se aplica es el  "+b);      
         ///// System.out.println("valor de ju.encontrar  el indice es= " + a);
           /////System.out.println("valor a jugar "+ fichajuego);  
        System.out.println(fichajuego); */
}
