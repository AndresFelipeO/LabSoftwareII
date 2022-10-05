package Logica;

import java.util.Date;

public class ViajeTodoIncluido extends Viaje {
    
    // Constructores
    public ViajeTodoIncluido(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida,Date prmFechaLlegada) {
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
    }

    //Metodos
    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
    // No se sobreescribe cualquierMetodo2()
}
