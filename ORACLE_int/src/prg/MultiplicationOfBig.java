package prg;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MultiplicationOfBig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger b1=new  BigInteger("555555555555555555555555");
		BigInteger b2=new  BigInteger("100000000000000000000000");
		BigInteger b3=b1.multiply(b2);
		System.out.println(b3);

	}

}
