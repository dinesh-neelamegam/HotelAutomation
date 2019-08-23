package hotelAutomation.equipments;

public abstract class Equipment {
    private String button = "ON";

    public Equipment(){}

    public Equipment(String flag){
        this.button = flag;
    }

    public String on() {
        return (button = "ON");
    }

    public String off() {
        return (button = "OFF");
    }

    public abstract int getUnitConsumption();

    public String getState(){
        return button;
    }

    public boolean isOn(){
        return button.equals("ON");
    }
}
