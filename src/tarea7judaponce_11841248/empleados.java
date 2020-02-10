package tarea7judaponce_11841248;

public class empleados extends persona{
    private int horas;
    private cliente cliente;

    public empleados() {
    }

    public empleados(int horas, cliente cliente, String nombre, int id, int edad, int altura, int peso) {
        super(nombre, id, edad, altura, peso);
        this.horas = horas;
        this.cliente = cliente;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
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
        return super.toString()+" Empleados: " + " Horas: " + horas + ", Cliente: " + cliente + '.';
    }
    
    
}
