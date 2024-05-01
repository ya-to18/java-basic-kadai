package kadai_018;

public class KatoExec_Chapter18 extends KatoTaro_Chapter18 {
	public KatoExec_Chapter18(String familyName, String address) {
		super(familyName, address);
	}

	public static void main(String[] args) {
		String familyName = "加藤";
		String address = "東京都中野区◯×";
		
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18(familyName, address);
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18(familyName, address);
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18(familyName, address);
		
		taro.setGivenName("太郎");
		ichiro.setGivenName("一郎");
		hanako.setGivenName("花子");
		
		taro.execintroduce();
		System.out.println();
		ichiro.execintroduce();
		System.out.println();
		hanako.execintroduce();
	}
}
