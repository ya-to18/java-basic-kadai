package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String, String> dictionary = new HashMap<String, String>(){
		{
			put("apple", "りんご");
			put("peach", "桃");
			put("banana", "バナナ");
			put("lemon", "レモン");
			put("pear", "梨");
			put("kiwi", "キウイ");
			put("strawberry", "いちご");
			put("grape", "ぶどう");
			put("muscat", "マスカット");
			put("cherry", "さくらんぼ");
		}
	};
	
	public void lookUpWord(String words[]) {
		for(int i = 0; i < words.length; i++) {
			if(dictionary.containsKey(words[i])) {
				System.out.println(words[i] + "の意味は" + dictionary.get(words[i]));
			}else {
				System.out.println(words[i] + "は辞書に存在しません");
			}
		}
	}
}
