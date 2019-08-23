package hotelAutomation.equipments;

public class Light extends Equipment {

    private int units = 5;

    public Light(){
        super();
    }

    public Light(String flag){
        super(flag);
    }

    @Override
    public int getUnitConsumption(){
        return units;
    }
}
