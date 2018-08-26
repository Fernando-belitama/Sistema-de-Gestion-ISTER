/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author FERNANDO
 */
public class Logica {

    public Logica() {
    }
    
    
    
    public boolean validaCedula(  String x ){
        
        int suma=0;
        int aux;
        
        if(x.length()  <= 9 || x.length() >= 11 ){
            JOptionPane.showMessageDialog(null, "ERROR");
            return false;
        }else{
            
            int a[]=new int [x.length()/2];
            int b[]=new int [(x.length()/2)];
            int c=0;
            int d=1;
            
            for (int i = 0; i < x.length()/2; i++) {
                
                a[i]= Integer.parseInt(String.valueOf(x.charAt(c)));
                c+=2;
                
                if(i < (x.length()/2)-1  ){
                    
                    b[i]= Integer.parseInt(String.valueOf(x.charAt(d)));
                    d+=2;
                }
            }
            
            for (int i = 0; i < a.length; i++) {
                
                a[i]*=2;
                
                if( a[i]>9 ){
                    a[i]=a[i]-9;
                }
                suma=suma+a[i]+b[i];
            }
            
            aux = (suma/10+1)*10;
            if ((aux - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length() - 1)))){
                return true;
            } else if (suma % 10 == 0 && x.charAt(x.length() - 1) == '0') {
                return true;
            } else {
                return false;
            }
            
//            JOptionPane.showMessageDialog(null, Arrays.toString(a));
//            JOptionPane.showMessageDialog(null, Arrays.toString(b));
           
        }
  
    }
    
    
    public void transformarMayusculas(){
       // System.out.println(miCadena.toUpperCase());
    }
    public void validaNumero( java.awt.event.KeyEvent evt ){
        
        
        char c= evt.getKeyChar();// toma la informacion que ingresa por teclado
        
        if( (c>=48 && c <=57)  ){
            
           //PERMITE EL INGRESO DE SOLO NUMEROS
           
        }else{
            evt.consume();//
        }
        
        
    }
    
    
      public void validaLetrasMayusculas(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c >= 65 && c <= 87)) {
        } else {
            evt.consume();
        }
        
    }
    
    
}
