package methodoverloading;

public class Google {

    void login(String email,String password){
        System.out.println("LOGIN USING EMAIL AND PASSWORD");
    }
    void login(int mobileno,int otp){
        System.out.println("LOGIN USING MOBILE NO AND OTP");
    }
    void login(int mobileno,String password){
        System.out.println("LOGIN USING MOBILE NO. AND PASSWORD");
    }
    void login(String email,String password,int authenticatorCode){
        System.out.println("LOGIN USING EMAIL , PASSWORD AND AUTHENTICATOR CODE");
    }
    public static void main(String[] args) {
        Google g = new Google();
        g.login("xyz@gmail.com","admin@123");
        g.login(123445,3456);
        g.login(9382740,"password");
        g.login("abc@gamil.com","12345",239024);

    }
}
