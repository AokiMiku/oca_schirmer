package override;

public class NotPositiveArgumentException extends RuntimeException 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 292287553944451123L;
	
	public NotPositiveArgumentException() { }
	public NotPositiveArgumentException(String message)
	{
		super(message);
	}
}