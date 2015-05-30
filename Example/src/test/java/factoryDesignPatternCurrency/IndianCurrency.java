package factoryDesignPatternCurrency;

public class IndianCurrency implements Currency
{
	
	@Override
	public String getName()
	{
		return "Rupee";
	}
	
	@Override
	public String getSymbol()
	{
		return "Rs.";
	}

}
