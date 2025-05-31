package dotlab;


public class Dot 
{
	private static String[] 	LEGAL_COLOR_NAMES =
	{
		"RED", "YELLOW", "BLUE", "CYAN", "GREEN", "MAGENTA", "ORANGE", "BLACK"
	};
	
	private String colorName;
	private int x;
	private int y;
	private int radius;
	
	public Dot(String colorName, int x, int y, int radius) {
		for(String legalColor : LEGAL_COLOR_NAMES) {
			if(legalColor.equalsIgnoreCase(colorName)) {
				isValidColor = true;
				break;
			}
		}
		
		if(!isValidColor) {
			throw new IllegalArgumentException("Bad Color name: " + colorName);
			
		}
		this.colorName = colorName;
		this.x = x;
		this.y = y;
		this.radius = radius;
		}
	
	public String getColorName() {
		return colorName;
	}
	
	public int getX() {
		return x;
		
	}

	public int getY() {
		return y;
	}
	
	public int getRadius() {
		return radius;
	}
	
	boolean isValidColor = false;
	
	public String toString() { 
		return colorName + " " + x + " " + y + " " + radius;
	}
	
	
	public static void main (String[] args) {
		try {
			Dot test1 = new Dot("red",4,6,3);
			System.out.println("Dot 1: Created Succesfully");
			System.out.println(test1);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
