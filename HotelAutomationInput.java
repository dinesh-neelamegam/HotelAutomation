package HotelAutomation;

import HotelAutomation.controller.Controller;
import HotelAutomation.controller.EquipmentController;

public class HotelAutomationInput {
    public static void main(String[] strings) {
        Automation automation = new Automation(2,1,2);
        Controller lightController = EquipmentController.getController(automation);
        lightController.noMovement(1,2);
        lightController.noMovement(2,2);

//        automation.addFloor(3,0,0);
    }
}
