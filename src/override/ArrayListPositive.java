package override;

import java.util.ArrayList;

public class ArrayListPositive extends ArrayList<Integer> 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4230328735865608987L;
	
	@Override
	public boolean add(Integer value) throws NullArgumentException, NotPositiveArgumentException
	{
		this.check(value);
		return super.add(value);
	}
	
	@Override
	public void add(int index, Integer value) throws NullArgumentException, NotPositiveArgumentException 
	{
		this.check(value);
		super.add(index, value);
	}
	
	private void check(Integer value) throws NullArgumentException, NotPositiveArgumentException
	{
		if (value == null)
		{
			throw new NullArgumentException(String.format("Argument must not be null"));
		}
		
		if (value <= 0)
		{
			throw new NotPositiveArgumentException("Argument must not equals to or lower than zero: " + value);
		}
	}
}