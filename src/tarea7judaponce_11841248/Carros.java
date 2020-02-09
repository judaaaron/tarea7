
package tarea7judaponce_11841248;

import java.awt.Color;
import java.util.Date;


public class Carros {
    
    private Date fecha;
    private String color;
    private String marca;
    private String polarizado;
    protected int Vmax;
    protected int Vgalon;
    protected int precio;
    
    

    public Carros() {
    }

    public Carros(Date fecha, String color, String marca, String polarizado, int Vmax, int Vgalon, int precio) {
        this.fecha = fecha;
        this.color = color;
        this.marca = marca;
        this.polarizado = polarizado;
        this.Vmax = Vmax;
        this.Vgalon = Vgalon;
        this.precio = precio;
    }

   
    
    

 
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public int getVmax() {
        return Vmax;
    }

    public int getVgalon() {
        return Vgalon;
    }

    public int getPrecio() {
        return precio;
    }
    
    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPolarizado() {
        return polarizado;
    }

    public void setPolarizado(String polarizado) {
        this.polarizado = polarizado;
    }

    public void setVmax(int Vmax) {
        this.Vmax = Vmax;
    }

    public void setVgalon(int Vgalon) {
        this.Vgalon = Vgalon;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carros{" + "fecha=" + fecha + ", color=" + color + ", marca=" + marca + ", polarizado=" + polarizado + ", Vmax=" + Vmax + ", Vgalon=" + Vgalon + ", precio=" + precio + '}';
    }
    
    
     
    
}
