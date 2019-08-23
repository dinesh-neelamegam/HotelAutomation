package hotelAutomation.equipments;

public class AirConditioner extends Equipment {

    private int units = 10;

    public AirConditioner(){
        super();
    }

    @Override
    public int getUnitConsumption(){
        return units;
    }
}
