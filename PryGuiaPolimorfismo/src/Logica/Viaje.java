package Logica;
import java.lang.reflect.Constructor;
import java.util.Date;

public abstract class Viaje {
    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;    
    protected Date fechaLlegada;
    
    //Constructor
    public Viaje(String prmOrigen,String prmDestino,int prmCosto,Date prmFechaSalida,Date prmFechaLlegada){
        origen=prmOrigen;
        destino=prmDestino;
        costo=prmCosto;
        fechaSalida=prmFechaSalida;
        fechaLlegada=prmFechaLlegada;
    }

    //getters and setters
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public Date getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public Date getFechaLlegada() {
        return fechaLlegada;
    }
    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    //Metodos
    public abstract String descripcion();
    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }
    public String cualquierMetodo2() {
      return "Cualquier método2 implementado en la clase base";
    }

}
