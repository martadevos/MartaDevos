package MartaD;

public class Partida {
    private String nombre;
    private int edad;
    private int puntos;

    public Partida(String nombre, int edad, int puntos) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntos = puntos;
    }
    public Partida() {
        this.nombre = " ";
        this.edad = 0;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return " nombre: " + nombre +
                " edad: " + edad +
                " puntos: " + puntos;
    }
}
