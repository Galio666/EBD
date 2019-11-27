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
public class Pelicula {
    
     String id_titulo;
     String tipo;
     String titulo;
     String titulo_original;
     String clasificacion;
     int añoInicio;
     int añoFinalizacion;
     int minDuracion;
     String generos;

    public Pelicula(String id_titulo, String tipo, String titulo, String titulo_original, String clasificacion, int añoInicio, int añoFinalizacion, int minDuracion, String generos) {
        this.id_titulo = id_titulo;
        this.tipo = tipo;
        this.titulo = titulo;
        this.titulo_original = titulo_original;
        this.clasificacion = clasificacion;
        this.añoInicio = añoInicio;
        this.añoFinalizacion = añoFinalizacion;
        this.minDuracion = minDuracion;
        this.generos = generos;
    }

    public Pelicula(String id_titulo, String tipo, String titulo, int minDuracion, String generos) {
        this.id_titulo = id_titulo;
        this.tipo = tipo;
        this.titulo = titulo;
        this.minDuracion = minDuracion;
        this.generos = generos;
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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the titulo_original
     */
    public String getTitulo_original() {
        return titulo_original;
    }

    /**
     * @param titulo_original the titulo_original to set
     */
    public void setTitulo_original(String titulo_original) {
        this.titulo_original = titulo_original;
    }

    /**
     * @return the clasificacion
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the añoInicio
     */
    public int getAñoInicio() {
        return añoInicio;
    }

    /**
     * @param añoInicio the añoInicio to set
     */
    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }

    /**
     * @return the añoFinalizacion
     */
    public int getAñoFinalizacion() {
        return añoFinalizacion;
    }

    /**
     * @param añoFinalizacion the añoFinalizacion to set
     */
    public void setAñoFinalizacion(int añoFinalizacion) {
        this.añoFinalizacion = añoFinalizacion;
    }

    /**
     * @return the minDuracion
     */
    public int getMinDuracion() {
        return minDuracion;
    }

    /**
     * @param minDuracion the minDuracion to set
     */
    public void setMinDuracion(int minDuracion) {
        this.minDuracion = minDuracion;
    }

    /**
     * @return the generos
     */
    public String getGeneros() {
        return generos;
    }

    /**
     * @param generos the generos to set
     */
    public void setGeneros(String generos) {
        this.generos = generos;
    }
    
    
    
    
    
}
