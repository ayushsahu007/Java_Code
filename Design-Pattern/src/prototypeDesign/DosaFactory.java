package prototypeDesign;

public class DosaFactory {

    static Dosa getInstance(String s){
        Dosa d = null;
        if (s.equalsIgnoreCase("Masala"))
              d = new MasalaDosa();
        else if (s.equalsIgnoreCase("Kaali")) {
            d = new KaliDosa();
        } else if (s.equalsIgnoreCase("Set")) {
            d= new SetDosa();
        }
        return d;


    }
}
