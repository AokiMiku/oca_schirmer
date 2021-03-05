package enums;

public enum Kaffeesorte 
{
	KAFFEE(Muenze.EURO1), CAPPUCCINO(Muenze.EURO1, Muenze.CENT20), ESPRESSO(Muenze.EURO1, Muenze.CENT10, Muenze.CENT2, Muenze.CENT1);
	
	Muenze[] muenzen; 
	
	private Kaffeesorte(Muenze... muenzen) 
	{
		this.muenzen = muenzen;
	}
	
	@Override
	public String toString() 
	{
		return super.toString().substring(0, 1) + super.toString().toLowerCase().substring(1) + " (" + this.getWert() + ")";
	}
	
	public String getWert()
	{
		
		return String.format("%,.2f", this.getWertInCent() / 100.) + " Euro";
	}
	
	public int getWertInCent()
	{
		int wertInCent = 0;
		for (int i = 0; i < muenzen.length; i++) 
		{
			wertInCent += muenzen[i].wertInCent;
		}
		return wertInCent;
	}
}