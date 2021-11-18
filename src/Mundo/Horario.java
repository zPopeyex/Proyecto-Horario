
package Mundo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Horario {
    private Materia materias[][];
    private int numMaterias;
    public Horario(){
        
        
    }
    
    public void leerMateria(){
       
        try {
           BufferedReader br = new BufferedReader(new FileReader("./data/materias.txt"));
            StringTokenizer st = new StringTokenizer(br.readLine(),",");
            int fil = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            System.out.println(fil+","+col);
            materias = new Materia[fil][col];
            
           numMaterias = Integer.parseInt(br.readLine());
           System.out.println("NumMaterias"+numMaterias);
            for (int i = 0; i < numMaterias; i++) {
                String nombre = br.readLine();
                int hinicio = Integer.parseInt(br.readLine());
                System.out.println("HINICIO"+hinicio);
                int duracion = Integer.parseInt(br.readLine());
                System.out.println("Duracion"+duracion);
                int dia = Integer.parseInt(br.readLine());
                System.out.println("Dia:"+dia);
                int Codigo = Integer.parseInt(br.readLine());
                System.out.println("Codigo:"+Codigo);
                int Salon = Integer.parseInt(br.readLine());
                System.out.println("Salon:"+Salon);
                
                String elNombre = br.readLine();
                int Id = Integer.parseInt(br.readLine());
                String  Especializacion = br.readLine();
                String Genero = br.readLine();
                
                for (int j = hinicio; j < (hinicio+duracion); j++) {
                    
                    System.out.println("Entrando");
                    materias[j][dia] = new Materia(nombre,Codigo,Salon,elNombre,Id,Especializacion,Genero,hinicio,duracion,dia); 
                    System.out.println("Saliendo");
                }
  
               
            }
            br.close();
            
            
        }
        catch (FileNotFoundException e) {
            System.out.println("eRROR" + e);
        }
        catch (IOException e){
            System.out.println("eRROR" + e);
        }
        
        
        
        
    }   
      
    public void guardarMateria(){
        try {
            
        File archivo = new File("./data/materias.txt");
        FileWriter fw = new FileWriter(archivo,false); 
        PrintWriter guardar = new PrintWriter(fw);
        guardar.println("hola");
        guardar.println("24,6");
        guardar.println(numMaterias);
        for (int i = 0; i < numMaterias; i++) {
                for (int j = 0; j < 6  ; j++) {
                    if (materias[i][j] != null) {
                                
                    guardar.println(materias[i][j].getNombre());
                    guardar.println(materias[i][j].gethinicio());
                    guardar.println(materias[i][j].getDuracion());
                    guardar.println(materias[i][j].getDia());
                    guardar.println(materias[i][j].getCodigo());
                    guardar.println(materias[i][j].getSalon());
                    guardar.println(materias[i][j].getEldocente().getNombre());
                    guardar.println(materias[i][j].getEldocente().getId());
                    guardar.println(materias[i][j].getEldocente().getEspecializacion());
                    guardar.println(materias[i][j].getEldocente().getGenero());
                    }
                
                
                }
            
                
                
                
        
         }
        guardar.close();
            
        
        
        
            
        } catch (Exception e) {
        }
        
        
    }
    
    public void modificarHorario(){
        
        
        //mostrar los datos actuales
        //Opcion si es si 
        //
        
        
        
        
        
    }
      
        
}
    
    
            
            