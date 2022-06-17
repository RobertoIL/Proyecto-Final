package Servidor;

public class Jugador {
    private int id;
    private String nombre;
    private int puntaje;

    public Jugador(int id, String nombre, int puntaje) {
        this.id = id;
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public int actualizarPuntaje(int puntaje){
        return puntaje;
    }

    public boolean jugadorAdivina(String s){
        return false;
    }

    public boolean desconectado(String s){
        return false;
    }

}

