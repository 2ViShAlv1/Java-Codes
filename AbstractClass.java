import java.util.*;

public class AbstractClass {
    public static void main(String args[]) {

        Horse h = new Horse() ; 
        System.out.print(h.color);
    
    }
}
abstract class Animal {

    String color ;

    Animal() {
        color = "Brown" ;
    }
    void eat() {
        System.out.println("eats") ;    
    }
    abstract void legs() ;
}
class Horse extends Animal {
    
    void changecolor() {
        this.color = "Dark Brown" ;
    }

    void legs() {
        System.out.println("four") ;
    }
    
}
class Bird extends Animal {

    void changecolor() {
        color = "Black" ;
    }

    void legs() {
        System.out.println("two") ;
    }
}