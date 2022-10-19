package coUnicaucaParkinglotDomain;
import java.util.Map;

public class ParkingCostFactory {
    private Map<TypeEnum,IParkingCost> dictionary;
    private ParkingCostFactory instance;
    
    private void VehicleFactory(){

    }
    public Map<TypeEnum, IParkingCost> getDictionary() {
        return dictionary;
    }
    public ParkingCostFactory getInstance() {
        return instance;
    }
}
