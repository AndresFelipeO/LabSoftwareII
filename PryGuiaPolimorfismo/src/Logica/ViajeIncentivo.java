package Logica;

import java.util.Date;

public class ViajeIncentivo extends Viaje {
    /**
     * Empresa que patrocina el viaje al empleado
     */
    private String empresa;

    //Constructor
    public ViajeIncentivo(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida,Date prmFechaLlegada,String prmEmpresa) {
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
        empresa=prmEmpresa;
    }
    
    //getters and setters
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    //Metodos
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }
}
