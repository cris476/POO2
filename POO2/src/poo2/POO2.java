/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class POO2 {

    /**
     * @param args the command line arguments
     */
       static  Pelicula [] ListaPeliculas = new Pelicula [10]; 
          
       static int contador =0; 
    
    public static boolean InsertarPelicula(String titulo  ,String[]  actores,String [] dirrectores ,LocalDate  Fechasalida ,String  formato){

       boolean resultado = false ; 
       
         
      Pelicula nuevapelicula = new Pelicula(titulo ,actores , dirrectores,Fechasalida ,formato);
      
      if(contador < 10){
          
      ListaPeliculas [contador] = nuevapelicula;
      
      contador++; 
      
      resultado =true; 
          
      }
      
      return resultado; 
        
    }
    
    
     public static  boolean ModificarPelicula ( String titulo , String formato , LocalDate fecha){
         
        Pelicula Peliculabuscar = null ; 
        boolean  resultado = false; 
        for( int  i = 0 ;  i < contador ; i++){
            
            if(ListaPeliculas[i].getTitulo().equals(titulo))
            {
                
                Peliculabuscar = ListaPeliculas[i];
            }
            
            if(Peliculabuscar != null)
            {
            Peliculabuscar.ModificarPelicula(formato , fecha) ; 
             
            resultado = true;
                
            }
            
             
            
            
        }
        
         return resultado;
         
     }
    
     
     public static boolean  Borrarpelicula(String titulo){
         
         boolean resultado =false;  
         for(int i = 0 ; i < contador ;  i++)
         {
         if(ListaPeliculas[i].getTitulo().equals(titulo) )
         {
             ListaPeliculas[i] = null; 
             
             for( int  j=i; j<contador; j++ )
             {
             
               ListaPeliculas[j] = ListaPeliculas[j+1]  ;
             }  
              resultado = true ; 
              contador--; 
              
             
         }   
         
         }
         
         return resultado; 
         
     }
     
     
     public static void  Mostrarpelicula(String titulo)
     {
         
        
         for(int i = 0 ; i < contador ;  i++)
         {
            if(ListaPeliculas[i].getTitulo().equals(titulo) )
            {
                ListaPeliculas[i].VisualizarPelicula();
            }
         }
     }  
    
     
     
     
     
    public static void main(String[] args)  throws Exception {
        // TODO code application logic here
       
         String titulo = "titanic"; 
         String [] actores = {"Dicaprio" , "marzo"}; 
         String [] Dirrectores = {"pere" , "poeto"}; 
         String formato = "DVD"; 
         LocalDate  fecha = LocalDate.now(); 
         
          if(InsertarPelicula(titulo , actores ,Dirrectores ,fecha ,formato)){
              
           System.out.println("Pelicula Insertada");   
              
          } 
          else
          {
                 System.out.println("error");    
              
          }
         
        
        Mostrarpelicula("titanic"); 
        
        
        
         String titulo2 = "titanicoo"; 
         String [] actores2 = {"Dicapo" , "mo"}; 
         String [] Dirrectores2 = {"p22ere" , "po22eto"}; 
         String formato2 = "DV3D"; 
         LocalDate  fecha2 = LocalDate.now(); 
         
         
         if(Borrarpelicula("titanicoo" )){
              
           System.out.println("Pelicula borrada");   
              
          } 
         else
         {
              System.out.println("error");   
         }
        
        
        
        
        
    }
    
}
