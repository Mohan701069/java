
public class string {
	//String  s1 = "mohan";
	

	public static void main(String[] args) {
		String s1="mohan";
		String s2=new String("mohan");
		String s3="mohan";
		String s4= new String("mohan");
		String s5=new String("mohan");
		System.out.println(s1.hashCode());
		 s1="arun";
		 
		 s1="mohan";
			System.out.println(s1.hashCode());
		 
		//System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		
		
		
		
		
		
		
	}


}
