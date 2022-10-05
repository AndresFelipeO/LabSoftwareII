package Logica;

import java.util.Date;

public class ViajeFamiliar extends Viaje {
    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;

    // Constructor 
    public ViajeFamiliar(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada,int prmFamilia) {
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
        familia=prmFamilia;
    }

    //getters and setters
    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    //Medos
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
}
