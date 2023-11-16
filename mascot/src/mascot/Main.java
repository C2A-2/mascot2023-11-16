package mascot;

public class Main{
	
	public static void main(String[] args) {

		Character character = new Character();
		System.out.println("実行前");
		character.move();
		character.timer1.schedule(character.task, 0, 1000);
		System.out.println("実行後");
	}
	

}
	
	