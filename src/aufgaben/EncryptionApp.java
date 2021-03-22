package aufgaben;

import encryption.*;
import random.*;


public class EncryptionApp
{	
	public static void main(String[] args)
	{
		Caesar c = new Caesar(8);
		String s = "Mein Name ist Melissa.";
		System.out.println(s = c.encrypt(s));
		System.out.println(c.decrypt(s));
		int error = 0;
		for (int i = 0; i < 100000; i++)
		{
			int key = RandomGenerator.getRandomNumber(-1000, 1000);
			if (!c.decrypt(c.encrypt(s, key), key).equals(s))
			{
				error++;
				System.out.println("---------");
				System.out.println(i + ":");
				System.out.println(key);
				System.out.println(c.encrypt(s, key));
				System.out.println(c.decrypt(c.encrypt(s, key), key));
			}
		}
		System.out.println(error);
	}
}