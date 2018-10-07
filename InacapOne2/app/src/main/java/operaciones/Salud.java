package operaciones;

public class Salud {
    //Definimos los atributos de la clase
    private String nombre;
    private int edad;
    private int peso;
    //Creamos metodos para calcular peso ideal
    public int calcularPesoIdeal(){
        return edad*2+8;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


}
