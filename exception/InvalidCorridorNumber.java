package HotelAutomation.exception;

public class InvalidCorridorNumber extends Exception {

    public InvalidCorridorNumber(ExceptionMessage exceptionMessage){
        super(exceptionMessage.value());
    }

    public enum ExceptionMessage{
        MAIN_CORRIDOR("Invalid number found for main corridor"),
        SUB_CORRIDOR("Invalid number found for sub corridor"),
        FLOOR("Invalid number found for floors");

        String error_message;
        ExceptionMessage(String error_message){
            this.error_message = error_message;
        }

        public String value(){
            return this.error_message;
        }
    }
}
