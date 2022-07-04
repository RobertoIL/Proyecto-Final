package Cliente;

public interface Ronda {
    String palabra = "";
    Jugador jugadorDibujante = null;

    default void finalizarRound(){}

    default boolean jugadorAdivina(){
        return true;
    }


}
