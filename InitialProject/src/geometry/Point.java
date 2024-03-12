package geometry;

public class Point {
	//definisemo property klase point - PRIVATE
	private int x;
	private int y;
	private boolean selected;
	
	//metoda instance
	public double distance(Point drugaTacka) {
		//x koordinata prve tacke tj one nad kojom se poziva metoda distance
		//-x koordinata druge tacke koja se prosledjuje metodi distance
		int a = this.x - drugaTacka.x;
		int b = this.y-drugaTacka.y;
		double distance = Math.sqrt(a*a+b*b);
		return distance;
	}
	
	public int getX() {
		return x;
		//return this.x;
	}

	public void setX(int x) {
		//x=x; ne valja ovako
		this.x=x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y=y;	
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	

}
