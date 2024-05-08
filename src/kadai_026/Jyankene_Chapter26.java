package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyankene_Chapter26 {
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		if(input.equals("r") || input.equals("s") || input.equals("p")) {
		}else {
			System.out.println("正しいじゃんけんの手を入力してください");
		}
		
		scanner.close();
		return input;
	}
	
	public String getRandom() {
		String[] hands = {"r", "s", "p"};
		int rand = (int)Math.floor(Math.random() * 3);
		
		String getHand = hands[rand];
		
		return getHand;
	}
	
	public void playGame(String myChoice, String opponentChoice) {
		HashMap<String, String> hands = new HashMap<String, String>();
		hands.put("r", "グー");
		hands.put("s", "チョキ");
		hands.put("p", "パー");
		
		System.out.println("自分の手は" + hands.get(myChoice) + ",対戦相手の手は" + hands.get(opponentChoice));
		
		if(myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
		}else if(myChoice.equals("r") && opponentChoice.equals("s")
				|| myChoice.equals("s") && opponentChoice.equals("p")
				|| myChoice.equals("p") && opponentChoice.equals("r")
				) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
}
