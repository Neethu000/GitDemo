
public class Corejava {

	public static void main(String[] args) {

		//variables and data types
		int mynum = 10;
		char letter = 'p';
		double dec = 6.666;
		boolean mycard = true;
		String website = "Real Returns";
		
		System.out.println(mynum+"is the varialbe stored in the mynum variable");
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(mycard);
		System.out.println(website);
		
		//Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		//another way assigning
		int[] arr1 = {1,2,3,4,5};
		System.out.println(arr1[4]);
		
		//for loop - arr.length is 5
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] name = {"Priya","Sateesh","Sahith","Sudheer"};
		for (int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		//Enhanced for loop declaration 
		for (String s: name)
		{
			System.out.println(s);
		}
		
		
	}

}
