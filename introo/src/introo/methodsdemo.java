package introo;

public class methodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using object- here d-  only you can access methods in class
		//can be done without object- public static String getData()- then get directly linked to class
		methodsdemo d = new methodsdemo();
		String name = d.getData();
		System.out.println(name);
		
		getData2();
		}
	//why method- some line of code can be reused then METHOD
	//and outside above main block you write method
	
	public String getData()
	{
		System.out.println ("hello world");
		return "rahul shetty";
	}
	//can be done without object- public static String getData()- then get directly linked to class
	public static String getData2()
	{
		System.out.println ("hello world");
		return "rahul shetty";
	}
}
