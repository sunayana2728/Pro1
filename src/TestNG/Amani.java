package TestNG;

public class Amani {

	
		int age=420;
		String name="Bablu is ";
		int rollno= 17;
		
		public void sleep(){
			System.out.println(" norumusukoni paduko");
		}
		public void read(){
			System.out.println(" ni emails chaduvuko bey");
		}
		public static void main(String[] args){
			Amani c=new Amani();
			System.out.println(c.name+c.age);
			c.read();
			c.sleep();
		    
	}
}
