package Cliente;

public class Jugador {
    private String nombre;
    private int id;
    private int puntaje;

    public Jugador(String nombre, int id, int puntaje) {
        this.nombre = nombre;
        this.id = id;
        this.puntaje = puntaje;
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
