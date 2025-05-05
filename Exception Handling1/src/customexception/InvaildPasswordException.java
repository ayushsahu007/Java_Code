package customexception;

public class InvaildPasswordException extends Exception {
    private String message;
     public InvaildPasswordException(String message) {
         this.message = message;

     }
     @Override
    public String getMessage(){
         return this.message;
     }
}
