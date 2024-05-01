package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	public KatoHanako_Chapter18(String familyName, String address) {
		super(familyName, address);
	}
	
	public void setGivenName(String name) {
		this.givenName = name;
	}
	
	public void eachintroduce() {
		System.out.println("趣味は読書です");
	}
}