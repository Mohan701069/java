
public class Constructor_program {

	public Constructor_program() {
		System.out.println("it is default constructor");
	}

	public Constructor_program(String x)// data type
	{
		System.out.println("it is a" + x);
	}

	public Constructor_program(int a, double b)// data order method overloading
	{
		System.out.println(a);
		System.out.println(b);
	}

	public Constructor_program(char x, char y)// data count
	{
		System.out.println(x);
		System.out.println(y);
	}

	public void display() {
		System.out.println("complete");
	}

	public static void main(String[] args) {
		Constructor_program c1 = new Constructor_program();
		Constructor_program c2 = new Constructor_program("parameterized constructor");
		Constructor_program c3 = new Constructor_program(30, 30.55);
		Constructor_program c4 = new Constructor_program('A', 'B');
		c4.display();

	}

}
