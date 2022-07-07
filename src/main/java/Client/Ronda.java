package Client;

import java.io.FileNotFoundException;

public interface Ronda {
    String palabra = "";
   // Cliente jugadorDibujante = null; //Cliente pasa a ser cliente

    default void iniciarRound(){//hilo
        //escoger palabra (del gson)
        
        // iniciar tiempo
        
        
        
        
    }
    default void finalizarRound(){//pasarhilo esto es un verificador que mira el chat
    //if tiempo ==0 resetear hilo partida
    
    //if mensaje==palabra 
    
    }

    default boolean jugadorAdivina(Cliente j){//asignar rol a cliente

        
        return true;
    }
    default void generarPalabra(Juego j) throws FileNotFoundException {
        String ruta = "src/main/resources/palabras/palabras.txt";



    }


}
