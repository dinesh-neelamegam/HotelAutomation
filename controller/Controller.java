package HotelAutomation.controller;

public abstract class Controller {
    abstract void movement(int floor, int sub_corridor);
    public abstract void noMovement(int floor, int sub_corridor);
}
