public class MultilevelInheritance {
    public static void main(String args[]) {

        Dog husky = new Dog() ;

        husky.wild() ;
        husky.breath() ; 
        husky.eat() ;
    }
}
class Animal{
    String type ;

    void eat() {
        System.out.println("eats") ;
    }
    void breath() {
        System.out.println("breaths") ;
    }
}
class Mamals extends Animal{

    String name ;

    void wild() {
        System.out.println("Not Wild") ;
    }

}
class Dog extends Mamals {
    String breed ;
    
    void legs() {
        System.out.println("4") ;
    }
}