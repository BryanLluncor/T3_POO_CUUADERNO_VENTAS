/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author brall
 */
public class Prenda extends Modelo implements Venta,Color,Talla
 
{
    private String temporada;
    private String marca;

    /**
     * @return the temporada
     */
    public String getTemporada() {
        return temporada;
    }

    /**
     * @param temporada the temporada to set
     */
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
      @Override
    public String getModelo(){
        return marca + " | " + temporada; 
    } 
    @Override
    public void getprecio()
    {
    
    
    }
    @Override
    public void monto_total()
    {
    
    
    }
    @Override
    public void getcolor()
    {
    
    
    }
    @Override
    public void gettalla()
    {
    
    
    }
    
        
}
