package override;

public class NullArgumentException extends RuntimeException 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 292287553944451123L;
	
	public NullArgumentException() { }
	public NullArgumentException(String message)
	{
		super(message);
	}
}