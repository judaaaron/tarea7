package tarea7judaponce_11841248;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tarea7JudaPonce_11841248 {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Carros> carritos = new ArrayList();

    public static void main(String[] args) throws ParseException {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(" 1. Carros");
            System.out.println(" 2. Administracion");
            System.out.println(" 3. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:// carros
                    System.out.println(" 1. Crear carro");
                    System.out.println(" 2. Modificar atributos de carro");
                    System.out.println(" 3. Eliminar carro");
                    int cars = leer.nextInt();
                    switch (cars) {
                        case 1:// crar carro
                            System.out.print(" Ingrese fecha de esmamblado(dd/MM/yyyy): ");
                            String fecha = leer.next();
                            String acumDia = "",
                             acumMes = "",
                             acumAnio = "",
                             acumDay = "",
                             acumMonth = "",
                             acumYear = "";
                            String aux = "dd/MM/yyyy",
                             acum = "";
                            boolean value = false;
                            SimpleDateFormat tiempo = new SimpleDateFormat(aux);

                            while (fecha.length() != 10) {
                                System.out.println(" debe tener solo 10 caracteres");
                                System.out.print(" Ingrese fecha de vencimiento(dd/MM/yyyy): ");
                                fecha = leer.next();
                            }
                            while (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
                                System.out.println(" Entrada incorrecta");
                                System.out.print(" Ingrese fecha de vencimiento(dd/MM/yyyy): ");
                                fecha = leer.next();
                            }

                            String[] dia = fecha.split("/");
                            acumDia = dia[0];
                            acumMes = dia[1];
                            acumAnio = dia[2];
                            int diaa = Integer.parseInt(acumDia);
                            int mess = Integer.parseInt(acumMes);
                            int anioo = Integer.parseInt(acumAnio);
                            while (diaa <= 0 || diaa > 31 || mess <= 0 || mess > 12 || anioo <= 0) {
                                System.out.println(" dia o mes incorrectos");
                                System.out.print(" Ingrese fecha de vencimiento(dd/MM/yyyy): ");
                                fecha = leer.next();
                                dia = fecha.split("/");
                                acumDia = dia[0];
                                acumMes = dia[1];
                                acumAnio = dia[2];
                                diaa = Integer.parseInt(acumDia);
                                mess = Integer.parseInt(acumMes);
                                anioo = Integer.parseInt(acumAnio);

                            }
                            Date fechha = tiempo.parse(fecha);
                            Date v = new Date();
                            while ((fechha.getYear() > v.getYear())) {
                                System.out.println(" No se permiten fechas futuras a la fecha actual");
                                System.out.print(" Ingrese una nueva fecha de ensamblaje(dd/MM/yyyy): ");
                                fecha = leer.next();
                                value = false;

                                while (fecha.length() != 10) {
                                    System.out.println(" debe tener solo 10 caracteres");
                                    System.out.print(" Ingrese fecha de ensamblaje(dd/MM/yyyy): ");
                                    fecha = leer.next();
                                }
                                while (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
                                    System.out.println(" Entrada incorrecta");
                                    System.out.print(" Ingrese fecha de ensamblaje(dd/MM/yyyy): ");
                                    fecha = leer.next();
                                }

                                dia = fecha.split("/");
                                acumDia = dia[0];
                                acumMes = dia[1];
                                acumAnio = dia[2];
                                diaa = Integer.parseInt(acumDia);
                                mess = Integer.parseInt(acumMes);
                                anioo = Integer.parseInt(acumAnio);
                                while (diaa <= 0 || diaa > 31 || mess <= 0 || mess > 12 || anioo <= 0) {
                                    System.out.println(" dia o mes incorrectos");
                                    System.out.print(" Ingrese fecha de ensamblaje(dd/MM/yyyy): ");
                                    fecha = leer.next();
                                    dia = fecha.split("/");
                                    acumDia = dia[0];
                                    acumMes = dia[1];
                                    acumAnio = dia[2];
                                    diaa = Integer.parseInt(acumDia);
                                    mess = Integer.parseInt(acumMes);
                                    anioo = Integer.parseInt(acumAnio);

                                }
                                fechha = tiempo.parse(fecha);

                            }

                            System.out.print(" Ingrese color del carro: ");
                            String color = leer.next();
                            System.out.print(" Ingrese marca de llantas: ");
                            String marca = leer.next();
                            System.out.println(" Seleccione si tiene polarizado: ");
                            System.out.println(" 1. Si");
                            System.out.println(" 2. No");
                            int pol = leer.nextInt();
                            String polarizado = "";
                            switch (pol) {
                                case 1:
                                    polarizado = "Si";
                                    break;

                                case 2:
                                    polarizado = "No";
                                    break;
                                default:
                                    System.out.println(" Opcion Incorrecta");
                                    System.out.println();
                            }
                            System.out.println(" Seleccione tipo de marca de carro");
                            System.out.println(" 1. •Maybach");
                            System.out.println(" 2. •Morgan Aero 8");
                            System.out.println(" 3. •Fisker Automotive");
                            System.out.println(" 4. •Tramontana");
                            int marquitas = leer.nextInt();
                            switch (marquitas) {
                                case 1:// maybach
                                    System.out.println(" Ingrese velocidad maxima");
                                    int vmax = leer.nextInt();
                                    System.out.println(" Ingrese velocidad galones");
                                    int vgalon = leer.nextInt();
                                    System.out.println(" Ingrese precio");
                                    int precio = leer.nextInt();
                                    System.out.println(" Carro marca: •Maybach, ingresado con exito ");
                                    carritos.add(new MayBach(fechha, color, marca, polarizado, vmax, vgalon, precio));

                                    String salidass = "";
                                    for (Object o : carritos) {
                                        if (o instanceof MayBach) {
                                            salidass += " [" + carritos.indexOf(o) + "] " + o + "\n";
                                        }

                                    }
                                    System.out.println(salidass);

                                    break;

                                case 2:// morgan
                                    System.out.println("Hola");
                                    break;

                                case 3:// fisker

                                    break;

                                case 4:// tramontana

                                    break;
                                default:
                                    throw new AssertionError();
                            }

                            break;

                        case 2:// modificar carro

                            break;

                        case 3: // eliminar carro

                            break;
                        default:
                            throw new AssertionError();
                    }

                    break;

                case 2:// administracion

                    break;

                case 3:// salir
                    System.exit(3);

                    break;
                default:
                    throw new AssertionError();
            }

        }

    }

}
