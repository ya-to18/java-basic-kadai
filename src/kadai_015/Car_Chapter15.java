package kadai_015;

public class Car_Chapter15 {
	private int gear  = 1;
	private int speed = 10;
	
	public Car_Chapter15( int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void gearChange( int afterGear) {
		int previousGear = this.gear;
		this.gear = afterGear;
		
		System.out.println("ギア" + previousGear + "から" + this.gear + "に切り替えました");
		
		// 速度の変更
		if( this.gear < 0 || 5 < this.gear) {
			return;
		}
		
		this.speed = this.gear * 10;
	}
	
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
