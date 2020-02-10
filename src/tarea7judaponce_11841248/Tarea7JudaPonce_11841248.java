package tarea7judaponce_11841248;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tarea7JudaPonce_11841248 {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Carros> carritos = new ArrayList();
    static ArrayList<Carros> listacarro = new ArrayList();
    static ArrayList<persona> personal = new ArrayList();

    public static void main(String[] args) throws ParseException {
        String nombre;
        int id, edad, altura, peso, horas, dinero;

        carritos.add(new MayBach(null, "Verde", "Firestone", "Si", 160, 155, 400000));
        personal.add(new empleados(8, null, "Julio", 835, 22, 170, 150));
        personal.add(new cliente(1000000, listacarro, "Paula", 195, 28, 150, 127));

        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(" 1. Carros");
            System.out.println(" 2. Administracion");
            System.out.println(" 3. Eliminar");
            System.out.println(" 4. Simulacion");
            System.out.println(" 5. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:// carros
                    System.out.println(" 1. Crear carro");
                    System.out.println(" 2. Modificar atributos de carro");
                    System.out.print(" Elija la opcion que desea: ");
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
                            for (int i = 0; i < carritos.size(); i++) {
                                int n = i + 1;
                                System.out.println(n + ") " + carritos.get(i));
                            }

                            System.out.print("Ingrese el indice del carro que desea modificar: ");
                            int indice = leer.nextInt();

                            System.out.println("1) Fecha");
                            System.out.println("2) Color");
                            System.out.println("3) Marca");
                            System.out.println("4) Polarizado");
                            System.out.println("5) Velocidad maxima");
                            System.out.println("6) Recorrido ");
                            System.out.println("7) Precio ");
                            System.out.print("Ingrese la opcion que desea: ");
                            int op = leer.nextInt();
                            switch (op) {
                                case 1://modificar fecha
                                    System.out.print(" Ingrese fecha de esmamblado(dd/MM/yyyy): ");
                                    fecha = leer.next();
                                    acumDia = "";
                                    acumMes = "";
                                    acumAnio = "";
                                    acumDay = "";
                                    acumMonth = "";
                                    acumYear = "";
                                    aux = "dd/MM/yyyy";
                                    acum = "";
                                    value = false;
                                    tiempo = new SimpleDateFormat(aux);

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

                                    dia = fecha.split("/");
                                    acumDia = dia[0];
                                    acumMes = dia[1];
                                    acumAnio = dia[2];
                                    diaa = Integer.parseInt(acumDia);
                                    mess = Integer.parseInt(acumMes);
                                    anioo = Integer.parseInt(acumAnio);
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
                                    fechha = tiempo.parse(fecha);
                                    v = new Date();
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
                                    carritos.get(indice).setFecha(fechha);
                                    break;
                                case 2://modificar color
                                    System.out.print(" Ingrese color del carro: ");
                                    color = leer.next();
                                    carritos.get(indice).setColor(color);
                                    break;
                                case 3://modificar marca de llanta
                                    System.out.print(" Ingrese marca de llantas: ");
                                    marca = leer.next();
                                    carritos.get(indice).setMarca(marca);

                                    break;
                                case 4://modificar polarizado
                                    System.out.println(" Seleccione si tiene polarizado: ");
                                    System.out.println(" 1. Si");
                                    System.out.println(" 2. No");
                                    pol = leer.nextInt();
                                    polarizado = "";
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
                                    carritos.get(indice).setPolarizado(polarizado);

                                    break;
                                default:
                                    System.out.println("Opcion incorrecta");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }

                    break;

                case 2:// administracion
                    System.out.println("1) Crear empleado");
                    System.out.println("2) Crear cliente");
                    System.out.println("3) Modificar persona");
                    System.out.print("Ingrese la opcion que desea: ");
                    int per = leer.nextInt();

                    if (per == 3) {
                        System.out.println(" que desea modificar ");
                        System.out.println(" 1. nombre");
                        System.out.println(" 2. id");
                        System.out.println(" 3. edad");
                        System.out.println(" 4. altura");
                        System.out.println(" 5. peso");
                        int modificarAtributitos = leer.nextInt();
                        String salidass = "";
                        for (Object o : personal) {

                            salidass += " [" + personal.indexOf(o) + "] " + o + "\n";

                        }
                        System.out.println(salidass);
                        switch (modificarAtributitos) {
                            case 1://nombre
                                System.out.print(" Escoja la posicion: ");
                                int posi = leer.nextInt();
                                System.out.print(" Ingrese nombre: ");
                                String newName = leer.next();
                                personal.get(posi).setNombre(newName);
                                System.out.println(" Nombre modificado con exito");
                                System.out.println();

                                break;

                            case 2:// id
                                System.out.print(" Escoja la posicion: ");
                                posi = leer.nextInt();
                                System.out.print(" Ingrese id: ");
                                int newId = leer.nextInt();
                                personal.get(posi).setId(newId);
                                System.out.println(" Id modificado con exito");
                                System.out.println();

                                break;

                            case 3://edad
                                System.out.print(" Escoja la posicion: ");
                                posi = leer.nextInt();
                                System.out.print(" Ingrese edad: ");
                                int newEdad = leer.nextInt();
                                personal.get(posi).setEdad(newEdad);
                                System.out.println(" edad modificado con exito");
                                System.out.println();

                                break;

                            case 4://altura
                                System.out.print(" Escoja la posicion: ");
                                posi = leer.nextInt();
                                System.out.print(" Ingrese altura: ");
                                int newAltura = leer.nextInt();
                                personal.get(posi).setAltura(newAltura);
                                System.out.println(" altura modificado con exito");
                                System.out.println();

                                break;

                            case 5:// peso
                                System.out.print(" Escoja la posicion: ");
                                posi = leer.nextInt();
                                System.out.print(" Ingrese peso: ");
                                int newPeso = leer.nextInt();
                                personal.get(posi).setPeso(newPeso);
                                System.out.println(" peso modificado con exito");
                                System.out.println();

                                break;

                            default:
                                System.out.println(" opcion incorrecta");
                                System.out.println();
                        }

                    }
                    System.out.print("Ingrese el nombre: ");
                    nombre = leer.next();

                    System.out.print("Ingrese el ID: ");
                    id = leer.nextInt();

                    System.out.print("Ingrese la edad: ");
                    edad = leer.nextInt();
                    while (edad < 18) {
                        System.out.println("Debe de ser mayor de 17 años. Ingrese la edad: ");
                        edad = leer.nextInt();
                    }

                    System.out.print("Ingrese la altura en cm: ");
                    altura = leer.nextInt();
                    while (altura < 155) {
                        System.out.println("Debe ser mayor a 154. Ingrese la altura en cm: ");
                        altura = leer.nextInt();
                    }

                    System.out.print("Ingrese el peso: ");
                    peso = leer.nextInt();
                    while (peso < 120) {
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

                            personal.add(new cliente(dinero, listacarro, nombre, id, edad, altura, peso));
                            break;
                        case 3:// modificar persona

                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }

                    for (int i = 0; i < personal.size(); i++) {
                        int f = i + 1;
                        System.out.println(f + ") " + personal.get(i));
                    }
                    break;
                case 3://eliminar
                    System.out.println("1) Carros");
                    System.out.println("2) Personal");
                    System.out.print("Ingrese la opcion que desea: ");
                    int eliminar = leer.nextInt();

                    switch (eliminar) {
                        case 1:
                            if (carritos.size() == 0) {
                                System.out.println("No hay carros");
                                break;
                            }
                            for (int i = 0; i < carritos.size(); i++) {
                                int n = i + 1;
                                System.out.println(n + ") " + carritos.get(i));
                            }

                            System.out.print("Elija la opcion que desea: ");
                            int n = leer.nextInt();
                            n--;
                            while (n > carritos.size() - 1) {
                                System.out.println("No existe esa posicion");
                                System.out.print("Elija la opcion que desea: ");
                                n = leer.nextInt();
                                n--;
                            }
                            carritos.remove(n);
                            break;
                        case 2:
                            if (personal.size() == 0) {
                                System.out.println("No hay personal");
                                break;
                            }
                            for (int i = 0; i < personal.size(); i++) {
                                n = i + 1;
                                System.out.println(n + ") " + personal.get(i));
                            }

                            System.out.print("Elija la opcion que desea: ");
                            n = leer.nextInt();
                            n--;
                            while (n > personal.size() - 1) {
                                System.out.println("No existe esa posicion");
                                System.out.print("Elija la opcion que desea: ");
                                n = leer.nextInt();
                                n--;
                            }

                            personal.remove(n);
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
                    break;
                case 4:
                    simular();

                    System.out.println("");
                    System.out.println("Carros");
                    for (int i = 0; i < carritos.size(); i++) {
                        int n = i + 1;
                        System.out.println(n + ") " + carritos.get(i));
                    }

                    System.out.println("");
                    System.out.println("Personal");
                    for (int i = 0; i < personal.size(); i++) {
                        int n = i + 1;
                        System.out.println(n + ") " + personal.get(i));
                    }
                    break;
                case 5:// salir
                    System.exit(3);

                    break;
                default:
                    throw new AssertionError();
            }

        }

    }

    public static void simular() {
        int con = 0;
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i) instanceof cliente) {
                con++;
            }
        }
        for (int l = 0; l < con; l++) {

            System.out.println("");
            int n;
            for (int i = 0; i < personal.size(); i++) {
                n = 1 + i;
                if (personal.get(i) instanceof cliente) {
                    System.out.println(n + ") " + personal.get(i));
                }
            }
            System.out.print("Elija al cliente: ");
            int eleccioncliente = leer.nextInt();
            eleccioncliente--;

            System.out.println("");
            for (int i = 0; i < personal.size(); i++) {
                if (personal.get(i) instanceof empleados) {
                    if (((empleados) personal.get(i)).getCliente() == null) {
                        ((empleados) personal.get(i)).setCliente(((cliente) personal.get(eleccioncliente)));
                        System.out.println("El cliente " + personal.get(eleccioncliente).getNombre() + " lo atenderá " + personal.get(i).getNombre());

                        System.out.println("");
                        System.out.println("Carros");
                        for (int r = 0; r < carritos.size(); r++) {
                            int o = r + 1;
                            System.out.println(o + ") " + carritos.get(r));
                        }

                        System.out.print("Elija el carro a comprar: ");
                        int carro = leer.nextInt();
                        carro--;

                        System.out.println(carritos.get(carro));

                        ((cliente) personal.get(eleccioncliente)).getCarros().add(carritos.get(carro));

                        System.out.println("El cliente compró el carro " + carritos.get(carro));

                    }
                }
            }

            System.out.println("");
        }
    }

}
