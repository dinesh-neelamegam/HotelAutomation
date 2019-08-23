package hotelAutomation;

import hotelAutomation.exception.HotelAutomationException;
import hotelAutomation.exception.InvalidCorridorNumber;

import java.util.HashMap;
import java.util.Map;

public class HotelAutomation {

    private Map<Integer, Floor> floors = new HashMap<>();

    public HotelAutomation(int floors, int main_corridors, int sub_corridors) {
        init(floors, main_corridors, sub_corridors);
        printStatus();
    }

    private void init(int no_of_floors, int main_corridors, int sub_corridors){
        if(no_of_floors < 1) {
            try {
                throw new InvalidCorridorNumber(InvalidCorridorNumber.ExceptionMessage.FLOOR);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        try {
            for (int i=1; i<=no_of_floors; i++){
                floors.put(i, new Floor(main_corridors, sub_corridors));
            }
        } catch (InvalidCorridorNumber ex){
            ex.printStackTrace();
            throw new HotelAutomationException(HotelAutomationException.ERROR_MESSAGE.ENTER_VALID_NUMBER, ex.getCause());
        }
    }

    public Map<Integer, Floor> getFloors(){
        return floors;
    }

    public void addFloor(int floor_no, int main_corridors, int sub_corridors) {
        try {
            floors.put(floor_no, new Floor(main_corridors, sub_corridors));
        } catch (InvalidCorridorNumber ex) {
            ex.printStackTrace();
            throw new HotelAutomationException(HotelAutomationException.ERROR_MESSAGE.ENTER_VALID_NUMBER, ex.getCause());
        }
    }

    public void printStatus(){
        floors.forEach((floor_no, floor) -> {
            System.out.println();
            System.out.println("Floor : "+floor_no);
            floor.printState();
        });
    }
}
