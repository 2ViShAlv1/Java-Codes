public class GettersandSetters {
    public static void main(String args[]) {

          Pen p1 = new Pen() ;
          p1.setColor("Blue") ;
          System.out.print(p1.getColor()) ;

    }
}
class Pen {

    private String color ; // private hai isliye dusra fuctions banana padega color print krwane ke liye 
    

    String getColor() {
        return this.color ;
    }
    void setColor(String newColor) {

        color = newColor ;

    }
    
    
}