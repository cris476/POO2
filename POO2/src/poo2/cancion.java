/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2;

/** 
 *
 * @author user
 */
public class cancion {
    
 private String  titulo  ; 
 
 private String autor ;  
 
    
 public cancion (){}
 
 public cancion(String titulo , String autor ){
     
    this.autor = autor ; 
    this.titulo = titulo; 
     
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
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}
