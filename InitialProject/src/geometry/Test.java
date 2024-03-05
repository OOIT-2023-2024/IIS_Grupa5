package geometry;

public class Test {

	public static void main(String[] args) {
		// kreiramo objekat klase Point
		Point prvaTacka = new Point();

		//x koordinata prve tacke
		//System.out.println(x); --ne valja
		//System.out.println(Point.x);--ne valja
		//System.out.println(prvaTacka.x);--ne valja
		System.out.println(prvaTacka.getX());
		prvaTacka.setX(150);
		System.out.println(prvaTacka.getX());
		
		Point drugaTacka = new Point();
		System.out.println(drugaTacka.getY());
		drugaTacka.setY(150);
		System.out.println(drugaTacka.getY());
		
		

	}

}
