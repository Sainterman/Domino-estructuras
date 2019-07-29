/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominoes;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Dominoes {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Integer> dealer = new Vector<Integer>();
        Vector<String> fichas = new Vector<String>();
        Vector<String> jugador1 = new Vector<String>();
        fichas.add("0|0");
        fichas.add("0|1");
        fichas.add("0|2");
        fichas.add("0|3");
        fichas.add("0|4");
        fichas.add("0|5");
        fichas.add("0|6");
        fichas.add("1|1");
        fichas.add("1|2");
        fichas.add("1|3");
        fichas.add("1|4");
        fichas.add("1|5");
        fichas.add("1|6");
        fichas.add("2|2");
        fichas.add("2|3");
        fichas.add("2|4");
        fichas.add("2|5");
        fichas.add("2|6");
        fichas.add("3|3");
        fichas.add("3|4");
        fichas.add( "3|5");
        fichas.add("3|6");
        fichas.add("4|4");
        fichas.add("4|5");
        fichas.add("4|6");
        fichas.add( "5|5");
        fichas.add("5|6");
        fichas.add("6|6");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos jugadores?");
        int numJugadores = input.nextInt();
        if(numJugadores > 5 || numJugadores < 2){
            System.out.println("Escoja entre 2 a 5 jugadores");
            numJugadores = input.nextInt();
        }
        
        if(numJugadores == 2 ||  numJugadores == 3){
            numFichasPorJugador = 7;
        } else if (numJugadores == 4 || numJugadores ==5){
            numFichasPorJugador = 5;
        }
        
        
    }
    
    
    public static void getFicha(Vector<String> fichas,Vector<String> jugador){
        
        double rand  = Math.random() * ((fichas.size() + 1));
        int ificha = (int)rand;
        String ficha;
        ficha = fichas.get(ificha);
        jugador.add(ficha);
        fichas.remove(ificha);
        
        
    }
    
    public static void crearJugadores(int numJugadores){
        int numFichasPorJugador;
     if(numJugadores == 2 ||  numJugadores == 3){
            numFichasPorJugador = 7;
        } else if (numJugadores == 4 || numJugadores ==5){
            numFichasPorJugador = 5;
        }
    }
}
