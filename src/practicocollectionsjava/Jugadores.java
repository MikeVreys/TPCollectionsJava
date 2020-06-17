/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicocollectionsjava;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Jugadores implements Comparable<Jugadores>{

    public Jugadores(String nombre, String dorsal, Integer edad) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.edad = edad;
    }
    
    
    private String nombre;
    
    private String dorsal;
    
    private Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", dorsal=" + dorsal + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Jugadores o) {
        
        if (this.getEdad() <o.getEdad())
            
            return -1;
        
        else if (this.getEdad() >o.getEdad() )
            
            return 1;
        
        else 
            
            return 0;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.edad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugadores other = (Jugadores) obj;
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }

     
    

   
    
    
}
