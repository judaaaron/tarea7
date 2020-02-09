package tarea7judaponce_11841248;

import java.util.Date;
import java.util.Scanner;

public class Fisker extends Carros {

    static Scanner leer = new Scanner(System.in);
    private String tipo;
    private String convertible;

    public Fisker() {
    }

    public Fisker(String tipo, String convertible, Date fecha, String color, String marca, String polarizado, int Vmax, int Vgalon, int precio) {
        super(fecha, color, marca, polarizado, Vmax, Vgalon, precio);
        this.tipo = tipo;
        this.convertible = convertible;

        reviMay(Vmax);
        reviMay(Vgalon);
        reviMa3(precio);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    public void reviMay(int velocidad) {
        while (velocidad > 165) {
            System.out.println(" La velocidad no debe sobrepasar los 160 km/h");
            System.out.print(" Ingrese nueva velocidad: ");
            velocidad = leer.nextInt();
            super.Vmax = velocidad;

        }

    }

    public void reviMa2(int galon) {
        while (galon > 40) {
            System.out.println(" La velocidad no debe sobrepasar los 55 km/g");
            System.out.print(" Ingrese nueva velocidad: ");
            galon = leer.nextInt();
            super.Vgalon = galon;

        }

    }

    public void reviMa3(int price) {
        while (price < 450000 || price > 650000) {
            System.out.println(" su precio de venta oscila entre Lps. 500,000 y Lps. 700,000");
            System.out.print(" Ingrese precio: ");
            price = leer.nextInt();
            super.precio = price;

        }

    }

    @Override
    public String toString() {
        return super.toString() + "Fisker{" + "tipo=" + tipo + ", convertible=" + convertible + '}';
    }

}
