package coUnicaucaParkinglotDomainService;

import java.time.LocalDateTime;
import java.util.List;

import coUnicaucaParkinglotAccess.IVehicleRepository;
import coUnicaucaParkinglotDomain.Vehicle;

public class Service {
    IVehicleRepository atrRepo;
    public Service(IVehicleRepository repo){
        atrRepo=repo;
    }   
    public void  CalculateParkingCost(){

    }
    public void SaveVehicle(){

    }
    public void ListVeicles(){
        
    }
    public long calculateParkingCost(Vehicle veh, LocalDateTime input, LocalDateTime output) {
        return 0;
    }
    public void saveVehicle(Vehicle veh) {
    }
    public List<Vehicle> listVehicles() {
        return null;
    }

}
