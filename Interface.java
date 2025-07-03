public class Interface {
    public static void main(String args[]) {

        Queen q = new Queen() ;
        q.moves() ;

        Pawn k = new Pawn() ;
        k.moves() ;
    }
}
interface ChessPlayer {

    void moves() ;
}
class Queen implements ChessPlayer{

    public void moves() {             // public keyword likhna padega nahi to void function default type ka ho jayega
        System.out.println("up,down,right,left,diagonal") ;
    }
}
class Rook implements ChessPlayer {
    
    public void moves() {
        System.out.println("up,down,right,left") ;
    }
}
class Pawn implements ChessPlayer {
    
    public void moves() {
        System.out.println("1 step forward") ;
    }
}