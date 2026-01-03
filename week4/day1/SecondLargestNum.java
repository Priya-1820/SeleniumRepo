package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNum {

	public static void main(String[] args)
	{
		
		int[] arr1 = {3, 2, 11, 4, 6, 7}; 
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		
		Collections.sort(list);//sorts the list in the ascending order
		
		System.out.println(list);
		
		
		int secondlargest = list.get(list.size()-2);//gives the index of the second largest number
		
		
		System.out.println(secondlargest);

	}

}
