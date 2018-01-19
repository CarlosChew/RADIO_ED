
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottoalexander
 */
public class Radio {
    public String frecActual = "530"; 
    private boolean prender = false;
    public String guardar;
    private String[] memoria = new String[1];
    
    public String frecAdelante(){ 
        float newFrecActual = Float.parseFloat(frecActual);
          if (newFrecActual >= 530){
            if(newFrecActual > 1610){
                frecActual="530";
            } else {
            newFrecActual += 10;
            frecActual = newFrecActual + "";
            }
        }else{ 
            if(newFrecActual > 107.89){
                frecActual="87.90";} 
            else{
                newFrecActual += 0.2;
                frecActual = String.format("%.2f", newFrecActual);}
          }
          return frecActual; 
    }
    
    public String frecAtras(){ 
        float newFrecActual = Float.parseFloat(frecActual);
          if (newFrecActual >= 530){
            if(newFrecActual < 530){
                JOptionPane.showMessageDialog(null, "No existe más estaciones", "¿Aviso?", JOptionPane.PLAIN_MESSAGE);
            } else {
            newFrecActual -= 10;
            frecActual = newFrecActual + "";
            }
        }else{ 
            if(newFrecActual < 87.90){
                frecActual="107.89";
            } else{
                newFrecActual -= 0.2;
                frecActual = String.format("%.2f", newFrecActual);
            }
        }
          return frecActual;
    }
        
    public boolean prender(){ 
        prender = true;
        frecActual = "530"; 
        return prender;
        }
    
    public boolean apagar(){
        prender = false;
        frecActual = "Good Bye...";
        return prender;
        }
    
    public String cambioFrecuencia(){
        float newFrecActual = Float.parseFloat(frecActual);
        if (newFrecActual>=530){
            frecActual = "87.90"; 
        }
        else{
            frecActual = "530"; 
        }
        return frecActual;
        }
    
    public void guardarEstaciónActual(float frec, int pos){
        frec = Float.parseFloat(frecActual);
        String save = Float.toString(frec);
        String save1 = save + "";
        memoria[pos] = save1;
        }
    
    public String mostrarEstacion(String Guardar){
      frecActual = guardar;
      JOptionPane.showMessageDialog(null, "Su Estación es:" + String.valueOf(Guardar), "¿Que estación es?", JOptionPane.PLAIN_MESSAGE);
      return frecActual; 
       }
    
     public boolean estaPrendido(){
        if(prender = true){
        JOptionPane.showMessageDialog(null, "La radio esta encendio", "Power", JOptionPane.PLAIN_MESSAGE);
        }
        if(prender = false){
           JOptionPane.showMessageDialog(null, "La radio esta apagado", "Power", JOptionPane.PLAIN_MESSAGE); 
        }
        return prender;
        }
     
      
    public String obtenerEstado(){
        float newFrecActual = Float.parseFloat(frecActual);
        if (newFrecActual>=530){
            JOptionPane.showMessageDialog(null, "Esta oyendo F.M.", "Estado", JOptionPane.PLAIN_MESSAGE); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Esta oyendo A.M.", "Power", JOptionPane.PLAIN_MESSAGE); 
        }
        return frecActual;
        }
    
    public String obtenerEstación(String save){
        frecActual = save; 
        JOptionPane.showMessageDialog(null, "Estación Guardada"+frecActual, "Aviso", JOptionPane.PLAIN_MESSAGE);
        return frecActual; 
        }  
    
}

