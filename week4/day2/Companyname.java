package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Companyname {

	public static void main(String[] args) 
	{
		String companyname = "google";
		char[] charArray = companyname.toCharArray();
		
		Set<Character> company=new LinkedHashSet<Character>();
		
		for(int i=0;i<charArray.length;i++)
		{
			boolean b = company.add(charArray[i]);
		}
        System.out.println(company);
	}

}


	


