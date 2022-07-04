package server;

public class Jugador {
    private String nombre;
    private int rol;
    private int puntaje;

    public Jugador(String nombre, int rol, int puntaje) {
        this.nombre = nombre;
        this.rol = rol;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRol() {
        return rol;
    }

    public int getPuntaje() {
        return puntaje;
    }
}
