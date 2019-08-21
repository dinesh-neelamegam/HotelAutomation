package HotelAutomation.controller;

import HotelAutomation.Automation;

public class LightController extends Controller {
    Automation automation;

    public LightController(Automation automation){
        this.automation = automation;
    }

    @Override
    public void movement(int floor_no, int sub_corridor) {
        automation.getFloors().get(floor_no).getSubCorridors().get(sub_corridor).lightOn();
        automation.printStatus();
    }

    @Override
    public void noMovement(int floor_no, int sub_corridor) {
        automation.getFloors().get(floor_no).getSubCorridors().get(sub_corridor).lightOff();
        automation.printStatus();
    }
}
