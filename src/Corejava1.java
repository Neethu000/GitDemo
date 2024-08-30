import java.util.ArrayList;

public class Corejava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,5,4,6,7,8,9,10,122};
        //multiply by 2 output is 2,4,6,8,10,122
		
	    for(int i=0;i<arr1.length;i++)
	    {
	        if(arr1[i] % 2==0)
	        {
	        	System.out.println(arr1[i]);
	        	break;
	        }
	        else
	        {
	        	System.out.println(arr1[i]+ "is not multipled by 2");
	        }
	    }
	    //ArrayList
	    //create object of the class - object.method
	    ArrayList<String> a = new ArrayList<String>();
	    a.add("Priya");
	    a.add("Sateesh");
	    a.add("Sahith");
	    a.add("Sudheer");
	    //a.remove(3);
	    System.out.println(a);
	    //Extract the value using get method
	    System.out.println(a.get(3));
	    
	    for (int i=0;i<a.size();i++)
	    {
	    	System.out.println(a.get(i));
	    }
	    //Enhanced for loop declaration on ArrayList
	    for (String val:a)
	    {
	    	System.out.println(val);
	    }
	   //item is present in ArrayList
	    System.out.println(a.contains("Sateesh"));
	    
	  		
	}

}
