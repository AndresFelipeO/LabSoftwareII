package coUnicaucaParkinglotDomain;

import java.time.LocalDateTime;

public class CarParkingCost implements IParkingCost {

    @Override
    public long CalculateCost(Vehicle veh, LocalDateTime input, LocalDateTime output) {
        long cost = 0;
        double hours = toHours(input, output);
        if (hours < 1) {
            cost = 2000;
        } else {
            if (hours == 1) {
                cost = 4000;
            } else {
                int minutes = (int) hours % 1;
                cost = redondear((long) (4000 + ((hours - 1) * 2000) + minutes));
            }
        }
        return cost;
    }

    @Override
    public double toHours(LocalDateTime input, LocalDateTime output) {
        long years = 0;
        long months = 0;
        long days = 0;
        double minutes = 0;
        if (output.getYear() - input.getYear() > 0) {
            years = (output.getYear() - input.getYear()) * 8760;
        }
        if (output.getMonthValue() - input.getMonthValue() > 0) {
            months = (output.getMonthValue() - input.getMonthValue()) * 730;
        }
        if (output.getDayOfMonth() - input.getDayOfMonth() > 0) {
            days = (output.getDayOfMonth() - input.getDayOfMonth()) * 24;
        }
        minutes = (output.getMinute() - input.getMinute());
        if (minutes > 0) {
            minutes = minutes / 60;
        }
        return (output.getHour() - input.getHour()) + minutes + days + months + years;
    }
    
    public long redondear(long n){
        if(n%100==0){
            return n;
        }else{
            long calcular;
            calcular = n - (n%100) + 100;
            return calcular;  
        }
    }
}