

package ec.edu.ister.controlador;




import ec.edu.ister.vista.EstudiantesAdmin.EliminarEstudiante;
import ec.edu.ister.vista.EstudiantesAdmin.EditarEstudiante;
import ec.edu.ister.vista.EstudiantesAdmin.IngresoEstudiante;
import ec.edu.ister.vista.Administrador;
import ec.edu.ister.vista.DocenteControl;
import ec.edu.ister.vista.EstudianteControl;
import ec.edu.ister.vista.docenteAdmin.EditarDocente;
import ec.edu.ister.vista.docenteAdmin.EliminarDocente;

import ec.edu.ister.vista.Inicio;
import ec.edu.ister.vista.docenteAdmin.IngresoDocente;
import ec.edu.ister.vista.Login;
import ec.edu.ister.vista.docenteAdmin.MateriaAdmin.IngresoMateria;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Coordinador {

   
    Login login = new Login(this);
    Administrador administrador = new Administrador(this);
    Inicio inicio = new Inicio(this);
    
    
    IngresoDocente ingresoDocente=new IngresoDocente(this);
    EditarDocente editarDocente=new EditarDocente(this);
    EliminarDocente eliminarDocente=new EliminarDocente(this);
    
    IngresoEstudiante ingresoEstudiante=new IngresoEstudiante(this);
    EditarEstudiante editarEstudiante=new EditarEstudiante(this);
    EliminarEstudiante eliminarEstudiante=new EliminarEstudiante(this);
    
    
    DocenteControl docenteControl=new DocenteControl(this);
    EstudianteControl estudianteControl=new EstudianteControl(this);
    
    IngresoMateria ingresoMateria=new IngresoMateria(this);
    
    
    
    
  //************************************************************************************************* 
    public void showInicio() {
        inicio.setSize(1500, 1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(inicio);
        inicio.setVisible(true);
        administrador.escritorio.repaint();
    }
 public void showAdministrador() {
        //iniciaReloj(inicioAdministrador.lblReloj);
        administrador.setVisible(true);
    }
  public void showLogin() {
        //iniciaReloj(login.lblReloj);
        login.setVisible(true);
    }

    public void hideLogin() {
        login.setVisible(false);
    }
      public void hideAdministrador() {
        administrador.setVisible(false);
    }
      
    public void hideInicio(){
        inicio.setVisible(false);
    }  
    
    
    //DOCENTES***************************************************************************
    
    
    public void showIngresoDocente(){
        
        ingresoDocente.setSize(1500, 1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(ingresoDocente);
        ingresoDocente.setVisible(true);
        administrador.escritorio.repaint();
    }
     public void VenIngreDocente(){
          ingresoDocente.obtenerId();
       ingresoDocente.actualizarTabla();
    }
    public void hideIngresoDocente(){
        ingresoDocente.setVisible(false);
    }
    
    public void showEditarDocente(){
        editarDocente.setSize(1500, 1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(editarDocente);
        editarDocente.setVisible(true);
        administrador.escritorio.repaint();
                
    }
     public void VenEditDocente(){
       editarDocente.obtenerId();
      editarDocente.eliminar();
      editarDocente.actualizarTabla();
    }
    public void hideEditarDocente(){
        editarDocente.setVisible(false);
    }
    
    public void showEliminarDocente(){
       eliminarDocente.setSize(1500, 1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(eliminarDocente);
        eliminarDocente.setVisible(true);
        administrador.escritorio.repaint(); 
    }
    public void VenElimDocente(){
        eliminarDocente.obtenerId();
       eliminarDocente.eliminar();
      eliminarDocente.actualizarTabla();
    }
     public void hideEliminarDocente(){
        eliminarDocente.setVisible(false);
    }
     
     
  //ESTUDIANTES**************************************************************************   
     
    public void showIngresoEstudiante(){
        
        ingresoEstudiante.setSize(1500, 1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(ingresoEstudiante);
        ingresoEstudiante.setVisible(true);
        administrador.escritorio.repaint();
    }
    
    public void hideIngresoEstudiante(){
        ingresoEstudiante.setVisible(false);
    }
    
    public void showEditarEstudiante(){
        editarEstudiante.setSize(1500, 1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(editarEstudiante);
        editarEstudiante.setVisible(true);
        administrador.escritorio.repaint();
                
    }
    public void hideEditarEstudiante(){
        editarEstudiante.setVisible(false);
    }
    
    public void showEliminarEstudiante(){
       eliminarEstudiante.setSize(1500, 1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(eliminarEstudiante);
        eliminarEstudiante.setVisible(true);
        administrador.escritorio.repaint(); 
    }
     public void hideEliminarEstudiante(){
        eliminarEstudiante.setVisible(false);
    } 
    //estos tres metodos ayudan actulizar la tabla de estudiante
     public void VenEditEstudiante(){
       editarEstudiante.obtenerId();
      editarEstudiante.eliminar();
      editarEstudiante.actualizarTabla();
    }
    public void VenElimEstudiante(){
       eliminarEstudiante.obtenerId();
      eliminarEstudiante.eliminar();
      eliminarEstudiante.actualizarTabla();
    }
    public void VenIngreEstudiante(){
       ingresoEstudiante.obtenerId();
      ingresoEstudiante.eliminar();
      ingresoEstudiante.actualizarTabla();
    }

}
