public class Constructor {
    public static void main(String args[]) {

        Student s1 = new Student("Vishal") ;

        System.out.println(s1.name) ;

        // agar koi constructor nhi bnanege to java apne aap hi constructor bna deta hai
        // java constructor khud ka constructor tabhi banaega jab tk koi dusra constructor nhi bnaya hoga
    }
}
class Student {

    String name ;
    int rollno ;

    Student(String name) {

        this.name = name ; //this ke sath jo name hai vo uppar wala hai
        

    }
}