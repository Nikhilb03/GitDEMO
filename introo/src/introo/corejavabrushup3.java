package introo;

public class corejavabrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// string is an object that represents sequence of character // two ways to declare
		// 1.string literal - only one object created when one value same
		String s1 = "Rahul shetty academy";
		// 2.new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");

		String s = "Rahul shetty academy";
		String[] splittedstring = s.split("shetty"); // spilt string is white space and can change by putting word like
														// shetty
		// array- multiple string -here 3
		// System.out.println(splittedstring[0]);
		// System.out.println(splittedstring[1]);
		// System.out.println(splittedstring[2]);
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1].trim());
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		// famous Q- how to print in reverse character
		// for (int i =s.length()-1;i>=0;i--)
	}

}
