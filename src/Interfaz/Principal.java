
package Interfaz;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Principal {
    public static void main(String[] args) {
        Marco m= new Marco(); m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco extends JFrame{
    public Marco(){
        
        Toolkit t= Toolkit.getDefaultToolkit();
        Dimension d= t.getScreenSize();
        int alto= d.height;
        int ancho= d.width;
        
        setBounds(ancho/4, alto/4, ancho/2, alto/2);
        setResizable(false);
        
        add(new Lamina());
    }
}

class Lamina extends JPanel{
    
    private JButton consultar;
    private JButton modificar;
    private JButton cargarReporte;
    private JButton leerMaterias;
    
    public Lamina(){
        
        consultar= new JButton("Consultar");
        modificar= new JButton("Modificar");
        cargarReporte= new JButton("Cargar reporte");
        leerMaterias= new JButton("Lo que lei");
        
        leerMaterias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            archivos a = new archivos();
            System.out.println(a.leerMaterias("C:\\Users\\stven\\Documents\\ProyectoHorario\\src\\data\\materias.txt"));
                
                

                
                
                
            }
        });
        
        cargarReporte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    File entrada2= new File(".\\src\\data\\pruebita.txt");
            
                    Desktop.getDesktop().open(entrada2);
            
                    } catch (IOException ie) {
                        JOptionPane.showMessageDialog(null,ie.toString());
                    }catch(IllegalArgumentException il){
                        JOptionPane.showMessageDialog(null,il.toString());
                    }
            }
        });
        
        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Este modifica el archivo");
            }
        });
        
        consultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Este carga reporte");
            }
        });
        
        add(consultar);
        add(modificar);
        add(cargarReporte);
        add(leerMaterias);
        
        
    }
}
