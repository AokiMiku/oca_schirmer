package enums;

public enum Muenze 
{
	CENT1(1), CENT2(2), CENT5(5), CENT10(10), CENT20(20), CENT50(50), EURO1(100), EURO2(200);
	
	public int wertInCent;
	
	Muenze(int wertInCent)
	{
		this.wertInCent = wertInCent;
	}
	
	@Override
	public String toString() 
	{
		String toString = "";
		
		switch (this) 
		{
			case CENT1:
			case CENT2:
			case CENT5:
			case CENT10:
			case CENT20:
			case CENT50:
				toString += this.wertInCent + " Cent";
				break;
			case EURO1:
			case EURO2:
				toString += String.format("%,.2f", this.wertInCent / 100.) + " Euro";
			default:
				break;
		}
		
		return toString;
	}
}