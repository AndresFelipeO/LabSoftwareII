package coUnicaucaParkinglotDomain;

import java.time.LocalDateTime;

public class MotoParkingCost implements IParkingCost  {
    
    @Override
    public long CalculateCost(Vehicle veh,LocalDateTime input, LocalDateTime output){
        long valor=0;
        double horas=toHours(input, output);
        if(horas<1){
         valor=1000;
        }else{
            if(horas==1){
               valor=2000;
            }else{
               
             int minutes =(int) horas%1;
             
             valor = (long) (2000+((horas-1)*1000)+minutes);
            }
        }
        return valor;
    }

    @Override
    public double toHours(LocalDateTime input, LocalDateTime output) {
      long years = 0;
      long months = 0;
      long days = 0;
      double minutes = 0;
       if(output.getYear()-input.getYear()>0){
          years=(output.getYear()-input.getYear())*8760;
       }
       if(output.getMonthValue()-input.getMonthValue()>0){
          months=(output.getMonthValue()-input.getMonthValue())*730;
       }
       if(output.getDayOfMonth()-input.getDayOfMonth()>0){
          days=(output.getDayOfMonth()-input.getDayOfMonth())*24;
       }
       minutes = (output.getMinute()-input.getMinute());
       if(minutes>0){
          minutes=minutes/60;
       }
  return (output.getHour()-input.getHour())+minutes+days+months+years;
}
}
