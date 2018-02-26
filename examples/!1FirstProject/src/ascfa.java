
public class ascfa {
	public double Element(double x, double a)
	{
		double d =0;
		if(x>=0)
		{
			if(a >=x)
			{
				d = 1+Math.pow(x, a);			}
			else
			{
				d = 1+Math.sqrt(x-a);
			}
		}
		else
		{
			System.out.println("Error!");
		}
		return firstpart(x)+d;
	}
	
	public double firstpart(double x)
	{
		return (1+Math.sqrt(x))/(Math.pow((1+Math.sqrt(x)), 2));
	}
	
}
