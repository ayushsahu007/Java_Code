package restorent;

public class Hotel {

    Food order(int o){
        if (o==1){
            Idly i = new Idly();
            return i;
        } else if (o==2) {
            Dosa d =new Dosa();
            return d;
        }else{
            Vada v = new Vada();
            return v;
        }
    }
}
