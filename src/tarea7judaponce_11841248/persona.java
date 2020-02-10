package tarea7judaponce_11841248;

public class persona {
    protected String nombre;
    protected int id;
    protected int edad;
    protected int altura;
    protected int peso;

    public persona() {
    }

    public persona(String nombre, int id, int edad, int altura, int peso) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona: " + "nombre: " + nombre + ", ID: " + id + ", Edad: " + edad + ", Altura: " + altura + ", Peso: " + peso + '}';
    }
    
    
}
