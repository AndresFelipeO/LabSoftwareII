package coUnicaucaParkinglotPresentation;
import  coUnicaucaParkinglotDomain.*;
import java.time.Month;
import java.time.LocalDateTime;

public class ClienteMain {
    public static void main(String[] args) throws Exception {
        // double number = 2.5;
        // String str = String.valueOf(number);
        // int decNumberInt = Integer.parseInt(str.substring(str.indexOf('.') + 1));
        // System.out.println(decNumberInt);

        CarParkingCost costo= new CarParkingCost();
        TruckParkingCost tcosto=new TruckParkingCost();
        MotoParkingCost mcosto=new MotoParkingCost();
        LocalDateTime input = LocalDateTime.of(2021, Month.FEBRUARY, 22, 1, 00);
        LocalDateTime output = LocalDateTime.of(2021, Month.FEBRUARY, 25, 2, 30);
        System.out.println(tcosto.toHours(input, output));
        System.out.println(tcosto.CalculateCost(null, input, output));
    }
}
