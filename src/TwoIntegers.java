
public class TwoIntegers 
{
	private int integer1;
	private int integer2;

	public TwoIntegers()
	{
		integer1 = 0;
		integer2 = 0;
	}
	public TwoIntegers(int integer1, int integer2)
	{
		this.integer1 = integer1;
		this.integer2 = integer2;
	}
	public int getInterger1()
	{
		return integer1;
	}
	public void setInteger1(int integer1)
	{
		this.integer1 = integer1;
	}
	public int getInterger2()
	{
		return integer2;
	}
	public void setInteger2(int integer2)
	{
		this.integer2 = integer2;
	}
	public String Arithmetic()
	{
		int sum = integer1 + integer2;
		int diff = integer1 - integer2;
		int prod = integer1 * integer2;
		double quot = (double) integer1 / integer2;
		return    "The sum is " + sum + "." 
				+ "The difference is " + diff + ". " 
				+ "The product is " + prod + ". "
				+ "The quotient is " + quot + ". ";
	}
	public String Larger()
	{ 
		if(integer1 > integer2)
		{
			return "The larger number is " + integer1 + ".";
		}
		else if(integer1 < integer2)
		{
			return "The larger number is " + integer2 + ".";
		}
		else
		{
			return "There is no larger number";
		}
	}
	public boolean isEven()
	{
		if(integer1 + integer2 % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean Multiple()
	{
		if(integer1 % integer2 == 0)
		{
			return true;
		}
		else
		{ 
			return false;
		}	
	}
}