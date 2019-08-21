package HotelAutomation.corridor;

import HotelAutomation.equipments.AirConditioner;
import HotelAutomation.equipments.Light;

public class SubCorridor {
    AirConditioner ac = new AirConditioner();
    Light light = new Light();

    public SubCorridor(){};

    public void lightOn(){
        light.on();
    }

    public void lightOff(){
        light.off();
    }

    public int getLightState(){
        return light.getState();
    }

    public void acOn(){
        ac.on();
    }

    public void acOff(){
        ac.off();
    }

    public int getAcState(){
        return ac.getState();
    }
}
