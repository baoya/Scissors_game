package time01;

public class Player {
	
	private String name;		//Ãû×Ö
	private int score;			//·ÖÊý
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
		}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName()+";"+this.getScore();
	}
}
