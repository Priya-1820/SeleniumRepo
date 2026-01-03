package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,10,6,8}; //index starts with 0 Index: 0 1, 2, 3, 4, 5,6 value// 1, 2, 3, 4, 10, 6, 8 , 
		
		//List<Integer> list = new ArrayList<>();
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,10,6,8));//we can add numbers in the list like this as well
		/*list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(10);
		list1.add(6);
		list1.add(8);*/
		
		Collections.sort(numbers);//arrange the numbers in ascending order
		System.out.println(numbers);
		
		//Inside the loop  
	 //
		for (int i = 0; i < numbers.size()-1; i++) //7-1=6 //i<6
		{
			int current = numbers.get(i);//iteration 0-> current->1, next-> 2, iteration 1-> cuurent->2, next 3// numbers.get(i)->retrieves the element at index i & stored at current variable
            int next = numbers.get(i + 1);//i + 1 means the next position in the list
            
            if(current + 1 != next) //check the current element + 1 is not equal to the next element. This comparison checks if there is a gap in the sequence of numbers
            {
                // Print all missing numbers in the gap
                for (int missingnum = current + 1; missingnum < next; missingnum++) 	
                {
                    System.out.println("Missing number: " + missingnum);
                }
		

	//
	}
}
	}
}


