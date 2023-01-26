/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2;

/**
 *
 * @author user
 */
public class CD {
    
   private static  cancion [] canciones = new cancion [10]; 
 
 private  int contador ; 
 
 
 public CD (){

 
 
 }
 
 public CD(String [] canciones) {
     
             
 }

    /**
     * @return the canciones
     */
    public static cancion[] getCanciones() {
        return canciones;
    }

    /**
     * @param aCanciones the canciones to set
     */
    public static void setCanciones(cancion[] aCanciones) {
        canciones = aCanciones;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    
    
}
