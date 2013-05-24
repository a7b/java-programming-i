public class Rect {
	private double length;
	private double width;

	public Rect (){
		this.length = 0;
		this.width = 0;		
	}
	
	public Rect (double len, double wid){
		this.length = len;
		this.width = wid;
	}

	double primeter (){
		return 2*(this.length + this.width);
	}

	double area (){
		return (length * width);
	}
	
	public double getLength()//gettor accessor
	{
		return this.length;
	}
	
	public void setLength(double len)//settor - accessor
	{
		this.length = len;
	}

	void display (){
		System.out.println ("Imformation of Rectangle");
		System.out.println ("   - Length: \t" + this.length);
		System.out.println ("   - Width: \t" + this.width);
		System.out.println ("   - Primeter: \t" + this.primeter());
		System.out.println ("   - Area: \t\t" + this.area() + "\n");
	}
}

//class Test{
//	public static void main (String[] args) {
//		Rect R1 = new Rect();
//		R1.display();
//		Rect R2 = new Rect(5,8);
//		R2.display();
//	}
//}