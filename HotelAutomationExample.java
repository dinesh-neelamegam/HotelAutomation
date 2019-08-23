package hotelAutomation;

import hotelAutomation.controller.Controller;
import hotelAutomation.controller.EquipmentController;

public class HotelAutomationExample {
    public static void main(String[] strings) {
        HotelAutomation automation = new HotelAutomation(2,1,3);
        Controller lightController = EquipmentController.getController(automation);

        //for floor 1
        lightController.movement(1,1);
        lightController.movement(2,1);

        lightController.movement(1,2);
        lightController.movement(2,2);

        lightController.movement(1,3);
        lightController.movement(2,3);

        lightController.noMovement(1,2);
        lightController.noMovement(2,2);

        lightController.noMovement(1,1);
        lightController.noMovement(2,1);

        lightController.noMovement(1,3);
        lightController.noMovement(2,3);

        //for floor 2
        /*lightController.movement(2,1);
        lightController.movement(2,2);
        lightController.movement(2,3);
        lightController.noMovement(2,2);
        lightController.noMovement(2,1);
        lightController.noMovement(2,3);*/

//        automation.addFloor(3,0,0);
    }
}
