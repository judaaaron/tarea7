package tarea7judaponce_11841248;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tarea7JudaPonce_11841248 {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Carros> carritos = new ArrayList();
    static ArrayList<persona> personal = new ArrayList();

    public static void main(String[] args) throws ParseException {
        String nombre;
        int id, edad, altura, peso, horas, dinero;
        
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(" 1. Carros");
            System.out.println(" 2. Administracion");
            System.out.println(" 3. Eliminar");
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
                                    System.out.println(" Ingrese velocidad maxima");
                                    vmax = leer.nextInt();
                                    System.out.println(" Ingrese velocidad galones");
                                    vgalon = leer.nextInt();
                                    System.out.println(" Ingrese precio");
                                    precio = leer.nextInt();
                                    System.out.println(" Seleccione si :s cabina unica o doble ");
                                    System.out.println(" 1. Si");
                                    System.out.println(" 2. No");
                                    pol = leer.nextInt();
                                    String cab = "";
                                    switch (pol) {
                                        case 1:
                                            cab = "Si";
                                            break;

                                        case 2:
                                            polarizado = "No";
                                            break;
                                        default:
                                            System.out.println(" Opcion Incorrecta");
                                            System.out.println();
                                    }
                                    System.out.println(" Seleccione si es convertible: ");
                                    System.out.println(" 1. Si");
                                    System.out.println(" 2. No");
                                    pol = leer.nextInt();
                                    String conver = "";
                                    switch (pol) {
                                        case 1:
                                            conver = "Si";
                                            break;

                                        case 2:
                                            conver = "No";
                                            break;
                                        default:
                                            System.out.println(" Opcion Incorrecta");
                                            System.out.println();
                                    }

                                    System.out.println(" Carro marca: •Morgan Aero 8, ingresado con exito ");
                                    carritos.add(new MorganAero8(cab, conver, fechha, color, marca, polarizado, vmax, vgalon, precio));

                                    salidass = "";
                                    for (Object o : carritos) {
                                        if (o instanceof MorganAero8) {
                                            salidass += " [" + carritos.indexOf(o) + "] " + o + "\n";
                                        }

                                    }
                                    System.out.println(salidass);
                                    break;

                                case 3:// fisker
                                    System.out.println(" Ingrese velocidad maxima");
                                    vmax = leer.nextInt();
                                    System.out.println(" Ingrese velocidad galones");
                                    vgalon = leer.nextInt();
                                    System.out.println(" Ingrese precio");
                                    precio = leer.nextInt();
                                    System.out.println(" Seleccione si es cabina unica o doble ");
                                    System.out.println(" 1. Si");
                                    System.out.println(" 2. No");
                                    pol = leer.nextInt();
                                    String cabi = "";
                                    switch (pol) {
                                        case 1:
                                            cab = "Si";
                                            break;

                                        case 2:
                                            polarizado = "No";
                                            break;
                                        default:
                                            System.out.println(" Opcion Incorrecta");
                                            System.out.println();
                                    }
                                    System.out.println(" Seleccione si es camioneta: ");
                                    System.out.println(" 1. Si");
                                    System.out.println(" 2. No");
                                    pol = leer.nextInt();
                                    String converr = "";
                                    switch (pol) {
                                        case 1:
                                            conver = "Si";
                                            break;

                                        case 2:
                                            conver = "No";
                                            break;
                                        default:
                                            System.out.println(" Opcion Incorrecta");
                                            System.out.println();
                                    }

                                    System.out.println(" Carro marca: •Fisker, ingresado con exito ");
                                    carritos.add(new Fisker(cabi, converr, fechha, color, marca, polarizado, vmax, vgalon, precio));

                                    salidass = "";
                                    for (Object o : carritos) {
                                        if (o instanceof Fisker) {
                                            salidass += " [" + carritos.indexOf(o) + "] " + o + "\n";
                                        }

                                    }
                                    System.out.println(salidass);

                                    break;

                                case 4:// tramontana

                                    break;
                                default:
                                    throw new AssertionError();
                            }

                            break;

                        case 2:// modificar carro
                            
                        case 3: // eliminar carro

                            break;
                        default:
                            throw new AssertionError();
                    }

                    break;

                case 2:// administracion
                    System.out.println("1) Crear empleado");
                    System.out.println("2) Crear cliente");
                    System.out.print("Ingrese la opcion que desea: ");
                    int per = leer.nextInt();
                    
                    System.out.print("Ingrese el nombre: ");
                    nombre = leer.next();
                    
                    System.out.print("Ingrese el ID: ");
                    id = leer.nextInt();
                    
                    System.out.print("Ingrese la edad: ");
                    edad = leer.nextInt();
                    while(edad<18){
                        System.out.println("Debe de ser mayor de 17 años. Ingrese la edad: ");
                        edad = leer.nextInt();
                    }
                    
                    System.out.print("Ingrese la altura en cm: ");
                    altura = leer.nextInt();
                    while(altura<155){
                        System.out.println("Debe ser mayor a 154. Ingrese la altura en cm: ");
                        altura = leer.nextInt();
                    }
                    
                    System.out.print("Ingrese el peso: ");
                    peso = leer.nextInt();
                    while(peso<120){
                        System.out.println("El peso debe ser mayor a 119. Ingrese el peso: ");
                        peso = leer.nextInt();
                    }
                    
                    switch (per) {
                        case 1:
                            System.out.print("Ingrese el numero de horas que trabaja: ");
                            horas = leer.nextInt();
                            
                            personal.add(new empleados(horas, null, nombre, id, edad, altura, peso));
                            break;
                        case 2:
                            System.out.print("Ingrese el dinero que lleva consigo: ");
                            dinero = leer.nextInt();
                            
                            personal.add(new cliente(dinero, null, nombre, id, edad, altura, peso));
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
                    
                    for (int i = 0; i < personal.size(); i++) {
                        int f = i+1;
                        System.out.println(f+") "+personal.get(i));
                    }
                    break;
                case 3://eliminar
                    System.out.println("1) Carros");
                    System.out.println("2) Personal");
                    System.out.print("Ingrese la opcion que desea: ");
                    int eliminar = leer.nextInt();
                    
                    switch (eliminar) {
                        case 1:
                            for (int i = 0; i < carritos.size(); i++) {
                                int n = i+1;
                                System.out.println(n+") "+carritos.get(i));
                            }
                            
                            System.out.print("Elija la opcion que desea: ");
                            int n = leer.nextInt();
                            
                            carritos.remove(n);
                            break;
                        case 2:
                            for (int i = 0; i < personal.size(); i++) {
                                n = i+1;
                                System.out.println(n+") "+personal.get(i));
                            }
                            
                            System.out.print("Elija la opcion que desea: ");
                            n = leer.nextInt();
                            
                            personal.remove(n);
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
                    break;
                case 4:// salir
                    System.exit(3);

                    break;
                default:
                    throw new AssertionError();
            }

        }

    }

}
