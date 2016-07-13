package prg;

public class PrimeNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime num==>"+PrimeNo.primeNo(55));
	}
	
	public static boolean primeNo(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
		
	}

}
