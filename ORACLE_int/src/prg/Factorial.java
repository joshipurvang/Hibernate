package prg;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Factorial ==>"+Factorial.factorial(5));
		System.out.println("Factorial Rec ==>"+Factorial.factorialRec(4));

	}
	public static int factorialRec(int num)
	{
		if (num==0)
		{
			return 1;
		}
		else
		{
			
			return num*factorialRec(num-1);
		}
	}
	public  static int factorial(int num)
	{
		int factorial=1;
		
		for(int i=1;i<=num;i++ )
		{
			
			factorial=factorial*i;
		}
		
		return factorial;
				
	}

}
