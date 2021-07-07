package JavaAssignments2;

abstract class Shapes
{
	public abstract void draw();
	
}

class line extends Shapes{
	public void draw() {
		System.out.println("Drawing line..");
	}
}

class square extends Shapes{
	public void draw() {
		System.out.println("Drawing square..");
	}
}

class cube extends Shapes{
	public void draw() {
		System.out.println("Drawing cube..");
	}
}

public class DrawShapes {

	public static void main(String[] args) {
		
		line l= new line();
		square sq = new square();
		cube c = new cube();
		
		l.draw();
		sq.draw();
		c.draw();
			
		}
		

	}


