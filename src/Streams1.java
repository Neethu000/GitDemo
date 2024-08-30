import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streams1 {
 
	//count the number of names starting with alphabet A in list
	@Test
	public void regular()
	{
      ArrayList<String> names= new ArrayList<String>();
      names.add("Sateesh");
      names.add("Apurupa");
      names.add("Priya");
      names.add("Anitha");
      names.add("Neethu");
      int count=0;
      for(int i=0;i<names.size();i++)
      { 
    	  String actual =names.get(i);
    	  if(actual.startsWith("A"))
    	  {
    		  count++;
    	  } 
      }
      
      System.out.println(count);
	}
	@Test
	public void streamFilter()
	{
      ArrayList<String> names= new ArrayList<String>();
      names.add("Sateesh");
      names.add("Apurupa");
      names.add("Priya");
      names.add("Anitha");
      names.add("Neethu");
      
      Long c = names.stream().filter(s->s.startsWith("A")).count();
      System.out.println(c);
    
	
	long d = Stream.of("Sateesh","Apurupa","Priya","Anitha","Neethu").filter(s->
	{
		s.startsWith("A");
	    return true;
	}).count();
	 System.out.println(d);
	 //print all the names in the arrayList
	 //names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	 names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	 
	}
	@Test
	public void streamMap()
	{
		
		//print the last letter as "a" with uppercase
		Stream.of("Sateesh","Apurupa","Priya","Anitha","Neethu").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//print the names with have first letter as "a" with uppercase and sorted
		List<String>names=Arrays.asList("Sateesh","Apurupa","Priya","Anitha","Neethu");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	@Test
	public void marge()
	{
		//merge two ArrayLists
		 ArrayList<String> names= new ArrayList<String>();
	      names.add("Sahith");
	      names.add("Vinesh");
	      names.add("Mani");
	      names.add("Sudeer");
	     
	      
	      List<String>names1=Arrays.asList("Sateesh","Apurupa","Priya","Anitha","Neethu");
	      names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	      
	}
	
 }
