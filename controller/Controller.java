package hotelAutomation.controller;

public abstract class Controller {
    public abstract void movement(int floor, int sub_corridor);
    public abstract void noMovement(int floor, int sub_corridor);
}
