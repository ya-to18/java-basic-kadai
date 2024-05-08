package kadai_026;

public class JyankeneExec_Chapter26 {

	public static void main(String[] args) {
		Jyankene_Chapter26 jyankene = new Jyankene_Chapter26();
		String myChoice = jyankene.getMyChoice();
		String opponentChoice = jyankene.getRandom();
		
		jyankene.playGame(myChoice, opponentChoice);
	}

}
