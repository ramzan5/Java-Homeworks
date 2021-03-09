public class Main{
	public static void main(String args[]){
		Guest g1 = new Guest("Akbar", 15);
		Adult a1 = new Adult("Sarshar", 19);
		Minor m1 = new Minor("SOFIA", 12);
		Beverage b1 = new Beverage("Palinka",18);
		Beverage b2 = new Beverage("RedWine",18);
		Barista alex = new Barista();
		System.out.println(alex.order(g1, b1));
		System.out.println(alex.order(a1,b2));
	}
}