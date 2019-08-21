package HotelAutomation.exception;

public class HotelAutomationException extends RuntimeException {
    public HotelAutomationException(ERROR_MESSAGE error_message){
        super(error_message.value());
    }

    public HotelAutomationException(ERROR_MESSAGE error_message, Throwable cause){
        super(error_message.value(), cause);
    }

    public enum ERROR_MESSAGE {
        ENTER_VALID_NUMBER("enter value more than 0");

        String message;
        ERROR_MESSAGE(String message){
            this.message = message;
        }

        public String value(){
            return this.message;
        }
    }
}
