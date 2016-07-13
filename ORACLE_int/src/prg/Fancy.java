package prg;

public class Fancy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Same Digit===>"+Fancy.sameDigit("333333"));
		System.out.println("Sequence Digit===>"+Fancy.sequenceNum("01230"));
		System.out.println("Start END Digit===>"+Fancy.startEnd("0123"));
		System.out.println("Palindrom String===>"+Fancy.palindromString("01233210"));
		System.out.println("Palindrom Int===>"+Fancy.palindromInt(0123321));
	}
	public static boolean palindromInt(int num)
	{
		int revnum=0;
		int newNum=num;
		while (num !=0)
		{
			revnum=(revnum*10);
			revnum=revnum+(num%10);
			num=num/10;
					
		}
		
		if(newNum==revnum)
			return true;
		return false;
	}
	public static boolean palindromString(String num)
	{
		String revNum="";
		for(int i=num.length()-1;i>=0;i--)
		{
			revNum=revNum+num.charAt(i);
		}
		if(num.equalsIgnoreCase(revNum))
			return true;
		return false;
	}
	public static boolean startEnd(String num)
	{
			int length=num.length();
		
			if(num.charAt(0)!=num.charAt(length-1))
			{
				return false;
			}
		
		return true;
	
	}
	public static boolean sequenceNum(String num)
	{
		for(int i =0;i<num.length()-1;i++)
		{
			int val1=Character.getNumericValue(num.charAt(i));
			val1=val1+1;
			int val2=Character.getNumericValue(num.charAt(i+1));
			if(val2!=val1)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean sameDigit(String num)
	{
		int length=num.length();
		for(int i =0;i<num.length()-1;i++)
		{
			if(num.charAt(i)!=num.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}

}
