package prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.print.attribute.standard.Finishings;

public class ArrangePosiNeg {

	/**
	 * @param args
	 */
	static int a[]={-1 ,-5, 5, 9, -3, 6, -2, -2, -5, 9, 2, 5, -1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Arrays.asList(a);
		List<Integer> postL=new ArrayList<Integer>();
		List<Integer> negL=new ArrayList<Integer>();
		List<Integer> finL=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			//System.out.print(","+a[i]);
			if(a[i]>0)
			{
				postL.add(a[i]);
			}
			else
			{
				negL.add(a[i]);
			}
				
		}
		finL.addAll(negL) ;
		finL.addAll(postL) ;
		for(int i=0;i<finL.size();i++)
		{
			a[i]=finL.get(i);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(","+a[i]);
		}
		

	}

}
