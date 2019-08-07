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
    static Vector<String> jugador1 = new  Vector<>();
    static Vector<String> jugador2= new  Vector<>();
    static Vector<String> jugador3= new  Vector<>();
    static Vector<String> jugador4= new  Vector<>();
    static Vector<String> jugador5= new  Vector<>();
    static boolean jugando = true;
    static int numJugadores;

    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Integer> dealer = new Vector<Integer>();
        Vector<String> fichas = new Vector<String>();
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
        do{
            juega();
        }while(juega());
       
        crearJugadores(fichas, numJugadores);
        //System.out.println(fichas);
    }
    
    
    public static void getFicha(Vector<String> fichas, Vector<String> jugador){
        
        double rand  = Math.random() * ((fichas.size()+1));
        int ificha = (int)rand -1;
        if(ificha < 0){
            ificha = (int)rand;
        }
        String ficha;
        ficha  = fichas.get(ificha);
        jugador.add(ficha);
        fichas.remove(ificha);
        
        
    }
    
    public static void crearJugadores(Vector<String> fichas,int numJugadores){
        int numFichasPorJugador=0;
        if(numJugadores == 2 ||  numJugadores == 3){
            numFichasPorJugador = 7;
        } else if (numJugadores == 4 || numJugadores ==5){
            numFichasPorJugador = 5;
        }
       
        
        switch (numJugadores){
            case 2:
                for(int i =0; i<  numFichasPorJugador; i++){
                    getFicha(fichas, jugador1);
                    getFicha(fichas, jugador2);
                }
               
                       
                System.out.print(jugador1);
                System.out.print(jugador2);
              
                break;
            case 3:
                for(int i =0; i<  numFichasPorJugador; i++){
                    getFicha(fichas, jugador1);
                    getFicha(fichas, jugador2);
                    getFicha(fichas, jugador3);
                }
                System.out.print(jugador1);
                System.out.print(jugador2);
                System.out.print(jugador3);
               
                break;
            case 4:
                for(int i =0; i<  numFichasPorJugador; i++){
                    getFicha(fichas, jugador1);
                    getFicha(fichas, jugador2);
                    getFicha(fichas, jugador3);
                    getFicha(fichas, jugador4);
                }
                System.out.print(jugador1);
                System.out.print(jugador2);
                System.out.print(jugador3);
                System.out.print(jugador4);
                break;
                
            case 5:
                for(int i =0; i<  numFichasPorJugador; i++){
                    getFicha(fichas, jugador1);
                    getFicha(fichas, jugador2);
                    getFicha(fichas, jugador3);
                    getFicha(fichas, jugador4);
                    getFicha(fichas, jugador5);
                }
                System.out.print(jugador1);
                System.out.print(jugador2);
                System.out.print(jugador3);
                System.out.print(jugador4);
                System.out.print(jugador5);
                break;
        }
        
    }

    public static boolean juega(){
        boolean gameOver =false;
        
        Scanner input = new Scanner(System.in);
        do{
        
            System.out.println("Escoja entre 2 a 5 jugadores");
            numJugadores = input.nextInt();
        
        }while(numJugadores > 5 || numJugadores < 2);
        switch(numJugadores){
            case 2:
                quienEmpieza(jugador1,jugador2);
                break;
        }
        
        if(gameOver){
            return false;
        }else {
            return true;
        }
        
    }
    
    public static Vector<String> quienEmpieza(Vector<String>j1,Vector<String> j2,Vector<String> j3,Vector<String> j4,Vector<String> j5){
        
        
        return jugador;
    }
    public static int quienEmpieza(Vector<String>j1,Vector<String> j2,Vector<String> j3){
        
        
        return jugador;
    }
    public static int quienEmpieza(Vector<String>j1,Vector<String> j2,Vector<String> j3,Vector<String> j4){
        
        
        return jugador;
    }
    public static int quienEmpieza(Vector<String>j1,Vector<String> j2){
        
        
        return jugador;
    }
    
    
    public static Vector<String> siguiente (Vector<String> jugador){
        switch (numJugadores) {
            case 2:
                if (jugador == jugador1){
                    return jugador2;
                }
                else {
                    return jugador1;
                }
            case 3:
                if (jugador == jugador1){
                    return jugador2;
                }
                else if (jugador == jugador2) {
                    return jugador3;
                }
                else {
                    return jugador1;
                }
            case 4:
                if (jugador == jugador1){
                    return jugador2;
                }
                else if (jugador == jugador2) {
                    return jugador3;
                }
                else if (jugador==jugador3){
                    return jugador4;
                }
                else {
                    return jugador1;
                }
            case 5:
                if (jugador == jugador1){
                    return jugador2;
                }
                else if (jugador == jugador2) {
                    return jugador3;
                }
                else if (jugador==jugador3){
                    return jugador4;
                }
                else if (jugador == jugador4) {
                    return jugador5;
                }
                else {
                    return jugador1;
                }
        }
        return jugador1;
    }
    
}