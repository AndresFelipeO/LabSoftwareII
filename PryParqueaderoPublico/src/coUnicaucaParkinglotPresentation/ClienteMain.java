package coUnicaucaParkinglotPresentation;
import  coUnicaucaParkinglotDomain.*;
import java.time.Month;
import java.time.LocalDateTime;

public class ClienteMain {
    public static void main(String[] args) throws Exception {
        CarParkingCost cCosto= new CarParkingCost();
        TruckParkingCost tCosto=new TruckParkingCost();
        MotoParkingCost mCosto=new MotoParkingCost();
        LocalDateTime input = LocalDateTime.of(2021, Month.FEBRUARY, 22, 1, 00);
        LocalDateTime output = LocalDateTime.of(2021, Month.FEBRUARY, 25, 2, 30);
        System.out.println(tCosto.toHours(input, output));
        System.out.println(tCosto.CalculateCost(null, input, output));
    
        
    }
}
