package coUnicaucaParkinglotDomain;

public class Vehicle {
    private String plate;
    private TypeEnum type;

    public Vehicle(String prmPlate, TypeEnum prmType){
        plate=prmPlate;
        type=prmType;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }


}
