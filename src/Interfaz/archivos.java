
package Interfaz;

import java.io.*;


public class archivos {
    
    public String leerMaterias(String direccion){ //direccion del archivo
        
        String texto = "";
        
        try{
            BufferedReader b = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bRead;
            while((bRead = b.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bRead + "\n"; //guardado el texto del archivo
            }
            
            texto = temp;
        b.close();
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        return texto;
        
    }
    
}
