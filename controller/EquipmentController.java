package HotelAutomation.controller;

import HotelAutomation.Automation;

public class EquipmentController {
    public static Controller getController(Automation automation){
        return new LightController(automation);
    }
}
