package coUnicaucaParkinglotDomain;

import java.time.LocalDateTime;

public class TruckParkingCost implements IParkingCost {

    @Override
    public long CalculateCost(Vehicle veh, LocalDateTime input, LocalDateTime output) {
        long valor = 0;
        double horas = toHours(input, output);
        if (horas == 24) {
            horas -= 24;
            valor = 15000;
        } else if (horas <= 12) {
            valor = 10000;
        } else if (horas > 12 && horas < 24) {
            valor = 15000;
        } else {
            while (horas >= 24) {
                valor += 15000;
                horas -= 24;
            }
            valor += (horas * 15000) / 24;
        }
        return valor;
    }

    @Override
    public double toHours(LocalDateTime input, LocalDateTime output) {
        long years = 0;
        long months = 0;
        long days = 0;
        long minutes = 0;
        if (output.getYear() - input.getYear() > 0) {
            years = (output.getYear() - input.getYear()) * 8760;
        }
        if (output.getMonthValue() - input.getMonthValue() > 0) {
            months = (output.getMonthValue() - input.getMonthValue()) * 730;
        }
        if (output.getDayOfMonth() - input.getDayOfMonth() > 0) {
            days = (output.getDayOfMonth() - input.getDayOfMonth()) * 24;
        }
        minutes = (output.getMinute() + input.getMinute()) / 60;
        return (output.getHour() - input.getHour()) + minutes + days + months + years;
    }

}
