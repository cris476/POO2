/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Pelicula {
    
   private String  titulo; 
   private String[]  actores ; 
   private String [] dirrectores; 
   private LocalDate  Fechasalida; 
   private String  formato; 
   
   
  public Pelicula() {}
    
  public Pelicula(String  titulo ,String[]  actores,String [] dirrectores ,LocalDate  Fechasalida ,String  formato) 
  {
    
    this.titulo = titulo; 
    this.actores = actores;     
    this.dirrectores = dirrectores;   
    this.Fechasalida = Fechasalida;
    this.formato = formato; 
       
    
  }  

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the actores
     */
    public String[] getActores() {
        return actores;
    }

    /**
     * @param actores the actores to set
     */
    public void setActores(String[] actores) {
        this.actores = actores;
    }
    /**
     * @return the dirrectores
     */
    public String[] getDirrectores() {
        return dirrectores;
    }

    /**
     * @param dirrectores the dirrectores to set
     */
    public void setDirrectores(String[] dirrectores) {
        this.dirrectores = dirrectores;
    }

    /**
     * @return the Fechasalida
     */
    public LocalDate getFechasalida() {
        return Fechasalida;
    }

    /**
     * @param Fechasalida the Fechasalida to set
     */
    public void setFechasalida(LocalDate Fechasalida) {
        this.Fechasalida = Fechasalida;
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }
  
  
     void  VisualizarPelicula (){
        
      System.out.println("titulo es " +this.titulo);
      System.out.println("los actores son :  ");    
      
      
     for ( int i = 0 ; i< this.actores.length;i++) {
         
     System.out.println(this.actores[i]);
         
     }  
        
        
    }
     
  
     public void  ModificarPelicula(String formato , LocalDate fecha)
     {
        
       this.formato=formato; 
       this.Fechasalida = fecha; 
      
        
    }
  
  
    
}
