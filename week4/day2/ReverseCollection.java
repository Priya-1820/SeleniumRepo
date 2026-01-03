package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {

	public static void main(String[] args) 
	{
		String[] Companyname = {"HCL, Wipro, Aspire Systems, CTS"};//declare the string array
		List<String> list = new ArrayList<>();
		//List<String> list1 = new ArrayList<String>(Arrays.asList("CVT", "A")); //adding multiple items to the list
		list.add("HCL"); //adding the items to the list
		list.add("Wipro");
		list.add("Aspire Systems");
		list.add("CTS");
		System.out.println(list);
		Collections.sort(list);//sorting the list in ascending order
		//iterate the values in the list, we require size method.
		for (int i = list.size()-1;i>= 0;  i--) 
		{
			System.out.println(list.get(i));
		}
		
		// 
		

	}

}
