package coUnicaucaParkinglotAccess;

import java.sql.Connection;
import java.util.List;

import coUnicaucaParkinglotDomain.Vehicle;

public class VehicleRepository  implements IVehicleRepository{

    private Connection con; 

    public VehicleRepository(){

    }
    public boolean save(){
        return true;
    }
    public List<Vehicle> list(){
        return null;
    }
    private int Database(){
        return 0;
    }
    public void Connect(){

    }
    public void disconnect(){

    }
}
