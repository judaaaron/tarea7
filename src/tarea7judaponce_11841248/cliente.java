package tarea7judaponce_11841248;

import java.util.ArrayList;

public class cliente extends persona{
    private int dinero;
    private ArrayList<Carros> carros;

    public cliente() {
    }

    public cliente(int dinero, ArrayList<Carros> carros, String nombre, int id, int edad, int altura, int peso) {
        super(nombre, id, edad, altura, peso);
        this.dinero = dinero;
        this.carros = carros;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Carros> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carros> carros) {
        this.carros = carros;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int getAltura() {
        return altura;
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+" Cliente:" + " Dinero: " + dinero + ", Carros: " + carros + '.';
    }
    
    
}
