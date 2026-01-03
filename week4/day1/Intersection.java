package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Intersection {

	public static void main(String[] args) 
	{
		// added the below values in the array
		
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		//aading the integers in the list
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		
		System.out.println(list2);
		
		
		/**Iterate the values through the length of the list*/
		
		for (int i = 0; i<arr1.length; i++) //arr1.length-> gives the size of the array --6
		 {
		     if(arr1[i] ==arr2[i]) /**Use an appropriate conditional statement to compare the values*/
		     {
		    	 System.out.println(arr1[i]);
		    	    
		     }//
		 }
	}
}

	

