package HotelAutomation;

import HotelAutomation.corridor.MainCorridor;
import HotelAutomation.corridor.SubCorridor;
import HotelAutomation.exception.InvalidCorridorNumber;

import java.util.HashMap;
import java.util.Map;

public class Floor {
    Map<Integer, MainCorridor> mainCorridors = new HashMap<>();
    Map<Integer, SubCorridor> subCorridors = new HashMap<>();

    public Floor(int no_of_main_corridor, int no_of_sub_corridor) throws InvalidCorridorNumber {
        addMainCorridor(no_of_main_corridor);
        addSubCorridor(no_of_sub_corridor);
    }

    private void addMainCorridor(int no_of_corridor) throws InvalidCorridorNumber {
        if(no_of_corridor < 1){
            throw new InvalidCorridorNumber(InvalidCorridorNumber.ExceptionMessage.MAIN_CORRIDOR);
        }
        for (int i=1; i<=no_of_corridor; i++){
            mainCorridors.put(i, new MainCorridor());
        }
    }

    private void addSubCorridor(int no_of_corridor) throws InvalidCorridorNumber {
        if(no_of_corridor < 1){
            throw new InvalidCorridorNumber(InvalidCorridorNumber.ExceptionMessage.SUB_CORRIDOR);
        }
        for (int i=1; i<=no_of_corridor; i++){
            subCorridors.put(i, new SubCorridor());
        }
    }

    public Map<Integer, SubCorridor> getSubCorridors(){
        return subCorridors;
    }
}
