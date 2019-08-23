package hotelAutomation.controller;

import hotelAutomation.HotelAutomation;

public class LightController extends Controller {
    HotelAutomation automation;

    public LightController(HotelAutomation automation){
        this.automation = automation;
    }

    @Override
    public void movement(int floor_no, int sub_corridor) {
        automation.getFloors().get(floor_no).movement(sub_corridor);
        automation.printStatus();
    }

    @Override
    public void noMovement(int floor_no, int sub_corridor) {
        automation.getFloors().get(floor_no).noMovement(sub_corridor);
        automation.printStatus();
    }
}
