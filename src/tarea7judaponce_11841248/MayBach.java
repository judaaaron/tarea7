package tarea7judaponce_11841248;

import java.awt.Color;
import java.util.Date;
import java.util.Scanner;

public class MayBach extends Carros {

    static Scanner leer = new Scanner(System.in);

    public MayBach(Date fecha, String color, String marca, String polarizado, int Vmax, int Vgalon, int precio) {
        super(fecha, color, marca, polarizado, Vmax, Vgalon, precio);

        reviMay(Vmax);
        reviMay(Vgalon);
        reviMa3(precio);
    }

    public void reviMay(int velocidad) {
        while (velocidad > 160) {
            System.out.println(" La velocidad no debe sobrepasar los 160 km/h");
            System.out.print(" Ingrese nueva velocidad: ");
            velocidad = leer.nextInt();
            super.Vmax = velocidad;

        }

    }

    public void reviMa2(int galon) {
        while (galon > 55) {
            System.out.println(" La velocidad no debe sobrepasar los 55 km/g");
            System.out.print(" Ingrese nueva velocidad: ");
            galon = leer.nextInt();
            super.Vgalon = galon;

        }

    }

    public void reviMa3(int price) {
        while (price < 400000 || price > 600000) {
            System.out.println(" su precio de venta oscila entre Lps. 400,000 y Lps. 600,000");
            System.out.print(" Ingrese precio: ");
            price = leer.nextInt();
            super.precio = price;

        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
