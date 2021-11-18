/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Leonardo
 */
public class Materia {
    
    //Atributos
    private String Nombre;
    private int Codigo;
    private int Salon;
    private Docente eldocente;
    private int hinicio;
    private int duracion;
    private int dia;
    
    
    //constructor 
    public Materia() {
    }
    
    //constructor Sobrecargado//

    public Materia(String Nombre, int Codigo, int Salon,String elNombre, int Id, String Especializacion, String Genero,int hinicio,int duracion,int dia) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Salon = Salon;
        this.eldocente = new Docente(elNombre,Id,Especializacion,Genero);
    }
    
    //GET y Setter

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getSalon() {
        return Salon;
    }

    public void setSalon(int Salon) {
        this.Salon = Salon;
    }

    public Docente getEldocente() {
        return eldocente;
    }

    public void setEldocente(Docente eldocente) {
        this.eldocente = eldocente;
    }
    
    public int gethinicio() {
        return hinicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getDia() {
        return dia;
    }
    
    
        
        
}
