package geometry;

public class Point {
	//definisemo property klase point - PRIVATE
	private int x;
	private int y;
	private boolean selected;
	
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
