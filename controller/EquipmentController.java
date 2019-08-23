package hotelAutomation.controller;

import hotelAutomation.HotelAutomation;

public class EquipmentController {
    public static Controller getController(HotelAutomation automation){
        return new LightController(automation);
    }
}
