package geometry;

public class Donut extends Circle {
	
	//ostale property nasledjuje iz Circle
	private int innerRadius;
	
	public Donut() {}
	
	public Donut(Point center, int radius, int innerRadius) {
		//ne moze jer je private
		//this.center
		//this.setCenter(center);
		//setCenter(center);
		//ovako direktno ide u Circle
		//super.setCenter(center);
		
		//poziv konstruktora nadredjene klase
		//mora da bude prva naredba - kao i this
		super(center, radius);
		this.innerRadius = innerRadius;
		
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);
		//ako je private onda mora set metoda 
		//setSelected(selected);
		//ako je protected mogu i ovako:
		this.selected = selected;
	}

	//ostale get i set nasledjuje iz Circle
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	public String toString() {
		//ako samo pozovemo toString dobicemo rekurziju
		return super.toString() + ", innerRadius = " + innerRadius;
	}

	
	

}
