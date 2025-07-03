public class Inheritance {
    public static void main(String args[]) {

        Wolf billa = new Wolf() ;

        billa.teeth() ;
        billa.tail() ;
        billa.setname("BalamKheera") ;
        System.out.println(billa.getname()) ;

    }
}
// Baseclass
class Animal {
    String color ;

    void teeth() {
        System.out.println("Sharp") ;
    }
    void tail() {
        System.out.println("Long tail") ;
    }
}
class Wolf extends Animal {
    String name ;

    void setname(String name) {
        this.name = name ;
    }
    String getname() {
        return this.name ;
    }
}