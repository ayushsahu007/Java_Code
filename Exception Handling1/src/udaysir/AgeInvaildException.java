package udaysir;

public class AgeInvaildException extends RuntimeException {
    private String message;
    AgeInvaildException(String message){
        this.message = message;
    }
    @Override
    public String getMessage()
    {
        return message;
    }
}
