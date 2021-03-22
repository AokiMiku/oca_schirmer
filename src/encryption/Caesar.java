package encryption;

import java.util.ArrayList;
import java.util.Arrays;

public class Caesar
{
	private int key;
	private ArrayList<Character> noEncryptChars;
	
	public Caesar(int key)
	{
		this.key = key;
		this.noEncryptChars = new ArrayList<>(Arrays.asList(new Character[] { ' ', '-', '.', ',', '!', '?' }));
	}
	
	public String encrypt(String s)
	{
		return this.encrypt(s, this.key);
	}
	
	public String encrypt(String s, int key)
	{
		while (key > 26)
		{
			key -= 26;
		}
		while (key < -26)
		{
			key += 26;
		}
		
		String encrypt = "";
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (this.noEncryptChars.contains(c))
			{
				encrypt += c;
			}
			else 
			{
				int idx = c + key;
				if (idx > 'z' || (c < 'a' && idx > 'Z'))
				{
					idx -= 26;
				}
				else if (idx < 'A' || (c > 'Z' && idx < 'a'))
				{
					idx += 26;
				}
				
				encrypt += (char) idx;
			}
		}
		
		return encrypt;
	}
	
	public String decrypt(String s)
	{
		return this.decrypt(s, this.key);
	}
	
	public String decrypt(String s, int key)
	{
		return this.encrypt(s, key * -1);
	}
}