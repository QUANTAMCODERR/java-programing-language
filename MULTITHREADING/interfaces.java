public class interfaces {
    public static void main(String[] args) {
        pawn p = new pawn();
        p.move();
        queen q = new queen();
        q.move();
        rook r = new rook();
        r.move();
        Chessplayer.move();
    }
}
interface Chessplayer
{
    static void move()
    {
        System.out.println("this is static keyword");
    }
}
class queen implements Chessplayer
{
    public void move()
    {
        System.out.println("this is queen");
    }
}
class rook implements Chessplayer
{
    public void move()
    {
        System.out.println("this is rook ");
    }
}
class pawn implements Chessplayer
{
    public void move()
    {
        System.out.println("this is pawn");
    }
}