public class Static {
    public static void main(String args[]) {

        Student s1 = new Student() ;
        s1.setname("vishal") ;
        System.out.println(s1.getname()) ;
        s1.setschoolname("KV") ;
        System.out.println(s1.getschoolname()) ;

        Student s2 = new Student() ;
        s2.setname("Abhineet") ;
        System.out.println(s2.getname()) ;
        System.out.println(s2.getschoolname()) ;

    }
}
class Student {
    
    String name ;
    int roll ;

    static String schoolname ;

     void setname(String name) {
        this.name = name ;
    }+
     String getname() {
        return this.name ;
        
    }

     void setschoolname(String schoolname) {
        this.schoolname = schoolname ;
    }
     String getschoolname() {
        return this.schoolname ;
    }

}