package synchronisation;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
public class sect14JAVAstreams {
	//with java streams below code can be written in one line
	
	//count the number of names starting with alphabet A in the list
	@Test //imp to mention to run test
	public void regular()
	{
	ArrayList<String>names=new ArrayList<String>(); //creating object for class arraylist- object names
	names.add("Abhijeet");
	names.add("Don");
	names.add("Alekhya");
	names.add("Adam");
	names.add("Ram");
	//int count=0;// imp, otherwise error
	//for(int i=0; i<names.size();i++)// here size for above numbers- that is 5
	//{String actual = names.get(i);
	//if(actual.startsWith("A"))
	//   {count++;}}
	//System.out.println("count");
	
	//now using stream- above whole code can be written in one line
	Long c= names.stream().filter(s->s.startsWith("A")).count();//grabbing all in variable c
	System.out.println(c);
	}
}
