class Person {
	String name;
	int age;
}
public class Practice1 {
	static void printInfo(Person p) {
	System.out.println("名前："+p.name);
	System.out.println("年齢："+p.age);
	}
	
	public static void main(String[] args) {
		Person a=new Person();
		a.name="花山薫";
		a.age=19;
		Person b=new Person();
		b.name="範馬刃牙";
		b.age=14;
		printInfo(a);
	}
}
