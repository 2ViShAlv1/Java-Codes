public class MethodOverriding {
    public static void main(String args[]) {

        Deer d = new Deer() ;

        d.eat() ; // yhe pe derived class wala function hi call hoga 
    }
}
class Animal{
    
    void eat() {

        System.out.println("eats") ;

    }
}
class Deer extends Animal {

    void eat() {
        System.out.println(" eats grass") ;
    }
}