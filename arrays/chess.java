package arrays;

public class chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queen q= new Queen();
		q.moves();
		King k= new King();
		k.moves();
		Rook r=new Rook();
		r.moves();

	}

}
interface chessplayer{
	void moves();
	
}
class Queen implements chessplayer{
public	void moves() {
		System.out.println("up , down,left,right,diagonal(in all direction)");
		
	}
}
class Rook implements chessplayer{
public	void moves() {
		System.out.println("up , down,left,right");
		
	}
}
class King implements chessplayer{
public	void moves() {
		System.out.println("up , down,left,right, dignoal(by 1 step)");
		
	}
}