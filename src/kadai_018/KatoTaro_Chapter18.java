package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	public KatoTaro_Chapter18(String familyName, String address) {
		super(familyName, address);
	}
	
	public void setGivenName(String name) {
		this.givenName = name;
	}
	
	public void eachintroduce() {
		System.out.println("私はJavaが得意です");
	}
}
