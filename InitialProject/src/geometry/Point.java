package geometry;

public class Point {
	//definisemo property klase point - PRIVATE
	private int x;
	private int y;
	private boolean selected;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//nije dozvoljeno
	/*public Point(int xKoordinata, int y) {
		this.x=xKoordinata;
		this.y=y;
	}*/
	
	public Point(int x, int y, boolean selected) {
		//naseledjivanje konstruktora
		this(x,y);
		this.selected=selected;
	}
	
	//metoda instance
	public double distance(Point drugaTacka) {
		//x koordinata prve tacke tj one nad kojom se poziva metoda distance
		//-x koordinata druge tacke koja se prosledjuje metodi distance
		int a = this.x - drugaTacka.x;
		int b = this.y-drugaTacka.y;
		double distance = Math.sqrt(a*a+b*b);
		return distance;
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Point) {
			//downcast
			if(this.x == ((Point)obj).x && 
					this.y == ((Point)obj).y &&
					 	this.selected == ((Point)obj).selected)
				return true;
				
	        return false;
		}
		return false;
    }
	
	public boolean contains(int x, int y) {
		Point sadrziTacku = new Point(x,y);
		return this.distance(sadrziTacku) <= 2;
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
	
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	

}
