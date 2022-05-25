
public class Chlid_class extends Parent_class {
	 
	static int a =20;
	
	void  print() {
		int a= 30;
		 System.out.println("mechatronics");
		 System.out.println(a);
	}
	
	void main(){
		System.out.println("paavai enginerring");
		System.out.println(this.a);

	}
	public void idno() {
		super.idno();
	}
	public static void main(String[] args) {
		Chlid_class c1 =new Chlid_class();
		c1.print();
		c1.idno();
		c1.main();
		c1.name();
		System.out.println("Im Playboy" );
		System.out.println(a);
		
		
		

	}



}
