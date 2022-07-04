package Client;

public interface Ronda {
    String palabra = "";
   // Jugador jugadorDibujante = null; //Jugador pasa a ser cliente 

    default void iniciarRound(){//hilo
        //escoger palabra (del gson)
        
        // iniciar tiempo
        
        
        
        
    }
    default void finalizarRound(){//pasarhilo esto es un verificador que mira el chat
    //if tiempo ==0 resetear hilo partida
    
    //if mensaje==palabra 
    
    }

    default boolean jugadorAdivina(){//asignar rol a cliente
        
        
        return true;
    }


}
