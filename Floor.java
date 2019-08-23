package hotelAutomation;

import hotelAutomation.corridor.MainCorridor;
import hotelAutomation.corridor.SubCorridor;
import hotelAutomation.equipments.AirConditioner;
import hotelAutomation.equipments.Light;
import hotelAutomation.exception.InvalidCorridorNumber;

import java.util.HashMap;
import java.util.Map;

public class Floor {
    private Map<Integer, MainCorridor> mainCorridors = new HashMap<>();
    private Map<Integer, SubCorridor> subCorridors = new HashMap<>();
    private int total_consumption;
    private int max_unit;

    public Floor(int no_of_main_corridor, int no_of_sub_corridor) throws InvalidCorridorNumber {
        addMainCorridor(no_of_main_corridor);
        addSubCorridor(no_of_sub_corridor);
    }

    private void addMainCorridor(int no_of_corridor) throws InvalidCorridorNumber {
        if(no_of_corridor < 1){
            throw new InvalidCorridorNumber(InvalidCorridorNumber.ExceptionMessage.MAIN_CORRIDOR);
        }
        for (int i=1; i<=no_of_corridor; i++){
            MainCorridor corridor = new MainCorridor();
            total_consumption += corridor.getDefaultUnit();
            max_unit += corridor.getMaxUnit();
            mainCorridors.put(i, corridor);
        }
    }

    private void addSubCorridor(int no_of_corridor) throws InvalidCorridorNumber {
        if(no_of_corridor < 1){
            throw new InvalidCorridorNumber(InvalidCorridorNumber.ExceptionMessage.SUB_CORRIDOR);
        }
        for (int i=1; i<=no_of_corridor; i++){
            SubCorridor corridor = new SubCorridor();
            total_consumption += corridor.getDefaultUnit();
            max_unit += corridor.getMaxUnit();
            subCorridors.put(i, new SubCorridor());
        }
    }

    public void movement(int sub_corridor) {
        SubCorridor corridor = subCorridors.get(sub_corridor);
        if(total_consumption+corridor.getLight().getUnitConsumption() > max_unit){
            for (int i=1; i<=subCorridors.size(); i++){
                AirConditioner ac = subCorridors.get(i).getAc();
                if(ac.isOn()) {
                    ac.off();
                    break;
                }
            }
            total_consumption += corridor.getLight().getUnitConsumption() - corridor.getAc().getUnitConsumption();
        } else {
            total_consumption += corridor.getLight().getUnitConsumption();
        }
        corridor.getLight().on();
    }

    public void noMovement(int sub_corridor) {
        SubCorridor corridor = subCorridors.get(sub_corridor);
        corridor.getLight().off();
        total_consumption -= corridor.getLight().getUnitConsumption();
        if(total_consumption+corridor.getAc().getUnitConsumption() <= max_unit){
            for (int i=1; i<subCorridors.size(); i++){
                AirConditioner ac = subCorridors.get(i).getAc();
                if(!ac.isOn()){
                    ac.on();
                    break;
                }
            }
            total_consumption += corridor.getAc().getUnitConsumption();
        }
    }

    public void printState(){
        mainCorridors.entrySet().forEach(entry -> {
            System.out.print("Main Corridor : "+entry.getKey());
            entry.getValue().printState();
        });

        subCorridors.entrySet().forEach(entry -> {
            System.out.print("Sub corridor : "+entry.getKey());
            entry.getValue().printState();
        });
    }
}
