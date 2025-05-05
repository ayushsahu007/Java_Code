package family;

public class Solution {
    public static void main(String[] args) {
        Father    f;
        f = new Son();
        if (f instanceof Son){
            System.out.println("DownCasting to son");
            Son s = (Son) f;
            System.out.println(s.x + s.y);
        } else if (f instanceof Daughter){
            System.out.println("DownCasting to daughter ");
            Daughter d = (Daughter) f;
            System.out.println(d.x+d.z);

        }
    }
}
