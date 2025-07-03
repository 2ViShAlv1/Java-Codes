public class CopyConstructor {
    public static void main(String args[]) {

        Student s1 = new Student() ; // ye line tabhi chalegi jb ek non parameterized cons banaya gya hoga

        s1.name = "Vishal";
        s1.roll = 12;

        s1.marks[0] = 100 ;
        s1.marks[1] = 90 ;
        s1.marks[2] = 100 ;

        Student s2 = new Student(s1) ;

        s1.marks[2] = 90 ; // s1 mai agar change karenge to s2 mai bhi dekhai dega

        System.out.println(s2.name);

        for(int i = 0 ; i <= 2 ; i++) {
            System.out.println(s2.marks[i]) ;
        }

    }  
}
class Student{

    String name ;

    int roll ;

    int marks[] ;

    Student() {
        marks = new int[3] ; // ye line sabhi cons mai lekhni padegi taki sabko pta rhe ki array ka size kya hai

        System.out.println(" ") ;
        
    }

    Student(Student s1) { // student s1 as a parameter dala gya hai iss cons mai

       marks = new int[3] ;
       this.marks = s1.marks ; 
       this.name = s1.name ;
       this.roll = s1.roll ;
    }
    Student(String name) {
        marks = new int[3] ;
        this.name = name ;
    }
    Student(int roll) {
        marks = new int[3] ;
        this.roll = roll;
    }
}