package tarea7judaponce_11841248;

import java.util.Date;
import java.util.Scanner;

public class Tramontana extends Carros {

    static Scanner leer = new Scanner(System.in);

    private int peso;
    private int transmision;

    public Tramontana(int peso, int transmision, Date fecha, String color, String marca, String polarizado, int Vmax, int Vgalon, int precio) {
        super(fecha, color, marca, polarizado, Vmax, Vgalon, precio);
        reviMa4(peso);
        this.transmision = transmision;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTransmision() {
        return transmision;
    }

    public void setTransmision(int transmision) {
        this.transmision = transmision;
    }

    public void reviMay(int velocidad) {
        while (velocidad <75 || velocidad > 180) {
            System.out.println(" La velocidad no debe sobrepasar los 160 km/h");
            System.out.print(" Ingrese nueva velocidad: ");
            velocidad = leer.nextInt();
            super.Vmax = velocidad;

        }

    }

    public void reviMa2(int galon) {
        while ( galon <50 || galon > 55) {
            System.out.println(" La velocidad no debe sobrepasar los 55 km/g o ser menor a 50");
            System.out.print(" Ingrese nueva velocidad: ");
            galon = leer.nextInt();
            super.Vgalon = galon;

        }

    }

    public void reviMa3(int price) {
        while (price < 800000 || price > 1000000) {
            System.out.println(" su precio de venta oscila entre Lps. 800,000 y Lps. 1,000,000");
            System.out.print(" Ingrese precio: ");
            price = leer.nextInt();
            super.precio = price;

        }

    }
    
    public void reviMa4(int peso) {
        while (peso < 1276 || peso > 1376) {
            System.out.println(" Su peso debe de estar entros los 1276 kg o los 1976 kg");
            System.out.print(" Ingrese peso: ");
            peso= leer.nextInt();
           this.peso=peso;

        }

    }

    @Override
    public String toString() {
        return super.toString() + "Tramontana{" + "peso=" + peso + ", transmision=" + transmision + '}';
    }

}
