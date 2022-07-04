package Client;

public class Jugador {
    private String nombre;
    private int id;
    private int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
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

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void actualizarPuntaje(Jugador j, int puntaje){
        j.setPuntaje(j.puntaje + puntaje);
    }


}
