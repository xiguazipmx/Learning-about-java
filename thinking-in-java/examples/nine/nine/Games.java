/**
 * @Description:
 * @author: Administrator
 * @date: 2018年12月20日 下午4:32:12
 */
package nine.nine;

/**
 * @author Administrator
 *
 */
public class Games {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move());
	}
	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}
}

interface Game{ boolean move();}
interface GameFactory{ Game getGame();}

class Checkers implements Game{
	private int moves = 0;
	private static final int MOVES = 5;
	public boolean move() {
		System.out.println("Checkers move"+moves);
		return ++moves != MOVES;
	}
}

class CheckersFactory implements GameFactory{
	public Game getGame() {
		return new Checkers();
	}
}

class Chess implements Game{
	private int moves = 0;
	private static final int MOVES = 4;
	public boolean move() {
		System.out.println("Chess move"+moves);
		return ++moves != MOVES;
	}
}

class ChessFactory implements GameFactory{
	public Game getGame() {
		return new Chess();
	}
}