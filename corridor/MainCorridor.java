package hotelAutomation.corridor;

import hotelAutomation.equipments.AirConditioner;
import hotelAutomation.equipments.Light;

public class MainCorridor {
    private Light light = new Light();
    private AirConditioner ac = new AirConditioner();
    private int max_unit = 15;

    public MainCorridor(){}

    public Light getLight(){
        return light;
    }

    public AirConditioner getAc(){
        return ac;
    }

    public int getMaxUnit(){
        return max_unit;
    }

    public int getDefaultUnit(){
        return light.getUnitConsumption() + ac.getUnitConsumption();
    }

    public void printState(){
        System.out.print(" Light : "+light.getState());
        System.out.println(" AC : "+ac.getState());
    }
}
