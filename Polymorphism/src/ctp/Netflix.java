package ctp;

public class Netflix {
    static void login(String emain,int password){
        System.out.println("Logged in using email and Passsword");
    }
    static void login(int contactno,int otp){
        System.out.println("Logged in using contact no and opt");
    }
    public static void main(String[] args) {
        login("ayush@gmail.com",123456);
        System.out.println("------------------");
        login(794237520,432);
        Netflix.login(3425,6543);
    }
}
