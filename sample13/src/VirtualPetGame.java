
public class VirtualPetGame {
	public static void main(String[] args) {
		VirtualDog taro=new VirtualDog("タロ",100,50);
		VirtualBird piyo=new VirtualBird("ピヨ",60,30);
		
		taro.walk();
		piyo.sleep();
		taro.walk();
		taro.sleep();
		piyo.fly();
		
		taro.printInfo();
		piyo.printInfo();
	}
	

}
