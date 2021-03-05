package enums;

public enum Hunderasse 
{
	DACKEL(0.5), COLLIE(1.0), DOGGE(1.5);
	double maxGroesse;
	
	Hunderasse(double maxGroesse)
	{
		this.maxGroesse = maxGroesse;
	}
	
	@Override
	public String toString() 
	{
		return super.toString().substring(0, 1) + super.toString().toLowerCase().substring(1) + ", max. Groesse: " + this.maxGroesse;
	}
}