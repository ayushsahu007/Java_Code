package hybridinheritance;

public interface Engine {
          default void engineInfo(){
              System.out.println("Engine: Default Info");
          }
}

