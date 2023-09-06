package exam14;

public class Rectangle implements Comparable<Rectangle>{
	private int height;
	private int width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int findArea() {
		
		return height*width;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사각형 [height ="+height+", width ="+width+ "]";
	}

	@Override
	public int compareTo(Rectangle o) {
		
		
		return this.findArea()-o.findArea();
	}
	
	
	
}
