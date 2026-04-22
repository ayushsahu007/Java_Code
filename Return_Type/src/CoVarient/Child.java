package CoVarient;

public class Child extends Parent{
    @Override
    Child show(){
    //    super.show();
        System.out.println("This is Child Class");
       return this;//  return new Child();
    }
}
