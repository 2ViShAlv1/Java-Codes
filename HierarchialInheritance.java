public class HierarchialInheritance {
    public static void main(String args[]) {

        Mamals human = new Mamals() ;
        human.breath() ;
        human.teeth() ;
        human.legs() ;

        Bird crow = new Bird() ;
        crow.wings() ;
        crow.breath() ;


    }
}
class Animal{
    String type ;

    void breath() {
        System.out.println("very Wild") ;
    }
    void teeth() {
        System.out.println("Long teeth") ;
    }
}
class Mamals extends Animals {
    
    String name ;

    void legs(){
        System.out.println("four") ;
    }
    void eyes() {
        System.out.println("two") ;
    }
}
class Bird extends Animals{
    
    void wings() {
        System.out.println("boht Badiya") ;
    }
}