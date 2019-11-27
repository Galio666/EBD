/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author Tomas
 */
public class Historial {
    
    int id_usuario;
    String id_pelicula;
    int visitas;
    String time;

    public Historial(String id_pelicula, int visitas, String time) {
        this.id_pelicula = id_pelicula;
        this.visitas = visitas;
        this.time = time;
    }

    public Historial(int id_usuario, String id_pelicula, int visitas, String time) {
        this.id_usuario = id_usuario;
        this.id_pelicula = id_pelicula;
        this.visitas = visitas;
        this.time = time;
    }
    
    

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the id_pelicula
     */
    public String getId_pelicula() {
        return id_pelicula;
    }

    /**
     * @param id_pelicula the id_pelicula to set
     */
    public void setId_pelicula(String id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    /**
     * @return the visitas
     */
    public int getVisitas() {
        return visitas;
    }

    /**
     * @param visitas the visitas to set
     */
    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }
    
}
