package aufgaben;

import java.util.Arrays;

import override.*;

public class Aufgabe01 
{
	public static void main(String[] args) 
	{
		ArrayListPositive ar = new ArrayListPositive();
		
		ar.add(42);
		ar.add(12);
		ar.add(23);
		try 
		{
			ar.add(-12);
		} 
		catch (NullArgumentException | NotPositiveArgumentException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			ar.add(0);
		} 
		catch (NullArgumentException | NotPositiveArgumentException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			ar.add(Integer.MIN_VALUE);
		} 
		catch (NullArgumentException | NotPositiveArgumentException e) 
		{
			e.printStackTrace();
		}
//		ar.add(Long.MAX_VALUE);
		
		System.out.println(Arrays.toString(ar.toArray()));
	}
}