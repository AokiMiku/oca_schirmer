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
//		ar.add(-12);
//		ar.add(0);
//		ar.add(Integer.MIN_VALUE);
//		ar.add(Long.MAX_VALUE);
		System.out.println(Arrays.toString(ar.toArray()));
	}
}