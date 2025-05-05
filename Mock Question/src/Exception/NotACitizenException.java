package Exception;

public class NotACitizenException extends  Exception{
    private String message;

    public NotACitizenException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return this.message;
    }
}
