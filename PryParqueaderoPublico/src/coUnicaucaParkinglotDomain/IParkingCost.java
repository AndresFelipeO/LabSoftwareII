package coUnicaucaParkinglotDomain;

import java.time.LocalDateTime;

interface IParkingCost {
    public long CalculateCost(Vehicle veh,LocalDateTime input, LocalDateTime output);
    public double toHours(LocalDateTime input, LocalDateTime output);
}
