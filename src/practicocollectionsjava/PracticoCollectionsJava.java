/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicocollectionsjava;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class PracticoCollectionsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ArrayList<Jugadores> Tipojugadores = new ArrayList<>();
        //Set <Jugadores> Tipojugadores=new HashSet<Jugadores>();
        //LinkedList<Jugadores> Tipojugadores = new LinkedList<>();
        
        
//        Jugadores j1= new Jugadores ("Chino luna", "9", 45);
//        Jugadores j2= new Jugadores ("oso prato", "21", 35);
//        
//        
//        
//        Tipojugadores.add(j1);
//        Tipojugadores.add(j2);
        
        
//        for (Jugadores obj : Tipojugadores)
//        System.out.println(obj.getNombre());
        
        
//        for (Jugadores jugador : Tipojugadores) {
//
//            System.out.println(jugador.getNombre()+ " " + jugador.getDorsal() + " "
//            + jugador.getEdad());
//            
//        }
        
//        System.out.println(Tipojugadores);
//        
//        ListIterator<Jugadores> ite = Tipojugadores.listIterator(); 
//        
//        ite.next();
//        ite.add(j2);
//        Tipojugadores.forEach(obj -> System.out.println(obj));
        
        
        Set<Jugadores> players = new TreeSet<>(Comparator.reverseOrder());
        
        Jugadores j10= new Jugadores ("pity martinez", "10", 29);
        Jugadores j11= new Jugadores ("juan fer quintero", "8", 24);
        
        players.add(j10);
        players.add(j11);
        
        players.forEach(obj -> System.out.print(obj));
        
    }
    
    }
    

