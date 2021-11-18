/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

   
public class Registro {


    public String getMateria() {
        return materia;
    }

    public int getDias() {
        return dias;
    }

    public String getHora() {
        return hora;
    }

 

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Registro(int dia, String materia, String hora) {
        this.materia = materia;
        this.dias = dias;
        this.hora = hora;
    }

    String materia;
    int dias;
    String hora;

}
