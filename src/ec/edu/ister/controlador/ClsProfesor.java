/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class ClsProfesor implements Serializable{
     private int id;
 private String Cedula;
 private String nombre;
 private String apellido;
 private String FechNac;
 private String telefono;
 private String email;
 private String CargaOraria;

    public ClsProfesor() {
    }

    public ClsProfesor(int id, String Cedula, String nombre, String apellido, String FechNac, String telefono, String email, String CargaOraria) {
        this.id = id;
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechNac = FechNac;
        this.telefono = telefono;
        this.email = email;
        this.CargaOraria = CargaOraria;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the FechNac
     */
    public String getFechNac() {
        return FechNac;
    }

    /**
     * @param FechNac the FechNac to set
     */
    public void setFechNac(String FechNac) {
        this.FechNac = FechNac;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the CargaOraria
     */
    public String getCargaOraria() {
        return CargaOraria;
    }

    /**
     * @param CargaOraria the CargaOraria to set
     */
    public void setCargaOraria(String CargaOraria) {
        this.CargaOraria = CargaOraria;
    }
    
}
