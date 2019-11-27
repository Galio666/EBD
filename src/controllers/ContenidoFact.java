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
public class ContenidoFact {
    
    int fact_id;
    String id_titulo;
    String id_nombre;
    String plot;
    String poster;
    double rating;
    double calificacion;
    String titulo;

    public ContenidoFact(int fact_id, String id_titulo, String id_nombre, String plot, String poster, double rating, double calificacion, String titulo) {
        this.fact_id = fact_id;
        this.id_titulo = id_titulo;
        this.id_nombre = id_nombre;
        this.plot = plot;
        this.poster = poster;
        this.rating = rating;
        this.calificacion = calificacion;
        this.titulo=titulo;
    }

    public ContenidoFact(String id_titulo, String plot, String poster, String titulo) {
        this.id_titulo = id_titulo;
        this.plot = plot;
        this.poster = poster;
        this.titulo = titulo;
    }
    
    
    
    

    /**
     * @return the fact_id
     */
    public int getFact_id() {
        return fact_id;
    }

    /**
     * @param fact_id the fact_id to set
     */
    public void setFact_id(int fact_id) {
        this.fact_id = fact_id;
    }

    /**
     * @return the id_titulo
     */
    public String getId_titulo() {
        return id_titulo;
    }

    /**
     * @param id_titulo the id_titulo to set
     */
    public void setId_titulo(String id_titulo) {
        this.id_titulo = id_titulo;
    }

    /**
     * @return the id_nombre
     */
    public String getId_nombre() {
        return id_nombre;
    }

    /**
     * @param id_nombre the id_nombre to set
     */
    public void setId_nombre(String id_nombre) {
        this.id_nombre = id_nombre;
    }

    /**
     * @return the plot
     */
    public String getPlot() {
        return plot;
    }

    /**
     * @param plot the plot to set
     */
    public void setPlot(String plot) {
        this.plot = plot;
    }

    /**
     * @return the poster
     */
    public String getPoster() {
        return poster;
    }

    /**
     * @param poster the poster to set
     */
    public void setPoster(String poster) {
        this.poster = poster;
    }

    /**
     * @return the rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * @return the calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
}
