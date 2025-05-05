package Exception;

public class AgeInvaildException extends Exception{
    private String message;
    AgeInvaildException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return this.message;
    }
}
