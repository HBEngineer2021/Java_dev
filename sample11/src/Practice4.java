class Person {
	String name;
	int age;
}
public class Practice4 {
	static int getTotalAge(Person p1,Person p2) {
		return p1.age +p2.age;
	}
	public static void main(String[] args) {
		Person a=new Person();
		a.name="花山薫";
		a.age=19;
		Person b=new Person();
		b.name="範馬刃牙";
		b.age=14;
		System.out.println(getTotalAge(a,b));
	}
}
