package HotelAutomation.equipments;

public class Equipment {
    private int button = 1;

    public int on() {
        return (button = 1);
    }

    public int off() {
        return (button = 0);
    }

    public int getState(){
        return button;
    }
}
