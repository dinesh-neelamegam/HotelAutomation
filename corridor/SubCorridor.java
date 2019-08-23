package hotelAutomation.corridor;

import hotelAutomation.equipments.AirConditioner;
import hotelAutomation.equipments.Light;

public class SubCorridor {
    private AirConditioner ac = new AirConditioner();
    private Light light = new Light("OFF");
    private int max_unit = 10;

    public SubCorridor(){};

    public Light getLight(){
        return light;
    }

    public AirConditioner getAc(){
        return ac;
    }

    public int getMaxUnit() {
        return max_unit;
    }

    public int getDefaultUnit() {
        return ac.getUnitConsumption();
    }

    public void printState() {
        System.out.print(" Light : "+light.getState());
        System.out.println(" AC : "+ac.getState());
    }
}
