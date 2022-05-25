
public class Ifelsecondition {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if(a>=b)
		{
			System.out.println("a is greater");
		}
		else if((a==b)&&(a<=b))//and operator both conditions to be true
		{
			System.out.println("both are equal");
		}
		else if((a!=b)||(a>b))//or operator any one conditions to be true
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("none of these");
		}

	}

}
