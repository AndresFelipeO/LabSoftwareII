package Logica;

import java.util.Date;

public class ViajeIndividual extends Viaje {

    //Constructor
    public ViajeIndividual(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida,Date prmFechaLlegada) {
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
    }
    //Metodos
    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
}
