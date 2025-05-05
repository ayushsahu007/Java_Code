package customexception;

public class InvaildAgeException extends RuntimeException{
    private String message;
    public InvaildAgeException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return this.message;
    }
}
