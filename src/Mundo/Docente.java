/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;


public class Docente {
    
    private String Nombre;
    private int Id;
    private String Especializacion;
    private String Genero;

    public Docente() {
    }

    public Docente(String Nombre, int Id, String Especializacion, String Genero) {
        this.Nombre = Nombre;
        this.Id = Id;
        this.Especializacion = Especializacion;
        this.Genero = Genero;
    }
//GETTER and SETTERS
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEspecializacion() {
        return Especializacion;
    }

    public void setEspecializacion(String Especializacion) {
        this.Especializacion = Especializacion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
        
    
    
    
    
    
    
    
    
    
}
